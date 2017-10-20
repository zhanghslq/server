package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.HoseDeliveryDao;
import com.yb.entity.HoseDelivery;
import com.yb.service.HoseDeliveryService;

@Service
@Transactional
public class HoseDeliveryServiceImpl implements HoseDeliveryService{

	@Autowired
	private HoseDeliveryDao hoseDeliveryDao;
	@Override
	public void insert(List<HoseDelivery> list) {
		// TODO Auto-generated method stub
		hoseDeliveryDao.insert(list);
	}
	
}
