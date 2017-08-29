package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.WetstockApprovalDao;
import com.yb.entity.WetstockApproval;
import com.yb.service.WetstockApprovalService;
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
