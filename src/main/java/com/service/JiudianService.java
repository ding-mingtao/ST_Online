package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiudianEntity;
import java.util.Map;

/**
 * 酒店 服务类
 * @author 
 * @since
 */
public interface JiudianService extends IService<JiudianEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}