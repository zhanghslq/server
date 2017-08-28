package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.PeriodTypesDao;
import com.yb.dict.entity.PeriodTypes;
import com.yb.dict.service.PeriodTypesService;
@Service
@Transactional
public class PeriodTypesServiceImpl implements PeriodTypesService{

	@Autowired
	private PeriodTypesDao dao;
	@Override
	public void insert(List<PeriodTypes> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
