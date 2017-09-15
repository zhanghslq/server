package com.yb.quartz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.yb.service.TblAccountService;
import com.yb.service.TblCardService;
import com.yb.service.TblCarduserService;
import com.yb.service.TblCustomerService;
import com.yb.service.TblDifferencestradeService;
import com.yb.service.TblEvaluationService;
import com.yb.service.TblMyfavoriteService;
import com.yb.service.TblOrderService;
import com.yb.service.TblOrderdetailsService;
import com.yb.service.TblShopgoodsdetailsService;
import com.yb.service.TblShoppingcartService;
import com.yb.service.TblTradeService;
import com.yb.service.TblVirtualgoodsService;

@Component
public class AutoJob {
		@Autowired
		private  TblAccountService tblAccountService;
		@Autowired
		private TblCardService tblCardService;
		@Autowired
		private TblCarduserService tblCarduserService;
		@Autowired
		private TblCustomerService tblCustomerService;
		@Autowired
		private TblDifferencestradeService tblDifferencestradeService;
		@Autowired
		private TblEvaluationService tblEvaluationService;
		@Autowired
		private TblMyfavoriteService tblMyfavoriteService;
		@Autowired
		private TblOrderdetailsService tblOrderdetailsService;
		@Autowired
		private TblOrderService tblOrderService;
		@Autowired
		private TblShopgoodsdetailsService tblShopgoodsdetailsService;
		@Autowired
		private TblShoppingcartService tblShoppingcartService;
		@Autowired
		private TblTradeService tblTradeService;
		@Autowired
		private TblVirtualgoodsService tblVirtualgoodsService;
		
		@Scheduled(cron="0 0 23 * * ?")//每天晚上11点
		public void autowork(){
			tblAccountService.queryAll();
			tblCardService.queryAll();
			tblCarduserService.queryAll();
			tblCustomerService.queryAll();
			tblDifferencestradeService.queryAll();
			tblEvaluationService.queryAll();
			tblMyfavoriteService.queryAll();
			tblOrderdetailsService.queryAll();
			tblOrderService.queryAll();
			tblShopgoodsdetailsService.queryAll();
			tblShoppingcartService.queryAll();
			tblVirtualgoodsService.queryAll();
			tblTradeService.queryAll();
	}
}