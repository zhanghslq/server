package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.DictAccountStatusDao;
import com.yb.entity.DictAccountStatus;
import com.yb.service.DictAccountStatusService;
@Service
@Transactional
public class DictAccountStatusServiceImpl implements DictAccountStatusService {

	@Autowired
	private DictAccountStatusDao dao;
	@Override
	public void insert(List<DictAccountStatus> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
