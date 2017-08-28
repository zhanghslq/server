package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.DictVirtualGoodsTypeDao;
import com.yb.dict.entity.DictVirtualGoodsType;
import com.yb.dict.service.DictVirtualGoodsTypeService;
@Service
@Transactional
public class DictVirtualGoodsTypeServiceImpl implements DictVirtualGoodsTypeService{

	@Autowired
	private DictVirtualGoodsTypeDao dao;
	@Override
	public void insert(List<DictVirtualGoodsType> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
