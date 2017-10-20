package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.DepartmentHistoryDao;
import com.yb.entity.DepartmentHistory;
import com.yb.service.DepartmentHistoryService;

@Service
@Transactional
public class DepartmentHistoryServiceImpl implements DepartmentHistoryService {

	@Autowired
	private DepartmentHistoryDao departmentHistoryDao;
	@Override
	public void insert(List<DepartmentHistory> list) {
		// TODO Auto-generated method stub
		departmentHistoryDao.insert(list);
	}
	
}
