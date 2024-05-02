package com.dao;

import com.entity.HuandaizhushouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuandaizhushouView;

/**
 * 还贷助手 Dao 接口
 *
 * @author 
 */
public interface HuandaizhushouDao extends BaseMapper<HuandaizhushouEntity> {

   List<HuandaizhushouView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
