package com.yb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yb.entity.Pumps;

public interface PumpsDao {
	public void insert(@Param("list")List<Pumps> list);
}
