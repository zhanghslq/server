package com.yb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.HeartDao;
import com.yb.entity.Heart;
import com.yb.service.HeartService;

@Transactional
@Service
public class HeartServiceImpl implements HeartService{

	@Autowired
	private HeartDao heartDao;
	@Override
	public void insert(Heart heart) {
		// TODO Auto-generated method stub
		heartDao.insert(heart);
	}
	
}
