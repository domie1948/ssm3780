package com.dao;

import com.entity.CheweiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CheweiCollectionView;

/**
 * 车位收藏 Dao 接口
 *
 * @author 
 * @since 2021-04-29
 */
public interface CheweiCollectionDao extends BaseMapper<CheweiCollectionEntity> {

   List<CheweiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
