package com.yb.quartz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.yb.service.TblEvaluationService;
@Component
public class CopyOfAutoJob {
		@Autowired
		private TblEvaluationService tblEvaluationService;
		
		@Scheduled(cron="0 49 18 * * ?")//每天晚上11点
		public void autowork(){
			tblEvaluationService.queryProblem();
			tblEvaluationService.queryRelProblems();
	}
}