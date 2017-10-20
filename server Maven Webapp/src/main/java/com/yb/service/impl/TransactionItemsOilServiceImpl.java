package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TransactionItemsOilDao;
import com.yb.entity.TransactionItemsOil;
import com.yb.service.TransactionItemsOilService;

@Service
@Transactional
public class TransactionItemsOilServiceImpl implements TransactionItemsOilService{

	@Autowired
	private TransactionItemsOilDao transactionItemsOilDao;
	@Override
	public void insert(List<TransactionItemsOil> list) {
		// TODO Auto-generated method stub
		transactionItemsOilDao.insert(list);
	}
	
}
