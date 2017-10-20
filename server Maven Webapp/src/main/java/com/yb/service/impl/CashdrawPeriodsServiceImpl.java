package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.CashdrawPeriodsDao;
import com.yb.entity.CashdrawPeriods;
import com.yb.service.CashdrawPeriodsService;

@Service
@Transactional
public class CashdrawPeriodsServiceImpl implements CashdrawPeriodsService{

	@Autowired
	private CashdrawPeriodsDao cashdrawPeriodsDao;
	@Override
	public void insert(List<CashdrawPeriods> list) {
		// TODO Auto-generated method stub
		cashdrawPeriodsDao.insert(list);
	}
	
}
