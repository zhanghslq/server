package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TblAccountDao;
import com.yb.entity.TblAccount;
import com.yb.service.TblAccountService;

@Service
@Transactional
public class TblAccountServiceImpl implements TblAccountService {

	@Autowired
	private TblAccountDao tblAccountDao;
	@Override
	public void insert(List<TblAccount> list) {
		// TODO Auto-generated method stub
		tblAccountDao.insert(list);
	}
	
}
