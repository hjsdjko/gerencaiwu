package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.HuandaizhushouDao;
import com.entity.HuandaizhushouEntity;
import com.service.HuandaizhushouService;
import com.entity.view.HuandaizhushouView;

/**
 * 还贷助手 服务实现类
 */
@Service("huandaizhushouService")
@Transactional
public class HuandaizhushouServiceImpl extends ServiceImpl<HuandaizhushouDao, HuandaizhushouEntity> implements HuandaizhushouService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<HuandaizhushouView> page =new Query<HuandaizhushouView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
