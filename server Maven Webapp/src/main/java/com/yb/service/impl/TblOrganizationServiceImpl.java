package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TblOrganizationDao;
import com.yb.entity.TblOrganization;
import com.yb.service.TblOrganizationService;
@Service
@Transactional
public class TblOrganizationServiceImpl implements TblOrganizationService{

	@Autowired
	private TblOrganizationDao tblOrganizationDao;
	@Override
	public void insert(List<TblOrganization> list) {
		// TODO Auto-generated method stub
		tblOrganizationDao.insert(list);
	}

}
