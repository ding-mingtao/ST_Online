package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingdianEntity;
import java.util.Map;

/**
 * 景点 服务类
 * @author 
 * @since
 */
public interface JingdianService extends IService<JingdianEntity> {

     PageUtils queryPage(Map<String, Object> params );
}