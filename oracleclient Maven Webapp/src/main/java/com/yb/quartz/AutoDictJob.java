package com.yb.quartz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.yb.service.DictAccountStatusService;
import com.yb.service.DictCardStatusService;
import com.yb.service.DictCarduserStatusService;
import com.yb.service.DictCouponTypeService;
import com.yb.service.DictCustomerLevelService;
import com.yb.service.DictDiffTypeService;
import com.yb.service.DictGoodsRuleTypeService;
import com.yb.service.DictOrderDealService;
import com.yb.service.DictPayTypeService;
import com.yb.service.DictTradeStatusService;
import com.yb.service.DictTradeTypeService;
import com.yb.service.DictVirtualGoodsStatusService;
import com.yb.service.DictVirtualGoodsTypeService;
import com.yb.service.TblCardTypeService;
import com.yb.service.TblEvaluationService;
import com.yb.service.TblOperatorService;
import com.yb.service.TblOrganizationService;

@Component
public class AutoDictJob {
		@Autowired
		private DictAccountStatusService dictAccountStatusService;
		@Autowired
		private DictCardStatusService dictCardStatusService;
		@Autowired
		private DictCarduserStatusService dictCarduserStatusService;
		@Autowired
		private DictCouponTypeService dictCouponTypeService;
		@Autowired
		private DictCustomerLevelService dictCustomerLevelService;
		@Autowired
		private DictDiffTypeService dictDiffTypeService;
		@Autowired
		private DictGoodsRuleTypeService dictGoodsRuleTypeService;
		@Autowired
		private DictOrderDealService dealService;
		@Autowired
		private DictPayTypeService dictPayTypeService;
		@Autowired
		private DictTradeStatusService dictTradeStatusService;
		@Autowired
		private DictTradeTypeService dictTradeTypeService;
		@Autowired
		private DictVirtualGoodsStatusService dictVirtualGoodsStatusService;
		@Autowired
		private DictVirtualGoodsTypeService dictVirtualGoodsTypeService;
		@Autowired
		private TblCardTypeService tblCardTypeService;
		@Autowired
		private TblOperatorService tblOperatorService;
		@Autowired
		private TblOrganizationService tblOrganizationService;
		@Autowired
		private TblEvaluationService tblEvaluationService;
		
		@Scheduled(cron="0 0 * * * ?")//每天早晚上11点
		public void autowork(){
			dictAccountStatusService.queryAll();
			dictCardStatusService.queryAll();
			dictCarduserStatusService.queryAll();
			dictCouponTypeService.queryAll();
			dictCustomerLevelService.queryAll();
			dictDiffTypeService.queryAll();
			dictGoodsRuleTypeService.queryAll();
			dealService.queryAll();
			dictPayTypeService.queryAll();
			dictTradeStatusService.queryAll();
			dictTradeTypeService.queryAll();
			dictVirtualGoodsStatusService.queryAll();
			dictVirtualGoodsTypeService.queryAll();
			tblCardTypeService.queryAll();
			tblOperatorService.queryAll();
			tblOrganizationService.queryAll();
			tblEvaluationService.queryProblem();
	}
}