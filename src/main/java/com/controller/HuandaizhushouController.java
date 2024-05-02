package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.HuandaizhushouEntity;

import com.service.HuandaizhushouService;
import com.entity.view.HuandaizhushouView;
import com.service.XueshengService;
import com.entity.XueshengEntity;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 还贷助手
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/huandaizhushou")
public class HuandaizhushouController {
    private static final Logger logger = LoggerFactory.getLogger(HuandaizhushouController.class);

    @Autowired
    private HuandaizhushouService huandaizhushouService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private XueshengService xueshengService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("学生".equals(role))
            params.put("xueshengId",request.getSession().getAttribute("userId"));
        params.put("orderBy","id");
        PageUtils page = huandaizhushouService.queryPage(params);

        //字典表数据转换
        List<HuandaizhushouView> list =(List<HuandaizhushouView>)page.getList();
        for(HuandaizhushouView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        HuandaizhushouEntity huandaizhushou = huandaizhushouService.selectById(id);
        if(huandaizhushou !=null){
            //entity转view
            HuandaizhushouView view = new HuandaizhushouView();
            BeanUtils.copyProperties( huandaizhushou , view );//把实体数据重构到view中

            //级联表
            XueshengEntity xuesheng = xueshengService.selectById(huandaizhushou.getXueshengId());
            if(xuesheng != null){
                BeanUtils.copyProperties( xuesheng , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setXueshengId(xuesheng.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody HuandaizhushouEntity huandaizhushou, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,huandaizhushou:{}",this.getClass().getName(),huandaizhushou.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("学生".equals(role))
            huandaizhushou.setXueshengId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        Wrapper<HuandaizhushouEntity> queryWrapper = new EntityWrapper<HuandaizhushouEntity>()
            .eq("xuesheng_id", huandaizhushou.getXueshengId())
            .eq("huandaizhushou_name", huandaizhushou.getHuandaizhushouName())
            .eq("huandaizhushou_number", huandaizhushou.getHuandaizhushouNumber())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        HuandaizhushouEntity huandaizhushouEntity = huandaizhushouService.selectOne(queryWrapper);
        if(huandaizhushouEntity==null){
            huandaizhushou.setInsertTime(new Date());
            huandaizhushou.setCreateTime(new Date());
            huandaizhushouService.insert(huandaizhushou);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody HuandaizhushouEntity huandaizhushou, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,huandaizhushou:{}",this.getClass().getName(),huandaizhushou.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("学生".equals(role))
            huandaizhushou.setXueshengId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<HuandaizhushouEntity> queryWrapper = new EntityWrapper<HuandaizhushouEntity>()
            .notIn("id",huandaizhushou.getId())
            .andNew()
            .eq("xuesheng_id", huandaizhushou.getXueshengId())
            .eq("huandaizhushou_name", huandaizhushou.getHuandaizhushouName())
            .eq("huandaizhushou_number", huandaizhushou.getHuandaizhushouNumber())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        HuandaizhushouEntity huandaizhushouEntity = huandaizhushouService.selectOne(queryWrapper);
        if(huandaizhushouEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      huandaizhushou.set
            //  }
            huandaizhushouService.updateById(huandaizhushou);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        huandaizhushouService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }






}

