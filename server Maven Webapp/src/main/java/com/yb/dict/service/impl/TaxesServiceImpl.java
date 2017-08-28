package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.TaxesDao;
import com.yb.dict.entity.Taxes;
import com.yb.dict.service.TaxesService;
@Service
@Transactional
public class TaxesServiceImpl implements TaxesService{

	@Autowired
	private TaxesDao taxesDao;
	@Override
	public void insert(List<Taxes> list) {
		// TODO Auto-generated method stub
		taxesDao.insert(list);
	}

}
