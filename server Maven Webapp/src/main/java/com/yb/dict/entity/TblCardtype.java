package com.yb.dict.entity;

import java.math.BigDecimal;

public class TblCardtype {
	private BigDecimal id;
	private BigDecimal version;
	private String restrictcommodities;
	private BigDecimal mindeposit;
	private BigDecimal validityday;
	private BigDecimal initbalance;
	private BigDecimal ismerlimit;
	private BigDecimal annualaudit;
	private BigDecimal base_card_type;
	private BigDecimal canrevcate;
	private BigDecimal daysperextention;
	private BigDecimal depositable;
	private BigDecimal anonymous;
	private BigDecimal targetarea_id;
	private BigDecimal upperlimit;
	private BigDecimal style_id;
	private String description;
	private String name;
	private BigDecimal auditdaysinadvance;
	private BigDecimal customer_level;
	private BigDecimal physicalcardtype;
	private BigDecimal internal;
	public TblCardtype() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblCardtype(BigDecimal id, BigDecimal version,
			String restrictcommodities, BigDecimal mindeposit,
			BigDecimal validityday, BigDecimal initbalance,
			BigDecimal ismerlimit, BigDecimal annualaudit,
			BigDecimal base_card_type, BigDecimal canrevcate,
			BigDecimal daysperextention, BigDecimal depositable,
			BigDecimal anonymous, BigDecimal targetarea_id,
			BigDecimal upperlimit, BigDecimal style_id, String description,
			String name, BigDecimal auditdaysinadvance,
			BigDecimal customer_level, BigDecimal physicalcardtype,
			BigDecimal internal) {
		super();
		this.id = id;
		this.version = version;
		this.restrictcommodities = restrictcommodities;
		this.mindeposit = mindeposit;
		this.validityday = validityday;
		this.initbalance = initbalance;
		this.ismerlimit = ismerlimit;
		this.annualaudit = annualaudit;
		this.base_card_type = base_card_type;
		this.canrevcate = canrevcate;
		this.daysperextention = daysperextention;
		this.depositable = depositable;
		this.anonymous = anonymous;
		this.targetarea_id = targetarea_id;
		this.upperlimit = upperlimit;
		this.style_id = style_id;
		this.description = description;
		this.name = name;
		this.auditdaysinadvance = auditdaysinadvance;
		this.customer_level = customer_level;
		this.physicalcardtype = physicalcardtype;
		this.internal = internal;
	}
	@Override
	public String toString() {
		return "TblCardtype [id=" + id + ", version=" + version
				+ ", restrictcommodities=" + restrictcommodities
				+ ", mindeposit=" + mindeposit + ", validityday=" + validityday
				+ ", initbalance=" + initbalance + ", ismerlimit=" + ismerlimit
				+ ", annualaudit=" + annualaudit + ", base_card_type="
				+ base_card_type + ", canrevcate=" + canrevcate
				+ ", daysperextention=" + daysperextention + ", depositable="
				+ depositable + ", anonymous=" + anonymous + ", targetarea_id="
				+ targetarea_id + ", upperlimit=" + upperlimit + ", style_id="
				+ style_id + ", description=" + description + ", name=" + name
				+ ", auditdaysinadvance=" + auditdaysinadvance
				+ ", customer_level=" + customer_level + ", physicalcardtype="
				+ physicalcardtype + ", internal=" + internal + "]";
	}
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public BigDecimal getVersion() {
		return version;
	}
	public void setVersion(BigDecimal version) {
		this.version = version;
	}
	public String getRestrictcommodities() {
		return restrictcommodities;
	}
	public void setRestrictcommodities(String restrictcommodities) {
		this.restrictcommodities = restrictcommodities;
	}
	public BigDecimal getMindeposit() {
		return mindeposit;
	}
	public void setMindeposit(BigDecimal mindeposit) {
		this.mindeposit = mindeposit;
	}
	public BigDecimal getValidityday() {
		return validityday;
	}
	public void setValidityday(BigDecimal validityday) {
		this.validityday = validityday;
	}
	public BigDecimal getInitbalance() {
		return initbalance;
	}
	public void setInitbalance(BigDecimal initbalance) {
		this.initbalance = initbalance;
	}
	public BigDecimal getIsmerlimit() {
		return ismerlimit;
	}
	public void setIsmerlimit(BigDecimal ismerlimit) {
		this.ismerlimit = ismerlimit;
	}
	public BigDecimal getAnnualaudit() {
		return annualaudit;
	}
	public void setAnnualaudit(BigDecimal annualaudit) {
		this.annualaudit = annualaudit;
	}
	public BigDecimal getBase_card_type() {
		return base_card_type;
	}
	public void setBase_card_type(BigDecimal base_card_type) {
		this.base_card_type = base_card_type;
	}
	public BigDecimal getCanrevcate() {
		return canrevcate;
	}
	public void setCanrevcate(BigDecimal canrevcate) {
		this.canrevcate = canrevcate;
	}
	public BigDecimal getDaysperextention() {
		return daysperextention;
	}
	public void setDaysperextention(BigDecimal daysperextention) {
		this.daysperextention = daysperextention;
	}
	public BigDecimal getDepositable() {
		return depositable;
	}
	public void setDepositable(BigDecimal depositable) {
		this.depositable = depositable;
	}
	public BigDecimal getAnonymous() {
		return anonymous;
	}
	public void setAnonymous(BigDecimal anonymous) {
		this.anonymous = anonymous;
	}
	public BigDecimal getTargetarea_id() {
		return targetarea_id;
	}
	public void setTargetarea_id(BigDecimal targetarea_id) {
		this.targetarea_id = targetarea_id;
	}
	public BigDecimal getUpperlimit() {
		return upperlimit;
	}
	public void setUpperlimit(BigDecimal upperlimit) {
		this.upperlimit = upperlimit;
	}
	public BigDecimal getStyle_id() {
		return style_id;
	}
	public void setStyle_id(BigDecimal style_id) {
		this.style_id = style_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getAuditdaysinadvance() {
		return auditdaysinadvance;
	}
	public void setAuditdaysinadvance(BigDecimal auditdaysinadvance) {
		this.auditdaysinadvance = auditdaysinadvance;
	}
	public BigDecimal getCustomer_level() {
		return customer_level;
	}
	public void setCustomer_level(BigDecimal customer_level) {
		this.customer_level = customer_level;
	}
	public BigDecimal getPhysicalcardtype() {
		return physicalcardtype;
	}
	public void setPhysicalcardtype(BigDecimal physicalcardtype) {
		this.physicalcardtype = physicalcardtype;
	}
	public BigDecimal getInternal() {
		return internal;
	}
	public void setInternal(BigDecimal internal) {
		this.internal = internal;
	}
}
