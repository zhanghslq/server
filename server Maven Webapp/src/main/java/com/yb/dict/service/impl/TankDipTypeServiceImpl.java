package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.TankDipTypeDao;
import com.yb.dict.entity.TankDipType;
import com.yb.dict.service.TankDipTypeService;
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
