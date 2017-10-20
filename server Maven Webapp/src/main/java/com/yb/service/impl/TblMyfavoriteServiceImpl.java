package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TblMyfavoriteDao;
import com.yb.entity.TblMyfavorite;
import com.yb.service.TblMyfavoriteService;

@Service
@Transactional
public class TblMyfavoriteServiceImpl implements TblMyfavoriteService {

	@Autowired 
	private TblMyfavoriteDao tblMyfavoriteDao;
	
	@Override
	public void insert(List<TblMyfavorite> list) {
		// TODO Auto-generated method stub
		tblMyfavoriteDao.insert(list);
	}
}
