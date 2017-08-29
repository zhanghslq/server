package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.DictOrderDealDao;
import com.yb.entity.DictOrderDeal;
import com.yb.service.DictOrderDealService;
@Service
@Transactional
public class DictOrderDealServiceImpl implements DictOrderDealService{

	@Autowired
	private DictOrderDealDao dao;
	@Override
	public void insert(List<DictOrderDeal> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
