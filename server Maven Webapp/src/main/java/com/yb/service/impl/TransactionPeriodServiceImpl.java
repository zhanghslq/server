package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.druid.filter.AutoLoad;
import com.yb.dao.TransactionPeriodDao;
import com.yb.entity.TransactionPeriod;
import com.yb.service.TransactionPeriodService;

@Service
@Transactional
public class TransactionPeriodServiceImpl implements TransactionPeriodService{

	@Autowired
	private TransactionPeriodDao transactionPeriodDao;
	@Override
	public void insert(List<TransactionPeriod> list) {
		// TODO Auto-generated method stub
		transactionPeriodDao.insert(list);
	}
	
}
