package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.CdrawgradeHistoryDao;
import com.yb.entity.CdrawgradeHistory;
import com.yb.service.CdrawgradeHistoryService;

@Service
@Transactional
public class CdrawgradeHistoryServiceImpl implements CdrawgradeHistoryService{
	@Autowired
	private CdrawgradeHistoryDao cdrawgradeHistoryDao;
	@Override
	public void insert(List<CdrawgradeHistory> list) {
		// TODO Auto-generated method stub
		cdrawgradeHistoryDao.insert(list);
	}
	
}
