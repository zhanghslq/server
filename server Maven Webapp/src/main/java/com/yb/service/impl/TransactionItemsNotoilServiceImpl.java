package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TransactionItemsNotoilDao;
import com.yb.entity.TransactionItemsNotoil;
import com.yb.service.TransactionItemsNotoilService;

@Service
@Transactional
public class TransactionItemsNotoilServiceImpl implements TransactionItemsNotoilService{

	@Autowired
	private TransactionItemsNotoilDao transactionItemsNotoilDao;
	@Override
	public void insert(List<TransactionItemsNotoil> list) {
		// TODO Auto-generated method stub
		transactionItemsNotoilDao.insert(list);
	}
	
}
