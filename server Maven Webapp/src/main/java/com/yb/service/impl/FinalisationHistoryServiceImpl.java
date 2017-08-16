package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.FinalisationHistoryDao;
import com.yb.entity.FinalisationHistory;
import com.yb.service.FinalisationHistoryService;

@Service
@Transactional
public class FinalisationHistoryServiceImpl implements FinalisationHistoryService {

	@Autowired
	private FinalisationHistoryDao finalisationHistoryDao;
	@Override
	public void insert(List<FinalisationHistory> list) {
		// TODO Auto-generated method stub
		finalisationHistoryDao.insert(list);
	}
	
}
