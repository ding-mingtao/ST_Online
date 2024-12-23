package com.dao;

import com.entity.JiudianOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiudianOrderView;

/**
 * 酒店订单 Dao 接口
 *
 * @author 
 * @since
 */
public interface JiudianOrderDao extends BaseMapper<JiudianOrderEntity> {

   List<JiudianOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
