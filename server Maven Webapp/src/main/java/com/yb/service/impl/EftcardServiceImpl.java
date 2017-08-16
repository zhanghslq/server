package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.EftcardDao;
import com.yb.entity.Eftcard;
import com.yb.service.EftcardService;

@Service
@Transactional
public class EftcardServiceImpl implements EftcardService{

	@Autowired
	private EftcardDao eftcardDao;
	@Override
	public void insert(List<Eftcard> list) {
		// TODO Auto-generated method stub
		eftcardDao.insert(list);
	}
	
}
