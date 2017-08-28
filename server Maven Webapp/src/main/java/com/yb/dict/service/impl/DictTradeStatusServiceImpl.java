package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.DictTradeStatusDao;
import com.yb.dict.entity.DictTradeStatus;
import com.yb.dict.service.DictTradeStatusService;
@Service
@Transactional
public class DictTradeStatusServiceImpl implements DictTradeStatusService{

	@Autowired
	private DictTradeStatusDao dao;
	@Override
	public void insert(List<DictTradeStatus> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
