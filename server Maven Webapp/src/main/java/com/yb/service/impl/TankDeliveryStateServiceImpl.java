package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TankDeliveryStateDao;
import com.yb.entity.TankDeliveryState;
import com.yb.service.TankDeliveryStateService;
@Service
@Transactional
public class TankDeliveryStateServiceImpl implements TankDeliveryStateService{

	@Autowired
	private TankDeliveryStateDao tankDeliveryStateDao;
	@Override
	public void insert(List<TankDeliveryState> list) {
		// TODO Auto-generated method stub
		tankDeliveryStateDao.insert(list);
	}

}
