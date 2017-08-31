package com.yb.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yb.service.TblTradeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestClient {
	@Autowired
	private TblTradeService tblTradeService;
	@Test
	public void test(){
		tblTradeService.queryAll();
	}
}