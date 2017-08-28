package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.DictTradeTypeDao;
import com.yb.dict.entity.DictTradeType;
import com.yb.dict.service.DictTradeTypeService;
@Service
@Transactional
public class DictTradeTypeServiceImpl implements DictTradeTypeService{

	@Autowired
	private DictTradeTypeDao dao;
	@Override
	public void insert(List<DictTradeType> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
