package com.yb.dict.dao;

import java.util.List;

public interface BaseDao <T>{
	void insert(List<T> list);
}
