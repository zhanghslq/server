package com.yb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yb.entity.TblTrade;

public interface TblTradeDao{//分页查询
	
	//分页查询的语句，分页查 的话，io占用多，效率低，可以两者结合
	List<TblTrade> queryAll(@Param("min")Long min,@Param("max")Long max);
	Long queryMaxId();
	Long queryMinId();
}
