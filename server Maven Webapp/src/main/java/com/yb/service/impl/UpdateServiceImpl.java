package com.yb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yb.dao.UpdateDao;
import com.yb.service.UpdateService;

@Service
public class UpdateServiceImpl implements UpdateService{

	@Autowired
	private UpdateDao updateDao;
	@Override
	public String query(String ip) {
		// TODO Auto-generated method stub
		String query = updateDao.query(ip);
		return query;
	}

}
