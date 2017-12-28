package com.yb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yb.entity.TblEvaluation;
import com.yb.entity.TblEvaluationProblem;
import com.yb.entity.TblEvaluationRelProblem;

public interface TblEvaluationDao extends BaseDao<TblEvaluation>{
	
	public List<TblEvaluationProblem> queryProblem();
	public List<TblEvaluationRelProblem> queryRelProblems(@Param("min")Long min,@Param("max")Long max);
	Long queryRelMaxId();
	Long queryRelMinId();
}
