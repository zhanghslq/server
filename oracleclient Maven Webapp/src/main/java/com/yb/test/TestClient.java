package com.yb.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yb.service.TblCardService;
import com.yb.service.TblTradeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestClient {
	@Autowired
	private TblTradeService tblTradeService;
	
	@Autowired
	private TblCardService tblCardService;
	@Test
	public void test(){
		tblTradeService.queryAll();
	}
	@Test
	public void card(){
		tblCardService.queryAll();
	}
	@Test
	public void trade(){
		
	}
}