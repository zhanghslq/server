package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TblCarduser implements Serializable{
	private BigDecimal carduserId;
	private BigDecimal version;
	private String freezereason;
	private BigDecimal p6;
	private BigDecimal p5;
	private BigDecimal orguserId;
	private BigDecimal p4;
	private BigDecimal iscumulatepoints;
	private BigDecimal p3;
	private BigDecimal locationId;
	private BigDecimal p2;
	private BigDecimal anonymousbanlance;
	private BigDecimal p1;
	private BigDecimal carduserType;
	private BigDecimal customerId;
	private BigDecimal foregiftamount;
	private BigDecimal operId;
	private BigDecimal buildfilestationId;
	private BigDecimal contracttype;
	private BigDecimal cardvalue;
	private BigDecimal issellstatus;
	private BigDecimal isoillimit;
	private BigDecimal deptId;
	private String carlicense;
	private BigDecimal amountlimit;
	private BigDecimal timelimit;
	private BigDecimal carduserStatus;
	private BigDecimal invoiceType;
	private BigDecimal parentId;
	private Date recordTime;
	private BigDecimal cardtypeId;
	private BigDecimal usepin;
	private Date contractexpireddate;
	private BigDecimal currentasn;
	private BigDecimal multilevel;
	private String oillimit;
	private String cardpin;
	private String idno;
	private BigDecimal canloadpoint;
	private BigDecimal cantedilimits;
	private Date lastinvoiceTime;
	private BigDecimal invoiceamount;
	private BigDecimal customerLevel;
	private BigDecimal frequency;
	private String uniqueid;
	private BigDecimal istopup;
	private BigDecimal carType;
	private BigDecimal quantitylimit;
	private String mobilecartype;
	private String name;
	private BigDecimal internal;
	private BigDecimal clearMethod;
	private BigDecimal companycustomerId;
	private String merchandiselimit;
	private BigDecimal ismerlimit;
	private String stationlimit;
	private BigDecimal quantitynumber;
	private BigDecimal carseriesId;
	private BigDecimal pintrytimes;
	private BigDecimal isupdateclientinfo;
	private BigDecimal cardId;
	private BigDecimal carmodelId;
	private BigDecimal ismastercard;
	private String notes;
	private BigDecimal recnum;
	private BigDecimal crstate;
	private BigDecimal opfstate;
	private BigDecimal osastate;
	public TblCarduser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblCarduser(BigDecimal carduserId, BigDecimal version,
			String freezereason, BigDecimal p6, BigDecimal p5,
			BigDecimal orguserId, BigDecimal p4, BigDecimal iscumulatepoints,
			BigDecimal p3, BigDecimal locationId, BigDecimal p2,
			BigDecimal anonymousbanlance, BigDecimal p1,
			BigDecimal carduserType, BigDecimal customerId,
			BigDecimal foregiftamount, BigDecimal operId,
			BigDecimal buildfilestationId, BigDecimal contracttype,
			BigDecimal cardvalue, BigDecimal issellstatus,
			BigDecimal isoillimit, BigDecimal deptId, String carlicense,
			BigDecimal amountlimit, BigDecimal timelimit,
			BigDecimal carduserStatus, BigDecimal invoiceType,
			BigDecimal parentId, Date recordTime, BigDecimal cardtypeId,
			BigDecimal usepin, Date contractexpireddate, BigDecimal currentasn,
			BigDecimal multilevel, String oillimit, String cardpin,
			String idno, BigDecimal canloadpoint, BigDecimal cantedilimits,
			Date lastinvoiceTime, BigDecimal invoiceamount,
			BigDecimal customerLevel, BigDecimal frequency, String uniqueid,
			BigDecimal istopup, BigDecimal carType, BigDecimal quantitylimit,
			String mobilecartype, String name, BigDecimal internal,
			BigDecimal clearMethod, BigDecimal companycustomerId,
			String merchandiselimit, BigDecimal ismerlimit,
			String stationlimit, BigDecimal quantitynumber,
			BigDecimal carseriesId, BigDecimal pintrytimes,
			BigDecimal isupdateclientinfo, BigDecimal cardId,
			BigDecimal carmodelId, BigDecimal ismastercard, String notes,
			BigDecimal recnum, BigDecimal crstate, BigDecimal opfstate,
			BigDecimal osastate) {
		super();
		this.carduserId = carduserId;
		this.version = version;
		this.freezereason = freezereason;
		this.p6 = p6;
		this.p5 = p5;
		this.orguserId = orguserId;
		this.p4 = p4;
		this.iscumulatepoints = iscumulatepoints;
		this.p3 = p3;
		this.locationId = locationId;
		this.p2 = p2;
		this.anonymousbanlance = anonymousbanlance;
		this.p1 = p1;
		this.carduserType = carduserType;
		this.customerId = customerId;
		this.foregiftamount = foregiftamount;
		this.operId = operId;
		this.buildfilestationId = buildfilestationId;
		this.contracttype = contracttype;
		this.cardvalue = cardvalue;
		this.issellstatus = issellstatus;
		this.isoillimit = isoillimit;
		this.deptId = deptId;
		this.carlicense = carlicense;
		this.amountlimit = amountlimit;
		this.timelimit = timelimit;
		this.carduserStatus = carduserStatus;
		this.invoiceType = invoiceType;
		this.parentId = parentId;
		this.recordTime = recordTime;
		this.cardtypeId = cardtypeId;
		this.usepin = usepin;
		this.contractexpireddate = contractexpireddate;
		this.currentasn = currentasn;
		this.multilevel = multilevel;
		this.oillimit = oillimit;
		this.cardpin = cardpin;
		this.idno = idno;
		this.canloadpoint = canloadpoint;
		this.cantedilimits = cantedilimits;
		this.lastinvoiceTime = lastinvoiceTime;
		this.invoiceamount = invoiceamount;
		this.customerLevel = customerLevel;
		this.frequency = frequency;
		this.uniqueid = uniqueid;
		this.istopup = istopup;
		this.carType = carType;
		this.quantitylimit = quantitylimit;
		this.mobilecartype = mobilecartype;
		this.name = name;
		this.internal = internal;
		this.clearMethod = clearMethod;
		this.companycustomerId = companycustomerId;
		this.merchandiselimit = merchandiselimit;
		this.ismerlimit = ismerlimit;
		this.stationlimit = stationlimit;
		this.quantitynumber = quantitynumber;
		this.carseriesId = carseriesId;
		this.pintrytimes = pintrytimes;
		this.isupdateclientinfo = isupdateclientinfo;
		this.cardId = cardId;
		this.carmodelId = carmodelId;
		this.ismastercard = ismastercard;
		this.notes = notes;
		this.recnum = recnum;
		this.crstate = crstate;
		this.opfstate = opfstate;
		this.osastate = osastate;
	}
	@Override
	public String toString() {
		return "TblCarduser [carduserId=" + carduserId + ", version=" + version
				+ ", freezereason=" + freezereason + ", p6=" + p6 + ", p5="
				+ p5 + ", orguserId=" + orguserId + ", p4=" + p4
				+ ", iscumulatepoints=" + iscumulatepoints + ", p3=" + p3
				+ ", locationId=" + locationId + ", p2=" + p2
				+ ", anonymousbanlance=" + anonymousbanlance + ", p1=" + p1
				+ ", carduserType=" + carduserType + ", customerId="
				+ customerId + ", foregiftamount=" + foregiftamount
				+ ", operId=" + operId + ", buildfilestationId="
				+ buildfilestationId + ", contracttype=" + contracttype
				+ ", cardvalue=" + cardvalue + ", issellstatus=" + issellstatus
				+ ", isoillimit=" + isoillimit + ", deptId=" + deptId
				+ ", carlicense=" + carlicense + ", amountlimit=" + amountlimit
				+ ", timelimit=" + timelimit + ", carduserStatus="
				+ carduserStatus + ", invoiceType=" + invoiceType
				+ ", parentId=" + parentId + ", recordTime=" + recordTime
				+ ", cardtypeId=" + cardtypeId + ", usepin=" + usepin
				+ ", contractexpireddate=" + contractexpireddate
				+ ", currentasn=" + currentasn + ", multilevel=" + multilevel
				+ ", oillimit=" + oillimit + ", cardpin=" + cardpin + ", idno="
				+ idno + ", canloadpoint=" + canloadpoint + ", cantedilimits="
				+ cantedilimits + ", lastinvoiceTime=" + lastinvoiceTime
				+ ", invoiceamount=" + invoiceamount + ", customerLevel="
				+ customerLevel + ", frequency=" + frequency + ", uniqueid="
				+ uniqueid + ", istopup=" + istopup + ", carType=" + carType
				+ ", quantitylimit=" + quantitylimit + ", mobilecartype="
				+ mobilecartype + ", name=" + name + ", internal=" + internal
				+ ", clearMethod=" + clearMethod + ", companycustomerId="
				+ companycustomerId + ", merchandiselimit=" + merchandiselimit
				+ ", ismerlimit=" + ismerlimit + ", stationlimit="
				+ stationlimit + ", quantitynumber=" + quantitynumber
				+ ", carseriesId=" + carseriesId + ", pintrytimes="
				+ pintrytimes + ", isupdateclientinfo=" + isupdateclientinfo
				+ ", cardId=" + cardId + ", carmodelId=" + carmodelId
				+ ", ismastercard=" + ismastercard + ", notes=" + notes
				+ ", recnum=" + recnum + ", crstate=" + crstate + ", opfstate="
				+ opfstate + ", osastate=" + osastate + "]";
	}
	public BigDecimal getCarduserId() {
		return carduserId;
	}
	public void setCarduserId(BigDecimal carduserId) {
		this.carduserId = carduserId;
	}
	public BigDecimal getVersion() {
		return version;
	}
	public void setVersion(BigDecimal version) {
		this.version = version;
	}
	public String getFreezereason() {
		return freezereason;
	}
	public void setFreezereason(String freezereason) {
		this.freezereason = freezereason;
	}
	public BigDecimal getP6() {
		return p6;
	}
	public void setP6(BigDecimal p6) {
		this.p6 = p6;
	}
	public BigDecimal getP5() {
		return p5;
	}
	public void setP5(BigDecimal p5) {
		this.p5 = p5;
	}
	public BigDecimal getOrguserId() {
		return orguserId;
	}
	public void setOrguserId(BigDecimal orguserId) {
		this.orguserId = orguserId;
	}
	public BigDecimal getP4() {
		return p4;
	}
	public void setP4(BigDecimal p4) {
		this.p4 = p4;
	}
	public BigDecimal getIscumulatepoints() {
		return iscumulatepoints;
	}
	public void setIscumulatepoints(BigDecimal iscumulatepoints) {
		this.iscumulatepoints = iscumulatepoints;
	}
	public BigDecimal getP3() {
		return p3;
	}
	public void setP3(BigDecimal p3) {
		this.p3 = p3;
	}
	public BigDecimal getLocationId() {
		return locationId;
	}
	public void setLocationId(BigDecimal locationId) {
		this.locationId = locationId;
	}
	public BigDecimal getP2() {
		return p2;
	}
	public void setP2(BigDecimal p2) {
		this.p2 = p2;
	}
	public BigDecimal getAnonymousbanlance() {
		return anonymousbanlance;
	}
	public void setAnonymousbanlance(BigDecimal anonymousbanlance) {
		this.anonymousbanlance = anonymousbanlance;
	}
	public BigDecimal getP1() {
		return p1;
	}
	public void setP1(BigDecimal p1) {
		this.p1 = p1;
	}
	public BigDecimal getCarduserType() {
		return carduserType;
	}
	public void setCarduserType(BigDecimal carduserType) {
		this.carduserType = carduserType;
	}
	public BigDecimal getCustomerId() {
		return customerId;
	}
	public void setCustomerId(BigDecimal customerId) {
		this.customerId = customerId;
	}
	public BigDecimal getForegiftamount() {
		return foregiftamount;
	}
	public void setForegiftamount(BigDecimal foregiftamount) {
		this.foregiftamount = foregiftamount;
	}
	public BigDecimal getOperId() {
		return operId;
	}
	public void setOperId(BigDecimal operId) {
		this.operId = operId;
	}
	public BigDecimal getBuildfilestationId() {
		return buildfilestationId;
	}
	public void setBuildfilestationId(BigDecimal buildfilestationId) {
		this.buildfilestationId = buildfilestationId;
	}
	public BigDecimal getContracttype() {
		return contracttype;
	}
	public void setContracttype(BigDecimal contracttype) {
		this.contracttype = contracttype;
	}
	public BigDecimal getCardvalue() {
		return cardvalue;
	}
	public void setCardvalue(BigDecimal cardvalue) {
		this.cardvalue = cardvalue;
	}
	public BigDecimal getIssellstatus() {
		return issellstatus;
	}
	public void setIssellstatus(BigDecimal issellstatus) {
		this.issellstatus = issellstatus;
	}
	public BigDecimal getIsoillimit() {
		return isoillimit;
	}
	public void setIsoillimit(BigDecimal isoillimit) {
		this.isoillimit = isoillimit;
	}
	public BigDecimal getDeptId() {
		return deptId;
	}
	public void setDeptId(BigDecimal deptId) {
		this.deptId = deptId;
	}
	public String getCarlicense() {
		return carlicense;
	}
	public void setCarlicense(String carlicense) {
		this.carlicense = carlicense;
	}
	public BigDecimal getAmountlimit() {
		return amountlimit;
	}
	public void setAmountlimit(BigDecimal amountlimit) {
		this.amountlimit = amountlimit;
	}
	public BigDecimal getTimelimit() {
		return timelimit;
	}
	public void setTimelimit(BigDecimal timelimit) {
		this.timelimit = timelimit;
	}
	public BigDecimal getCarduserStatus() {
		return carduserStatus;
	}
	public void setCarduserStatus(BigDecimal carduserStatus) {
		this.carduserStatus = carduserStatus;
	}
	public BigDecimal getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(BigDecimal invoiceType) {
		this.invoiceType = invoiceType;
	}
	public BigDecimal getParentId() {
		return parentId;
	}
	public void setParentId(BigDecimal parentId) {
		this.parentId = parentId;
	}
	public Date getRecordTime() {
		return recordTime;
	}
	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}
	public BigDecimal getCardtypeId() {
		return cardtypeId;
	}
	public void setCardtypeId(BigDecimal cardtypeId) {
		this.cardtypeId = cardtypeId;
	}
	public BigDecimal getUsepin() {
		return usepin;
	}
	public void setUsepin(BigDecimal usepin) {
		this.usepin = usepin;
	}
	public Date getContractexpireddate() {
		return contractexpireddate;
	}
	public void setContractexpireddate(Date contractexpireddate) {
		this.contractexpireddate = contractexpireddate;
	}
	public BigDecimal getCurrentasn() {
		return currentasn;
	}
	public void setCurrentasn(BigDecimal currentasn) {
		this.currentasn = currentasn;
	}
	public BigDecimal getMultilevel() {
		return multilevel;
	}
	public void setMultilevel(BigDecimal multilevel) {
		this.multilevel = multilevel;
	}
	public String getOillimit() {
		return oillimit;
	}
	public void setOillimit(String oillimit) {
		this.oillimit = oillimit;
	}
	public String getCardpin() {
		return cardpin;
	}
	public void setCardpin(String cardpin) {
		this.cardpin = cardpin;
	}
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}
	public BigDecimal getCanloadpoint() {
		return canloadpoint;
	}
	public void setCanloadpoint(BigDecimal canloadpoint) {
		this.canloadpoint = canloadpoint;
	}
	public BigDecimal getCantedilimits() {
		return cantedilimits;
	}
	public void setCantedilimits(BigDecimal cantedilimits) {
		this.cantedilimits = cantedilimits;
	}
	public Date getLastinvoiceTime() {
		return lastinvoiceTime;
	}
	public void setLastinvoiceTime(Date lastinvoiceTime) {
		this.lastinvoiceTime = lastinvoiceTime;
	}
	public BigDecimal getInvoiceamount() {
		return invoiceamount;
	}
	public void setInvoiceamount(BigDecimal invoiceamount) {
		this.invoiceamount = invoiceamount;
	}
	public BigDecimal getCustomerLevel() {
		return customerLevel;
	}
	public void setCustomerLevel(BigDecimal customerLevel) {
		this.customerLevel = customerLevel;
	}
	public BigDecimal getFrequency() {
		return frequency;
	}
	public void setFrequency(BigDecimal frequency) {
		this.frequency = frequency;
	}
	public String getUniqueid() {
		return uniqueid;
	}
	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}
	public BigDecimal getIstopup() {
		return istopup;
	}
	public void setIstopup(BigDecimal istopup) {
		this.istopup = istopup;
	}
	public BigDecimal getCarType() {
		return carType;
	}
	public void setCarType(BigDecimal carType) {
		this.carType = carType;
	}
	public BigDecimal getQuantitylimit() {
		return quantitylimit;
	}
	public void setQuantitylimit(BigDecimal quantitylimit) {
		this.quantitylimit = quantitylimit;
	}
	public String getMobilecartype() {
		return mobilecartype;
	}
	public void setMobilecartype(String mobilecartype) {
		this.mobilecartype = mobilecartype;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getInternal() {
		return internal;
	}
	public void setInternal(BigDecimal internal) {
		this.internal = internal;
	}
	public BigDecimal getClearMethod() {
		return clearMethod;
	}
	public void setClearMethod(BigDecimal clearMethod) {
		this.clearMethod = clearMethod;
	}
	public BigDecimal getCompanycustomerId() {
		return companycustomerId;
	}
	public void setCompanycustomerId(BigDecimal companycustomerId) {
		this.companycustomerId = companycustomerId;
	}
	public String getMerchandiselimit() {
		return merchandiselimit;
	}
	public void setMerchandiselimit(String merchandiselimit) {
		this.merchandiselimit = merchandiselimit;
	}
	public BigDecimal getIsmerlimit() {
		return ismerlimit;
	}
	public void setIsmerlimit(BigDecimal ismerlimit) {
		this.ismerlimit = ismerlimit;
	}
	public String getStationlimit() {
		return stationlimit;
	}
	public void setStationlimit(String stationlimit) {
		this.stationlimit = stationlimit;
	}
	public BigDecimal getQuantitynumber() {
		return quantitynumber;
	}
	public void setQuantitynumber(BigDecimal quantitynumber) {
		this.quantitynumber = quantitynumber;
	}
	public BigDecimal getCarseriesId() {
		return carseriesId;
	}
	public void setCarseriesId(BigDecimal carseriesId) {
		this.carseriesId = carseriesId;
	}
	public BigDecimal getPintrytimes() {
		return pintrytimes;
	}
	public void setPintrytimes(BigDecimal pintrytimes) {
		this.pintrytimes = pintrytimes;
	}
	public BigDecimal getIsupdateclientinfo() {
		return isupdateclientinfo;
	}
	public void setIsupdateclientinfo(BigDecimal isupdateclientinfo) {
		this.isupdateclientinfo = isupdateclientinfo;
	}
	public BigDecimal getCardId() {
		return cardId;
	}
	public void setCardId(BigDecimal cardId) {
		this.cardId = cardId;
	}
	public BigDecimal getCarmodelId() {
		return carmodelId;
	}
	public void setCarmodelId(BigDecimal carmodelId) {
		this.carmodelId = carmodelId;
	}
	public BigDecimal getIsmastercard() {
		return ismastercard;
	}
	public void setIsmastercard(BigDecimal ismastercard) {
		this.ismastercard = ismastercard;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public BigDecimal getRecnum() {
		return recnum;
	}
	public void setRecnum(BigDecimal recnum) {
		this.recnum = recnum;
	}
	public BigDecimal getCrstate() {
		return crstate;
	}
	public void setCrstate(BigDecimal crstate) {
		this.crstate = crstate;
	}
	public BigDecimal getOpfstate() {
		return opfstate;
	}
	public void setOpfstate(BigDecimal opfstate) {
		this.opfstate = opfstate;
	}
	public BigDecimal getOsastate() {
		return osastate;
	}
	public void setOsastate(BigDecimal osastate) {
		this.osastate = osastate;
	}
	
	
	
}
