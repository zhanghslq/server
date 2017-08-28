package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.DictCardStatusDao;
import com.yb.dict.entity.DictCardStatus;
import com.yb.dict.service.DictCardStatusService;
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
