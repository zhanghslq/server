package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TaxesDao;
import com.yb.entity.Taxes;
import com.yb.service.TaxesService;
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
