package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TransactionItemsDao;
import com.yb.entity.TransactionItems;
import com.yb.service.TransactionItemsService;

@Service
@Transactional
public class TransactionItemsServiceImpl implements TransactionItemsService{

	@Autowired 
	private TransactionItemsDao transactionItemsDao;
	@Override
	public void insert(List<TransactionItems> list) {
		// TODO Auto-generated method stub
		transactionItemsDao.insert(list);
	}
	
}
