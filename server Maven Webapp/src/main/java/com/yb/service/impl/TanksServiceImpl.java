package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TanksDao;
import com.yb.entity.Tanks;
import com.yb.service.TanksService;

@Service
@Transactional
public class TanksServiceImpl implements TanksService{

	@Autowired
	private TanksDao tanksDao;
	@Override
	public void insert(List<Tanks> list) {
		// TODO Auto-generated method stub
		tanksDao.insert(list);
	}

}
