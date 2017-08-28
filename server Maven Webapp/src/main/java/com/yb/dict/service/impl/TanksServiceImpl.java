package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.TanksDao;
import com.yb.dict.entity.Tanks;
import com.yb.dict.service.TanksService;

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
