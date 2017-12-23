package com.yb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yb.entity.TblCarduser;

public interface TblCarduserDao{
	List<TblCarduser> queryAll(@Param("min")Long min,@Param("max")Long max);
	Long queryMinId();
}
