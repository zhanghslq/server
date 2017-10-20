package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TankHistoryDao;
import com.yb.entity.TankHistory;
import com.yb.service.TankHistoryService;

@Service
@Transactional
public class TankHistoryServiceImpl implements TankHistoryService{

	@Autowired
	private TankHistoryDao tankHistoryDao;
	@Override
	public void insert(List<TankHistory> list) {
		// TODO Auto-generated method stub
		tankHistoryDao.insert(list);
	}
	
}
