package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.DictCarduserStatusDao;
import com.yb.dict.entity.DictCarduserStatus;
import com.yb.dict.service.DictCarduserStatusService;
@Service
@Transactional
public class DictCarduserStatusServiceImpl implements DictCarduserStatusService{

	@Autowired
	private DictCarduserStatusDao dao;
	@Override
	public void insert(List<DictCarduserStatus> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
