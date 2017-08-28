package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.DictCustomerLevelDao;
import com.yb.dict.entity.DictCustomerLevel;
import com.yb.dict.service.DictCustomerLevelService;
@Service
@Transactional
public class DictCustomerLevelServiceImpl implements DictCustomerLevelService{

	@Autowired
	private DictCustomerLevelDao dao;
	@Override
	public void insert(List<DictCustomerLevel> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
