package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.PosTerminalDao;
import com.yb.dict.entity.PosTerminal;
import com.yb.dict.service.PosTerminalService;
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
