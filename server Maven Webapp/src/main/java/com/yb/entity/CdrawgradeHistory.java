package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class CdrawgradeHistory implements Serializable{
	private Integer cdrawPeriodId;
	private Integer gradeId;
	private Integer cdrawgradeTrs;
	private BigDecimal cdrawgradeVol;
	private BigDecimal cdrawgradeVal;
	private BigDecimal cdrawgradeVolDisc;
	private BigDecimal cdrawgradeValDisc;
	private BigDecimal cdrawgradeQtySurc;
	private BigDecimal cdrawgradeValSurc;
	private BigDecimal cdrawgradeVol1;
	private BigDecimal cdrawgradeVal1;
	private BigDecimal cdrawgradeVol2;
	private BigDecimal cdrawgradeVal2;
	public CdrawgradeHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CdrawgradeHistory(Integer cdrawPeriodId, Integer gradeId,
			Integer cdrawgradeTrs, BigDecimal cdrawgradeVol,
			BigDecimal cdrawgradeVal, BigDecimal cdrawgradeVolDisc,
			BigDecimal cdrawgradeValDisc, BigDecimal cdrawgradeQtySurc,
			BigDecimal cdrawgradeValSurc, BigDecimal cdrawgradeVol1,
			BigDecimal cdrawgradeVal1, BigDecimal cdrawgradeVol2,
			BigDecimal cdrawgradeVal2) {
		super();
		this.cdrawPeriodId = cdrawPeriodId;
		this.gradeId = gradeId;
		this.cdrawgradeTrs = cdrawgradeTrs;
		this.cdrawgradeVol = cdrawgradeVol;
		this.cdrawgradeVal = cdrawgradeVal;
		this.cdrawgradeVolDisc = cdrawgradeVolDisc;
		this.cdrawgradeValDisc = cdrawgradeValDisc;
		this.cdrawgradeQtySurc = cdrawgradeQtySurc;
		this.cdrawgradeValSurc = cdrawgradeValSurc;
		this.cdrawgradeVol1 = cdrawgradeVol1;
		this.cdrawgradeVal1 = cdrawgradeVal1;
		this.cdrawgradeVol2 = cdrawgradeVol2;
		this.cdrawgradeVal2 = cdrawgradeVal2;
	}
	@Override
	public String toString() {
		return "CdrawgradeHistory [cdrawPeriodId=" + cdrawPeriodId
				+ ", gradeId=" + gradeId + ", cdrawgradeTrs=" + cdrawgradeTrs
				+ ", cdrawgradeVol=" + cdrawgradeVol + ", cdrawgradeVal="
				+ cdrawgradeVal + ", cdrawgradeVolDisc=" + cdrawgradeVolDisc
				+ ", cdrawgradeValDisc=" + cdrawgradeValDisc
				+ ", cdrawgradeQtySurc=" + cdrawgradeQtySurc
				+ ", cdrawgradeValSurc=" + cdrawgradeValSurc
				+ ", cdrawgradeVol1=" + cdrawgradeVol1 + ", cdrawgradeVal1="
				+ cdrawgradeVal1 + ", cdrawgradeVol2=" + cdrawgradeVol2
				+ ", cdrawgradeVal2=" + cdrawgradeVal2 + "]";
	}
	public Integer getCdrawPeriodId() {
		return cdrawPeriodId;
	}
	public void setCdrawPeriodId(Integer cdrawPeriodId) {
		this.cdrawPeriodId = cdrawPeriodId;
	}
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	public Integer getCdrawgradeTrs() {
		return cdrawgradeTrs;
	}
	public void setCdrawgradeTrs(Integer cdrawgradeTrs) {
		this.cdrawgradeTrs = cdrawgradeTrs;
	}
	public BigDecimal getCdrawgradeVol() {
		return cdrawgradeVol;
	}
	public void setCdrawgradeVol(BigDecimal cdrawgradeVol) {
		this.cdrawgradeVol = cdrawgradeVol;
	}
	public BigDecimal getCdrawgradeVal() {
		return cdrawgradeVal;
	}
	public void setCdrawgradeVal(BigDecimal cdrawgradeVal) {
		this.cdrawgradeVal = cdrawgradeVal;
	}
	public BigDecimal getCdrawgradeVolDisc() {
		return cdrawgradeVolDisc;
	}
	public void setCdrawgradeVolDisc(BigDecimal cdrawgradeVolDisc) {
		this.cdrawgradeVolDisc = cdrawgradeVolDisc;
	}
	public BigDecimal getCdrawgradeValDisc() {
		return cdrawgradeValDisc;
	}
	public void setCdrawgradeValDisc(BigDecimal cdrawgradeValDisc) {
		this.cdrawgradeValDisc = cdrawgradeValDisc;
	}
	public BigDecimal getCdrawgradeQtySurc() {
		return cdrawgradeQtySurc;
	}
	public void setCdrawgradeQtySurc(BigDecimal cdrawgradeQtySurc) {
		this.cdrawgradeQtySurc = cdrawgradeQtySurc;
	}
	public BigDecimal getCdrawgradeValSurc() {
		return cdrawgradeValSurc;
	}
	public void setCdrawgradeValSurc(BigDecimal cdrawgradeValSurc) {
		this.cdrawgradeValSurc = cdrawgradeValSurc;
	}
	public BigDecimal getCdrawgradeVol1() {
		return cdrawgradeVol1;
	}
	public void setCdrawgradeVol1(BigDecimal cdrawgradeVol1) {
		this.cdrawgradeVol1 = cdrawgradeVol1;
	}
	public BigDecimal getCdrawgradeVal1() {
		return cdrawgradeVal1;
	}
	public void setCdrawgradeVal1(BigDecimal cdrawgradeVal1) {
		this.cdrawgradeVal1 = cdrawgradeVal1;
	}
	public BigDecimal getCdrawgradeVol2() {
		return cdrawgradeVol2;
	}
	public void setCdrawgradeVol2(BigDecimal cdrawgradeVol2) {
		this.cdrawgradeVol2 = cdrawgradeVol2;
	}
	public BigDecimal getCdrawgradeVal2() {
		return cdrawgradeVal2;
	}
	public void setCdrawgradeVal2(BigDecimal cdrawgradeVal2) {
		this.cdrawgradeVal2 = cdrawgradeVal2;
	}
	
}
