package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.CashdrawHistoryDao;
import com.yb.entity.CashdrawHistory;
import com.yb.service.CashdrawHistoryService;

@Service
@Transactional
public class CashdrawHistoryServiceImpl  implements CashdrawHistoryService{

	@Autowired
	private CashdrawHistoryDao cashdrawHistoryDao;
	
	@Override
	public void insert(List<CashdrawHistory> list) {
		// TODO Auto-generated method stub
		cashdrawHistoryDao.insert(list);
	}
	
}
