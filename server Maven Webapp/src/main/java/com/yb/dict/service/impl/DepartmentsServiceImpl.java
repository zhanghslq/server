package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.DepartmentsDao;
import com.yb.dict.entity.Departments;
import com.yb.dict.service.DepartmentsService;
@Service
@Transactional
public class DepartmentsServiceImpl implements DepartmentsService{

	@Autowired
	private DepartmentsDao departmentsDao;
	@Override
	public void insert(List<Departments> list) {
		// TODO Auto-generated method stub
		departmentsDao.insert(list);
	}

}
