package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TblCardTypeDao;
import com.yb.entity.TblCardtype;
import com.yb.service.TblCardTypeService;
@Service
@Transactional
public class TblCardTypeServiceImpl implements TblCardTypeService{

	@Autowired
	private TblCardTypeDao tblCardTypeDao;
	@Override
	public void insert(List<TblCardtype> list) {
		// TODO Auto-generated method stub
		tblCardTypeDao.insert(list);
	}

}
