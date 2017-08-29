package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.DictCardStatusDao;
import com.yb.entity.DictCardStatus;
import com.yb.service.DictCardStatusService;
@Service 
@Transactional
public class DictCardStatusServiceImpl implements DictCardStatusService{

	@Autowired
	private DictCardStatusDao dao;
	@Override
	public void insert(List<DictCardStatus> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
