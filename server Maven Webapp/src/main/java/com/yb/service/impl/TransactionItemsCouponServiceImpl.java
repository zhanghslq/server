package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TransactionItemsCouponDao;
import com.yb.entity.TransactionItemsCoupon;
import com.yb.service.TransactionItemsCouponService;

@Service
@Transactional
public class TransactionItemsCouponServiceImpl implements TransactionItemsCouponService{

	@Autowired
	private TransactionItemsCouponDao transactionItemsCouponDao;
	@Override
	public void insert(List<TransactionItemsCoupon> list) {
		// TODO Auto-generated method stub
		transactionItemsCouponDao.insert(list);
	}
	
}
