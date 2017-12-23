package com.yb.entity;

import java.io.Serializable;
import java.util.Date;

public class CashdrawPeriods implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String stationId;
	private Integer cdrawPeriodId;
	private Integer cashierId;
	private Integer posId;
	private Date cdrawOpenDate;
	private Date cdrawCloseDate;
	private Integer cdrawPeriodState;
	
	public CashdrawPeriods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CashdrawPeriods(Integer cdrawPeriodId, Integer cashierId,
			Integer posId, Date cdrawOpenDate, Date cdrawCloseDate,
			Integer cdrawPeriodState) {
		super();
		this.cdrawPeriodId = cdrawPeriodId;
		this.cashierId = cashierId;
		this.posId = posId;
		this.cdrawOpenDate = cdrawOpenDate;
		this.cdrawCloseDate = cdrawCloseDate;
		this.cdrawPeriodState = cdrawPeriodState;
	}

	@Override
	public String toString() {
		return "CashdrawPeriods [cdrawPeriodId=" + cdrawPeriodId
				+ ", cashierId=" + cashierId + ", posId=" + posId
				+ ", cdrawOpenDate=" + cdrawOpenDate + ", cdrawCloseDate="
				+ cdrawCloseDate + ", cdrawPeriodState=" + cdrawPeriodState
				+ "]";
	}

	public Integer getCdrawPeriodId() {
		return cdrawPeriodId;
	}
	
	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public void setCdrawPeriodId(Integer cdrawPeriodId) {
		this.cdrawPeriodId = cdrawPeriodId;
	}

	public Integer getCashierId() {
		return cashierId;
	}

	public void setCashierId(Integer cashierId) {
		this.cashierId = cashierId;
	}

	public Integer getPosId() {
		return posId;
	}

	public void setPosId(Integer posId) {
		this.posId = posId;
	}

	public Date getCdrawOpenDate() {
		return cdrawOpenDate;
	}

	public void setCdrawOpenDate(Date cdrawOpenDate) {
		this.cdrawOpenDate = cdrawOpenDate;
	}

	public Date getCdrawCloseDate() {
		return cdrawCloseDate;
	}

	public void setCdrawCloseDate(Date cdrawCloseDate) {
		this.cdrawCloseDate = cdrawCloseDate;
	}

	public Integer getCdrawPeriodState() {
		return cdrawPeriodState;
	}

	public void setCdrawPeriodState(Integer cdrawPeriodState) {
		this.cdrawPeriodState = cdrawPeriodState;
	}
	
}
