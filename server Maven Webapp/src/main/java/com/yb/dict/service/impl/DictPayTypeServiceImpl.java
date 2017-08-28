package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.DictPayTypeDao;
import com.yb.dict.entity.DictPayType;
import com.yb.dict.service.DictPayTypeService;
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
