package com.dao;

import com.entity.JiudianLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiudianLiuyanView;

/**
 * 酒店留言 Dao 接口
 */
public interface JiudianLiuyanDao extends BaseMapper<JiudianLiuyanEntity> {

   List<JiudianLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
