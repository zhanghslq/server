package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.TblOrganizationDao;
import com.yb.dict.entity.TblOrganization;
import com.yb.dict.service.TblOrganizationService;
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
