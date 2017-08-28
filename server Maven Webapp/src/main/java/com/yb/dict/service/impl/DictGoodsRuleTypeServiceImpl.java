package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.DictGoodsRuleTypeDao;
import com.yb.dict.entity.DictGoodsRuleType;
import com.yb.dict.service.DictGoodsRuleTypeService;
@Service
@Transactional
public class DictGoodsRuleTypeServiceImpl implements DictGoodsRuleTypeService{

	@Autowired
	private DictGoodsRuleTypeDao dao;
	@Override
	public void insert(List<DictGoodsRuleType> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
