package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.DictPayTypeDao;
import com.yb.entity.DictPayType;
import com.yb.service.DictPayTypeService;
@Service
@Transactional
public class DictPayTypeServiceImpl implements DictPayTypeService{

	@Autowired
	private DictPayTypeDao dao;
	@Override
	public void insert(List<DictPayType> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
