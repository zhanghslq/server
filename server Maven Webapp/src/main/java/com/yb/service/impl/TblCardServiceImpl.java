package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TblCardDao;
import com.yb.entity.TblCard;
import com.yb.service.TblCardService;

@Service
@Transactional
public class TblCardServiceImpl implements TblCardService{

	@Autowired
	private TblCardDao tblCardDao;
	@Override
	public void insert(List<TblCard> list) {
		// TODO Auto-generated method stub
		tblCardDao.insert(list);
	}
	
}
