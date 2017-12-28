package com.yb.entity;

import java.math.BigDecimal;

public class TblEvaluationProblem {
	private BigDecimal ID;
	private BigDecimal VERSION;
	private BigDecimal EPS_APP_STATUS;
	private String PROBLEMTEXT;
	private String PROBLEMCODE;
	private String PROBLEMTITLE;
	private BigDecimal PROBLEM_TYPE;
	public TblEvaluationProblem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblEvaluationProblem(BigDecimal iD, BigDecimal vERSION,
			BigDecimal ePS_APP_STATUS, String pROBLEMTEXT, String pROBLEMCODE,
			String pROBLEMTITLE, BigDecimal pROBLEM_TYPE) {
		super();
		ID = iD;
		VERSION = vERSION;
		EPS_APP_STATUS = ePS_APP_STATUS;
		PROBLEMTEXT = pROBLEMTEXT;
		PROBLEMCODE = pROBLEMCODE;
		PROBLEMTITLE = pROBLEMTITLE;
		PROBLEM_TYPE = pROBLEM_TYPE;
	}
	@Override
	public String toString() {
		return "TblEvaluationProblem [ID=" + ID + ", VERSION=" + VERSION
				+ ", EPS_APP_STATUS=" + EPS_APP_STATUS + ", PROBLEMTEXT="
				+ PROBLEMTEXT + ", PROBLEMCODE=" + PROBLEMCODE
				+ ", PROBLEMTITLE=" + PROBLEMTITLE + ", PROBLEM_TYPE="
				+ PROBLEM_TYPE + "]";
	}
	public BigDecimal getID() {
		return ID;
	}
	public void setID(BigDecimal iD) {
		ID = iD;
	}
	public BigDecimal getVERSION() {
		return VERSION;
	}
	public void setVERSION(BigDecimal vERSION) {
		VERSION = vERSION;
	}
	public BigDecimal getEPS_APP_STATUS() {
		return EPS_APP_STATUS;
	}
	public void setEPS_APP_STATUS(BigDecimal ePS_APP_STATUS) {
		EPS_APP_STATUS = ePS_APP_STATUS;
	}
	public String getPROBLEMTEXT() {
		return PROBLEMTEXT;
	}
	public void setPROBLEMTEXT(String pROBLEMTEXT) {
		PROBLEMTEXT = pROBLEMTEXT;
	}
	public String getPROBLEMCODE() {
		return PROBLEMCODE;
	}
	public void setPROBLEMCODE(String pROBLEMCODE) {
		PROBLEMCODE = pROBLEMCODE;
	}
	public String getPROBLEMTITLE() {
		return PROBLEMTITLE;
	}
	public void setPROBLEMTITLE(String pROBLEMTITLE) {
		PROBLEMTITLE = pROBLEMTITLE;
	}
	public BigDecimal getPROBLEM_TYPE() {
		return PROBLEM_TYPE;
	}
	public void setPROBLEM_TYPE(BigDecimal pROBLEM_TYPE) {
		PROBLEM_TYPE = pROBLEM_TYPE;
	}
	
	
}
