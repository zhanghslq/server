package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.GradesDao;
import com.yb.dict.entity.Grades;
import com.yb.dict.service.GradesService;
@Service
@Transactional
public class GradesServiceImpl implements GradesService{

	@Autowired
	private GradesDao dao;
	@Override
	public void insert(List<Grades> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
