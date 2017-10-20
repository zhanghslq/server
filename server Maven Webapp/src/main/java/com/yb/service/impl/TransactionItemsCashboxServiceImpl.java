package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TransactionItemsCashboxDao;
import com.yb.entity.TransactionItemsCashbox;
import com.yb.service.TransactionItemsCashboxService;

@Service
@Transactional
public class TransactionItemsCashboxServiceImpl implements TransactionItemsCashboxService{

	@Autowired
	private TransactionItemsCashboxDao transactionItemsCashboxDao;
	
	@Override
	public void insert(List<TransactionItemsCashbox> list) {
		// TODO Auto-generated method stub
		transactionItemsCashboxDao.insert(list);
	}
	
}
