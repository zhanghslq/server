package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TblEvaluationDao;
import com.yb.entity.TblEvaluation;
import com.yb.service.TblEvaluationService;

@Service
@Transactional
public class TblEvaluationServiceImpl implements TblEvaluationService{

	@Autowired
	private TblEvaluationDao tblEvaluationDao;
	@Override
	public void insert(List<TblEvaluation> list) {
		// TODO Auto-generated method stub
		tblEvaluationDao.insert(list);
	}
	
}
