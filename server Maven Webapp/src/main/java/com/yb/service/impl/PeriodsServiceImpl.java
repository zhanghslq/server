package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.PeriodsDao;
import com.yb.entity.Periods;
import com.yb.service.PeriodsService;

@Service
@Transactional
public class PeriodsServiceImpl implements PeriodsService {

	@Autowired
	private PeriodsDao periodsDao;
	@Override
	public void insert(List<Periods> list) {
		// TODO Auto-generated method stub
		periodsDao.insert(list);
	}
	
}
