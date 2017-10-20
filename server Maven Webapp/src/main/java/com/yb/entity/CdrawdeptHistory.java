package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class CdrawdeptHistory implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer cdrawPeriodId;
	private Integer departmentId;
	private BigDecimal cdrawdeptQtySld;
	private BigDecimal cdrawdeptValSld;
	private BigDecimal cdrawdeptQtyRef;
	private BigDecimal cdrawdeptValRef;
	private BigDecimal cdrawdeptQtyDisc;
	private BigDecimal cdrawdeptValDisc;
	private BigDecimal cdrawdeptQtySurc;
	private BigDecimal cdrawdeptValSurc;
	private String stationId;
	
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public CdrawdeptHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CdrawdeptHistory(Integer cdrawPeriodId, Integer departmentId,
			BigDecimal cdrawdeptQtySld, BigDecimal cdrawdeptValSld,
			BigDecimal cdrawdeptQtyRef, BigDecimal cdrawdeptValRef,
			BigDecimal cdrawdeptQtyDisc, BigDecimal cdrawdeptValDisc,
			BigDecimal cdrawdeptQtySurc, BigDecimal cdrawdeptValSurc) {
		super();
		this.cdrawPeriodId = cdrawPeriodId;
		this.departmentId = departmentId;
		this.cdrawdeptQtySld = cdrawdeptQtySld;
		this.cdrawdeptValSld = cdrawdeptValSld;
		this.cdrawdeptQtyRef = cdrawdeptQtyRef;
		this.cdrawdeptValRef = cdrawdeptValRef;
		this.cdrawdeptQtyDisc = cdrawdeptQtyDisc;
		this.cdrawdeptValDisc = cdrawdeptValDisc;
		this.cdrawdeptQtySurc = cdrawdeptQtySurc;
		this.cdrawdeptValSurc = cdrawdeptValSurc;
	}
	@Override
	public String toString() {
		return "CdrawdeptHistory [cdrawPeriodId=" + cdrawPeriodId
				+ ", departmentId=" + departmentId + ", cdrawdeptQtySld="
				+ cdrawdeptQtySld + ", cdrawdeptValSld=" + cdrawdeptValSld
				+ ", cdrawdeptQtyRef=" + cdrawdeptQtyRef + ", cdrawdeptValRef="
				+ cdrawdeptValRef + ", cdrawdeptQtyDisc=" + cdrawdeptQtyDisc
				+ ", cdrawdeptValDisc=" + cdrawdeptValDisc
				+ ", cdrawdeptQtySurc=" + cdrawdeptQtySurc
				+ ", cdrawdeptValSurc=" + cdrawdeptValSurc + "]";
	}
	public Integer getCdrawPeriodId() {
		return cdrawPeriodId;
	}
	public void setCdrawPeriodId(Integer cdrawPeriodId) {
		this.cdrawPeriodId = cdrawPeriodId;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public BigDecimal getCdrawdeptQtySld() {
		return cdrawdeptQtySld;
	}
	public void setCdrawdeptQtySld(BigDecimal cdrawdeptQtySld) {
		this.cdrawdeptQtySld = cdrawdeptQtySld;
	}
	public BigDecimal getCdrawdeptValSld() {
		return cdrawdeptValSld;
	}
	public void setCdrawdeptValSld(BigDecimal cdrawdeptValSld) {
		this.cdrawdeptValSld = cdrawdeptValSld;
	}
	public BigDecimal getCdrawdeptQtyRef() {
		return cdrawdeptQtyRef;
	}
	public void setCdrawdeptQtyRef(BigDecimal cdrawdeptQtyRef) {
		this.cdrawdeptQtyRef = cdrawdeptQtyRef;
	}
	public BigDecimal getCdrawdeptValRef() {
		return cdrawdeptValRef;
	}
	public void setCdrawdeptValRef(BigDecimal cdrawdeptValRef) {
		this.cdrawdeptValRef = cdrawdeptValRef;
	}
	public BigDecimal getCdrawdeptQtyDisc() {
		return cdrawdeptQtyDisc;
	}
	public void setCdrawdeptQtyDisc(BigDecimal cdrawdeptQtyDisc) {
		this.cdrawdeptQtyDisc = cdrawdeptQtyDisc;
	}
	public BigDecimal getCdrawdeptValDisc() {
		return cdrawdeptValDisc;
	}
	public void setCdrawdeptValDisc(BigDecimal cdrawdeptValDisc) {
		this.cdrawdeptValDisc = cdrawdeptValDisc;
	}
	public BigDecimal getCdrawdeptQtySurc() {
		return cdrawdeptQtySurc;
	}
	public void setCdrawdeptQtySurc(BigDecimal cdrawdeptQtySurc) {
		this.cdrawdeptQtySurc = cdrawdeptQtySurc;
	}
	public BigDecimal getCdrawdeptValSurc() {
		return cdrawdeptValSurc;
	}
	public void setCdrawdeptValSurc(BigDecimal cdrawdeptValSurc) {
		this.cdrawdeptValSurc = cdrawdeptValSurc;
	}

}
