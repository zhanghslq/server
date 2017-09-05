package com.yb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yb.entity.TblVirtualgoods;

public interface TblVirtualgoodsDao{
	List<TblVirtualgoods> queryAll(@Param("min")Long min,@Param("max")Long max);
	Long queryMaxId();
	Long queryMinId();
}
