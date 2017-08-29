package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.HosesDao;
import com.yb.entity.Hoses;
import com.yb.service.HosesService;
@Service
@Transactional
public class HosesServiceImpl implements HosesService{

	@Autowired 
	private HosesDao dao;
	@Override
	public void insert(List<Hoses> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
