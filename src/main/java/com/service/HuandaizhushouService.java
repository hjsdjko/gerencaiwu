package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuandaizhushouEntity;
import java.util.Map;

/**
 * 还贷助手 服务类
 */
public interface HuandaizhushouService extends IService<HuandaizhushouEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}