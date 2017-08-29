package com.yb.dao;

import java.util.List;

public interface DictBaseDao <T>{
	List<T> queryAll(Integer id);
	Integer queryMaxId();
}
