package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TaxHistoryDao;
import com.yb.entity.TaxHistory;
import com.yb.service.TaxHistoryService;

@Service
@Transactional
public class TaxHistoryServiceImpl implements TaxHistoryService{

	@Autowired
	private TaxHistoryDao taxHistoryDao;
	@Override
	public void insert(List<TaxHistory> list) {
		// TODO Auto-generated method stub
		taxHistoryDao.insert(list);
	}
	
}
