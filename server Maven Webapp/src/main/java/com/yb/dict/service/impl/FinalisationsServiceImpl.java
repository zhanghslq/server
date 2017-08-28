package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.FinalisationsDao;
import com.yb.dict.entity.Finalisations;
import com.yb.dict.service.FinalisationsService;
@Service
@Transactional
public class FinalisationsServiceImpl implements FinalisationsService{

	@Autowired
	private FinalisationsDao dao;
	@Override
	public void insert(List<Finalisations> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
