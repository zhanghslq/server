package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TankProbeStatusDao;
import com.yb.entity.TankProbeStatus;
import com.yb.service.TankProbeStatusService;
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
