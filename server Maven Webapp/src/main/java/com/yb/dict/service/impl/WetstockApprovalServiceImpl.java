package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.WetstockApprovalDao;
import com.yb.dict.entity.WetstockApproval;
import com.yb.dict.service.WetstockApprovalService;
@Service
@Transactional
public class WetstockApprovalServiceImpl implements WetstockApprovalService{

	@Autowired
	private WetstockApprovalDao wetstockApprovalDao;
	@Override
	public void insert(List<WetstockApproval> list) {
		// TODO Auto-generated method stub
		wetstockApprovalDao.insert(list);
	}

}
