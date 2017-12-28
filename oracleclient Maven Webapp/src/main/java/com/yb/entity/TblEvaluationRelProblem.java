package com.yb.entity;

import java.math.BigDecimal;

public class TblEvaluationRelProblem {
	private BigDecimal ID;
	private BigDecimal VERSION;
	private BigDecimal RESULT;
	private BigDecimal PROBLEM_ID;
	private BigDecimal EVALUATION_ID;
	public TblEvaluationRelProblem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblEvaluationRelProblem(BigDecimal iD, BigDecimal vERSION,
			BigDecimal rESULT, BigDecimal pROBLEM_ID, BigDecimal eVALUATION_ID) {
		super();
		ID = iD;
		VERSION = vERSION;
		RESULT = rESULT;
		PROBLEM_ID = pROBLEM_ID;
		EVALUATION_ID = eVALUATION_ID;
	}
	@Override
	public String toString() {
		return "TblEvaluationRelProblem [ID=" + ID + ", VERSION=" + VERSION
				+ ", RESULT=" + RESULT + ", PROBLEM_ID=" + PROBLEM_ID
				+ ", EVALUATION_ID=" + EVALUATION_ID + "]";
	}
	public BigDecimal getID() {
		return ID;
	}
	public void setID(BigDecimal iD) {
		ID = iD;
	}
	public BigDecimal getRESULT() {
		return RESULT;
	}
	public void setRESULT(BigDecimal rESULT) {
		RESULT = rESULT;
	}
	public BigDecimal getPROBLEM_ID() {
		return PROBLEM_ID;
	}
	public void setPROBLEM_ID(BigDecimal pROBLEM_ID) {
		PROBLEM_ID = pROBLEM_ID;
	}
	public BigDecimal getEVALUATION_ID() {
		return EVALUATION_ID;
	}
	public void setEVALUATION_ID(BigDecimal eVALUATION_ID) {
		EVALUATION_ID = eVALUATION_ID;
	}
	public BigDecimal getVERSION() {
		return VERSION;
	}
	public void setVERSION(BigDecimal vERSION) {
		VERSION = vERSION;
	}
}
