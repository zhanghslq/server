package com.yb.dao;

import org.apache.ibatis.annotations.Param;

public interface UpdateDao {
	public String query(@Param("ip")String ip);
}
