package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.PriceLevelTypesDao;
import com.yb.entity.PriceLevelTypes;
import com.yb.service.PriceLevelTypesService;

@Service
@Transactional
public class PriceLevelTypesServiceImpl implements PriceLevelTypesService{

	@Autowired
	private PriceLevelTypesDao priceLevelTypesDao;
	@Override
	public void insert(List<PriceLevelTypes> list) {
		// TODO Auto-generated method stub
		priceLevelTypesDao.insert(list);
	}

}
