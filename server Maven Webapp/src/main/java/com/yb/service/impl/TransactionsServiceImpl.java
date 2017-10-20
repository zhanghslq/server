package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TransactionsDao;
import com.yb.entity.Transactions;
import com.yb.service.TransactionsService;

@Service
@Transactional
public class TransactionsServiceImpl implements TransactionsService{

	@Autowired
	private TransactionsDao transactionsDao;
	@Override
	public void insert(List<Transactions> list) {
		// TODO Auto-generated method stub
		transactionsDao.insert(list);
	}
	
}
