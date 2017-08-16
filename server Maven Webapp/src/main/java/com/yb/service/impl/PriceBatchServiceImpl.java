package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.PriceBatchDao;
import com.yb.entity.PriceBatch;
import com.yb.service.PriceBatchService;

@Service
@Transactional
public class PriceBatchServiceImpl implements PriceBatchService{

	@Autowired
	private PriceBatchDao priceBatchDao;
	@Override
	public void insert(List<PriceBatch> list) {
		// TODO Auto-generated method stub
		priceBatchDao.insert(list);
	}
	
}
