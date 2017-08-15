package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class DepartmentHistory implements Serializable {
	private Integer periodId;
	private Integer departmentId;
	private BigDecimal deptQtyItemSold;
	private BigDecimal deptValItemSold;
	private BigDecimal deptQtyItemRef;
	private BigDecimal deptValItemRef;
	private BigDecimal deptQtyDisc;
	private BigDecimal deptValDisc;
	private BigDecimal deptQtySurc;
	private BigDecimal deptValSurc;
	private Integer totalAwardedQty;
	private BigDecimal totalAwardedVal;
	private Integer totalRedeemedQty;
	private BigDecimal totalRedeemedVal;
	public DepartmentHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DepartmentHistory(Integer periodId, Integer departmentId,
			BigDecimal deptQtyItemSold, BigDecimal deptValItemSold,
			BigDecimal deptQtyItemRef, BigDecimal deptValItemRef,
			BigDecimal deptQtyDisc, BigDecimal deptValDisc,
			BigDecimal deptQtySurc, BigDecimal deptValSurc,
			Integer totalAwardedQty, BigDecimal totalAwardedVal,
			Integer totalRedeemedQty, BigDecimal totalRedeemedVal) {
		super();
		this.periodId = periodId;
		this.departmentId = departmentId;
		this.deptQtyItemSold = deptQtyItemSold;
		this.deptValItemSold = deptValItemSold;
		this.deptQtyItemRef = deptQtyItemRef;
		this.deptValItemRef = deptValItemRef;
		this.deptQtyDisc = deptQtyDisc;
		this.deptValDisc = deptValDisc;
		this.deptQtySurc = deptQtySurc;
		this.deptValSurc = deptValSurc;
		this.totalAwardedQty = totalAwardedQty;
		this.totalAwardedVal = totalAwardedVal;
		this.totalRedeemedQty = totalRedeemedQty;
		this.totalRedeemedVal = totalRedeemedVal;
	}
	@Override
	public String toString() {
		return "DepartmentHistory [periodId=" + periodId + ", departmentId="
				+ departmentId + ", deptQtyItemSold=" + deptQtyItemSold
				+ ", deptValItemSold=" + deptValItemSold + ", deptQtyItemRef="
				+ deptQtyItemRef + ", deptValItemRef=" + deptValItemRef
				+ ", deptQtyDisc=" + deptQtyDisc + ", deptValDisc="
				+ deptValDisc + ", deptQtySurc=" + deptQtySurc
				+ ", deptValSurc=" + deptValSurc + ", totalAwardedQty="
				+ totalAwardedQty + ", totalAwardedVal=" + totalAwardedVal
				+ ", totalRedeemedQty=" + totalRedeemedQty
				+ ", totalRedeemedVal=" + totalRedeemedVal + "]";
	}
	public Integer getPeriodId() {
		return periodId;
	}
	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public BigDecimal getDeptQtyItemSold() {
		return deptQtyItemSold;
	}
	public void setDeptQtyItemSold(BigDecimal deptQtyItemSold) {
		this.deptQtyItemSold = deptQtyItemSold;
	}
	public BigDecimal getDeptValItemSold() {
		return deptValItemSold;
	}
	public void setDeptValItemSold(BigDecimal deptValItemSold) {
		this.deptValItemSold = deptValItemSold;
	}
	public BigDecimal getDeptQtyItemRef() {
		return deptQtyItemRef;
	}
	public void setDeptQtyItemRef(BigDecimal deptQtyItemRef) {
		this.deptQtyItemRef = deptQtyItemRef;
	}
	public BigDecimal getDeptValItemRef() {
		return deptValItemRef;
	}
	public void setDeptValItemRef(BigDecimal deptValItemRef) {
		this.deptValItemRef = deptValItemRef;
	}
	public BigDecimal getDeptQtyDisc() {
		return deptQtyDisc;
	}
	public void setDeptQtyDisc(BigDecimal deptQtyDisc) {
		this.deptQtyDisc = deptQtyDisc;
	}
	public BigDecimal getDeptValDisc() {
		return deptValDisc;
	}
	public void setDeptValDisc(BigDecimal deptValDisc) {
		this.deptValDisc = deptValDisc;
	}
	public BigDecimal getDeptQtySurc() {
		return deptQtySurc;
	}
	public void setDeptQtySurc(BigDecimal deptQtySurc) {
		this.deptQtySurc = deptQtySurc;
	}
	public BigDecimal getDeptValSurc() {
		return deptValSurc;
	}
	public void setDeptValSurc(BigDecimal deptValSurc) {
		this.deptValSurc = deptValSurc;
	}
	public Integer getTotalAwardedQty() {
		return totalAwardedQty;
	}
	public void setTotalAwardedQty(Integer totalAwardedQty) {
		this.totalAwardedQty = totalAwardedQty;
	}
	public BigDecimal getTotalAwardedVal() {
		return totalAwardedVal;
	}
	public void setTotalAwardedVal(BigDecimal totalAwardedVal) {
		this.totalAwardedVal = totalAwardedVal;
	}
	public Integer getTotalRedeemedQty() {
		return totalRedeemedQty;
	}
	public void setTotalRedeemedQty(Integer totalRedeemedQty) {
		this.totalRedeemedQty = totalRedeemedQty;
	}
	public BigDecimal getTotalRedeemedVal() {
		return totalRedeemedVal;
	}
	public void setTotalRedeemedVal(BigDecimal totalRedeemedVal) {
		this.totalRedeemedVal = totalRedeemedVal;
	}
	
}
