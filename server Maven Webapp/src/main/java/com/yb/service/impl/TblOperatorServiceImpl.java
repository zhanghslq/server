package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TblOperatorDao;
import com.yb.entity.TblOperator;
import com.yb.service.TblOperatorService;
@Service
@Transactional
public class TblOperatorServiceImpl implements TblOperatorService{

	@Autowired
	private TblOperatorDao tblOperatorDao;
	@Override
	public void insert(List<TblOperator> list) {
		// TODO Auto-generated method stub
		tblOperatorDao.insert(list);
	}

}
