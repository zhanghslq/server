package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.CdrawtaxHistoryDao;
import com.yb.entity.CdrawtaxHistory;
import com.yb.service.CdrawtaxHistoryService;

@Service
@Transactional
public class CdrawtaxHistoryServiceImpl implements CdrawtaxHistoryService{

	@Autowired
	private CdrawtaxHistoryDao cdrawtaxHistoryDao;
	@Override
	public void insert(List<CdrawtaxHistory> list) {
		// TODO Auto-generated method stub
		cdrawtaxHistoryDao.insert(list);
	}
	
}
