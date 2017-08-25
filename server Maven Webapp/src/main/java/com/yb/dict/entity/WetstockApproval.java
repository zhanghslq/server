package com.yb.dict.entity;

import java.util.Date;

public class WetstockApproval {
	private Integer wetstock_approval_id;
	private Date datetime;
	private String approving_name;
	private String approving_id;
	public WetstockApproval() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WetstockApproval(Integer wetstock_approval_id, Date datetime,
			String approving_name, String approving_id) {
		super();
		this.wetstock_approval_id = wetstock_approval_id;
		this.datetime = datetime;
		this.approving_name = approving_name;
		this.approving_id = approving_id;
	}
	@Override
	public String toString() {
		return "WetstockApproval [wetstock_approval_id=" + wetstock_approval_id
				+ ", datetime=" + datetime + ", approving_name="
				+ approving_name + ", approving_id=" + approving_id + "]";
	}
	public Integer getWetstock_approval_id() {
		return wetstock_approval_id;
	}
	public void setWetstock_approval_id(Integer wetstock_approval_id) {
		this.wetstock_approval_id = wetstock_approval_id;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public String getApproving_name() {
		return approving_name;
	}
	public void setApproving_name(String approving_name) {
		this.approving_name = approving_name;
	}
	
	public String getApproving_id() {
		return approving_id;
	}
	public void setApproving_id(String approving_id) {
		this.approving_id = approving_id;
	}
}
