package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TblCarduserDao;
import com.yb.entity.TblCarduser;
import com.yb.service.TblCarduserService;

@Service
@Transactional
public class TblCarduserServiceImpl implements TblCarduserService{

	@Autowired
	private TblCarduserDao tblCarduserDao;
	@Override
	public void insert(List<TblCarduser> list) {
		// TODO Auto-generated method stub
		tblCarduserDao.insert(list);
	}
	
}
