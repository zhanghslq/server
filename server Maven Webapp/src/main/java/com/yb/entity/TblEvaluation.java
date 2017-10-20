package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TblEvaluation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal evaluationId;
	private BigDecimal version;
	private String content;
	private String time;
	private BigDecimal status;
	private BigDecimal star;
	private BigDecimal orgId;
	private BigDecimal customerId;
	private BigDecimal tradeId;
	
	//新增五个评分字段
	private BigDecimal STAR1;
	private BigDecimal STAR2;
	private BigDecimal STAR3;
	private BigDecimal STAR4;
	private BigDecimal STAR5;
	public BigDecimal getSTAR1() {
		return STAR1;
	}
	public void setSTAR1(BigDecimal sTAR1) {
		STAR1 = sTAR1;
	}
	public BigDecimal getSTAR2() {
		return STAR2;
	}
	public void setSTAR2(BigDecimal sTAR2) {
		STAR2 = sTAR2;
	}
	public BigDecimal getSTAR3() {
		return STAR3;
	}
	public void setSTAR3(BigDecimal sTAR3) {
		STAR3 = sTAR3;
	}
	public BigDecimal getSTAR4() {
		return STAR4;
	}
	public void setSTAR4(BigDecimal sTAR4) {
		STAR4 = sTAR4;
	}
	public BigDecimal getSTAR5() {
		return STAR5;
	}
	public void setSTAR5(BigDecimal sTAR5) {
		STAR5 = sTAR5;
	}
	public TblEvaluation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblEvaluation(BigDecimal evaluationId, BigDecimal version,
			String content, String time, BigDecimal status, BigDecimal star,
			BigDecimal orgId, BigDecimal customerId, BigDecimal tradeId) {
		super();
		this.evaluationId = evaluationId;
		this.version = version;
		this.content = content;
		this.time = time;
		this.status = status;
		this.star = star;
		this.orgId = orgId;
		this.customerId = customerId;
		this.tradeId = tradeId;
	}
	@Override
	public String toString() {
		return "TblEvaluation [evaluationId=" + evaluationId + ", version="
				+ version + ", content=" + content + ", time=" + time
				+ ", status=" + status + ", star=" + star + ", orgId=" + orgId
				+ ", customerId=" + customerId + ", tradeId=" + tradeId + "]";
	}
	public BigDecimal getEvaluationId() {
		return evaluationId;
	}
	public void setEvaluationId(BigDecimal evaluationId) {
		this.evaluationId = evaluationId;
	}
	public BigDecimal getVersion() {
		return version;
	}
	public void setVersion(BigDecimal version) {
		this.version = version;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public BigDecimal getStatus() {
		return status;
	}
	public void setStatus(BigDecimal status) {
		this.status = status;
	}
	public BigDecimal getStar() {
		return star;
	}
	public void setStar(BigDecimal star) {
		this.star = star;
	}
	public BigDecimal getOrgId() {
		return orgId;
	}
	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}
	public BigDecimal getCustomerId() {
		return customerId;
	}
	public void setCustomerId(BigDecimal customerId) {
		this.customerId = customerId;
	}
	public BigDecimal getTradeId() {
		return tradeId;
	}
	public void setTradeId(BigDecimal tradeId) {
		this.tradeId = tradeId;
	}
	
}
