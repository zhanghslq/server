package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TankDipTypeDao;
import com.yb.entity.TankDipType;
import com.yb.service.TankDipTypeService;
@Service
@Transactional
public class TankDipTypeServiceImpl implements TankDipTypeService{

	@Autowired
	private TankDipTypeDao tankDipTypeDao;
	@Override
	public void insert(List<TankDipType> list) {
		// TODO Auto-generated method stub
		tankDipTypeDao.insert(list);
	}

}
