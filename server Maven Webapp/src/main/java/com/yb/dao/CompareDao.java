package com.yb.dao;

import java.util.List;

import com.yb.entity.Comparison;

public interface CompareDao {
	public void insert(List<Comparison> list);
	public void insertb(Comparison comparison);
}
