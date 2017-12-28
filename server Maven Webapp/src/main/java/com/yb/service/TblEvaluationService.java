package com.yb.service;

import java.util.List;

import com.yb.entity.TblEvaluation;
import com.yb.entity.TblEvaluationProblem;
import com.yb.entity.TblEvaluationRelProblem;

public interface TblEvaluationService extends BaseService<TblEvaluation>{
	void insertRelProblem(List<TblEvaluationRelProblem> list);
	void insertProblem(List<TblEvaluationProblem> list);
}
