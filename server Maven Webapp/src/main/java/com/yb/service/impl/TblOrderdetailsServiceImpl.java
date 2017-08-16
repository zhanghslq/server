package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TblOrderdetailsDao;
import com.yb.entity.TblOrderdetails;
import com.yb.service.TblOrderdetailsService;

@Service
@Transactional
public class TblOrderdetailsServiceImpl implements TblOrderdetailsService{

	@Autowired
	private TblOrderdetailsDao tblOrderdetailsDao;
	@Override
	public void insert(List<TblOrderdetails> list) {
		// TODO Auto-generated method stub
		tblOrderdetailsDao.insert(list);
	}
	
}
