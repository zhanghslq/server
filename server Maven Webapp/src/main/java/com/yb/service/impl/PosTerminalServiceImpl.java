package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.PosTerminalDao;
import com.yb.entity.PosTerminal;
import com.yb.service.PosTerminalService;
@Service
@Transactional
public class PosTerminalServiceImpl implements PosTerminalService{

	@Autowired
	private PosTerminalDao posTerminalDao;
	@Override
	public void insert(List<PosTerminal> list) {
		// TODO Auto-generated method stub
		posTerminalDao.insert(list);
	}

}
