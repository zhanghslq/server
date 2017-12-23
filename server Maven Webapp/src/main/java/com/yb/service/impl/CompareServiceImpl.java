package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.CompareDao;
import com.yb.entity.Comparison;
import com.yb.service.CompareService;

@Service
@Transactional
public class CompareServiceImpl implements CompareService{

	@Autowired
	private CompareDao compareDao;
	@Override
	public void insert(List<Comparison> list) {
		// TODO Auto-generated method stub
		compareDao.insert(list);
		
	}
	@Override
	public void insertb(Comparison comparison) {
		// TODO Auto-generated method stub
		compareDao.insertb(comparison);
	}

}
