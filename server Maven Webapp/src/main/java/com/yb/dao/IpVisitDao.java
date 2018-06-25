package com.yb.dao;

import org.apache.ibatis.annotations.Param;

public interface IpVisitDao {
	public void insert(String name);
	public void insertUpdate(@Param("name")String name,@Param("message")Integer message);
}
