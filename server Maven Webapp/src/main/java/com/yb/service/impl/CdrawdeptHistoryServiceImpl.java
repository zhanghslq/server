package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.CdrawdeptHistoryDao;
import com.yb.entity.CdrawdeptHistory;
import com.yb.service.CdrawdeptHistoryService;

@Service
@Transactional
public class CdrawdeptHistoryServiceImpl implements CdrawdeptHistoryService{

	@Autowired
	private CdrawdeptHistoryDao cdrawdeptHistoryDao;
	@Override
	public void insert(List<CdrawdeptHistory> list) {
		// TODO Auto-generated method stub
		cdrawdeptHistoryDao.insert(list);
	}
	
}
