package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TblDifferencestradeDao;
import com.yb.entity.TblDifferencestrade;
import com.yb.service.TblDifferencestradeService;

@Service
@Transactional

public class TblDifferencestradeServiceImpl implements TblDifferencestradeService{

	@Autowired
	private TblDifferencestradeDao tblDifferencestradeDao;
	@Override
	public void insert(List<TblDifferencestrade> list) {
		// TODO Auto-generated method stub
		tblDifferencestradeDao.insert(list);
	}
	
}
