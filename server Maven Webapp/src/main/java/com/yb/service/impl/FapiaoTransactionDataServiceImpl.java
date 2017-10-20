package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.FapiaoTransactionDataDao;
import com.yb.entity.FapiaoTransactionData;
import com.yb.service.FapiaoTransactionDataService;

@Service
@Transactional
public class FapiaoTransactionDataServiceImpl implements FapiaoTransactionDataService{

	@Autowired
	private FapiaoTransactionDataDao fapiaoTransactionDataDao;
	
	@Override
	public void insert(List<FapiaoTransactionData> list) {
		// TODO Auto-generated method stub
		fapiaoTransactionDataDao.insert(list);
	}
	
}
