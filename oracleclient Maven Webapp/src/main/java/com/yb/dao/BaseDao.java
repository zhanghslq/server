package com.yb.dao;

import java.util.List;


public interface BaseDao <T>{
	List<T> queryAll(Long id);
	Long queryMaxId();
}
