package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.DictTradeTypeDao;
import com.yb.entity.DictTradeType;
import com.yb.service.DictTradeTypeService;
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
