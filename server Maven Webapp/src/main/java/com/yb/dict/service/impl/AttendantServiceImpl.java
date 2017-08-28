package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.AttendantDao;
import com.yb.dict.entity.Attendant;
import com.yb.dict.service.AttendantService;

@Service
@Transactional
public class AttendantServiceImpl implements AttendantService{

	@Autowired
	private AttendantDao attendantDao;
	@Override
	public void insert(List<Attendant> list) {
		// TODO Auto-generated method stub
		attendantDao.insert(list);
	}

}
