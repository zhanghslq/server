package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.DictAccountStatusDao;
import com.yb.dict.entity.DictAccountStatus;
import com.yb.dict.service.DictAccountStatusService;
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
