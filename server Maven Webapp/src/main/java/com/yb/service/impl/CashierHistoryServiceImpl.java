package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.CashierHistoryDao;
import com.yb.entity.CashierHistory;
import com.yb.service.CashierHistoryService;
@Service
@Transactional
public class CashierHistoryServiceImpl implements CashierHistoryService{

	@Autowired
	private CashierHistoryDao cashierHistoryDao;
	
	@Override
	public void insert(List<CashierHistory> list) {
		// TODO Auto-generated method stub
		cashierHistoryDao.insert(list);
	}
	
}
