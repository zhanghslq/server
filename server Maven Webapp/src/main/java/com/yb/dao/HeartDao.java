package com.yb.dao;

import org.apache.ibatis.annotations.Param;

import com.yb.entity.Heart;

public interface HeartDao {
	public void insert(@Param("heart")Heart heart);
}
