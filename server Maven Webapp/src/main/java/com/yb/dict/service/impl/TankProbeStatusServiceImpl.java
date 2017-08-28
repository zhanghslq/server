package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.TankProbeStatusDao;
import com.yb.dict.entity.TankProbeStatus;
import com.yb.dict.service.TankProbeStatusService;
@Service
@Transactional
public class TankProbeStatusServiceImpl implements TankProbeStatusService{

	@Autowired
	private TankProbeStatusDao tankProbeStatusDao;
	@Override
	public void insert(List<TankProbeStatus> list) {
		// TODO Auto-generated method stub
		tankProbeStatusDao.insert(list);
	}

}
