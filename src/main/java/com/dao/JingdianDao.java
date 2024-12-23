package com.dao;

import com.entity.JingdianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JingdianView;

/**
 * 景点 Dao 接口
 */
public interface JingdianDao extends BaseMapper<JingdianEntity> {

   List<JingdianView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
