package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.PumpsDao;
import com.yb.entity.Pumps;
import com.yb.service.PumpsService;

@Service
@Transactional
public class PumpsServiceImpl implements PumpsService{

	@Autowired
	private PumpsDao pumpsDao;
	@Override
	public void insert(List<Pumps> list) {
		// TODO Auto-generated method stub
		pumpsDao.insert(list);
	}
	
}
