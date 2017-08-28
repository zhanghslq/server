package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.DictOrderDealDao;
import com.yb.dict.entity.DictOrderDeal;
import com.yb.dict.service.DictOrderDealService;
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
