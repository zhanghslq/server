package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.CashiersDao;
import com.yb.entity.Cashiers;
import com.yb.service.CashiersService;
@Service
@Transactional
public class CashiersServiceImpl implements CashiersService{

	@Autowired
	private CashiersDao cashiersDao;
	
	@Override
	public void insert(List<Cashiers> list) {
		// TODO Auto-generated method stub
		cashiersDao.insert(list);
	}

}
