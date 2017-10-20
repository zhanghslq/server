package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.HoseHistoryDao;
import com.yb.entity.HoseHistory;
import com.yb.service.HoseHistoryService;

@Service
@Transactional
public class HoseHistoryServiceImpl implements HoseHistoryService{

	@Autowired
	private HoseHistoryDao hoseHistoryDao;
	@Override
	public void insert(List<HoseHistory> list) {
		// TODO Auto-generated method stub
		hoseHistoryDao.insert(list);
	}
	
}
