package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class HoseHistory implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer periodId;
	private Integer hoseId;
	private BigDecimal openMeterValue;
	private BigDecimal closeMeterValue;
	private BigDecimal postpayQuantity;
	private BigDecimal openMeterVolume;
	private BigDecimal postpayValue;
	private BigDecimal closeMeterVolume;
	private BigDecimal postpayVolume;
	private BigDecimal postpayCost;
	private BigDecimal prepayQuantity;
	private BigDecimal prepayValue;
	private BigDecimal prepayVolume;
	private BigDecimal prepayCost;
	private BigDecimal prepayRefundQty;
	private BigDecimal prepayRefundVal;
	private BigDecimal preauthQuantity;
	private BigDecimal prepayRfdLstQty;
	private BigDecimal preauthValue;
	private BigDecimal prepayRfdLstVal;
	private BigDecimal preauthVolume;
	private BigDecimal preauthCost;
	private BigDecimal monitorQuantity;
	private BigDecimal monitorValue;
	private BigDecimal monitorVolume;
	private BigDecimal monitorCost;
	private BigDecimal driveoffsQuantity;
	private BigDecimal driveoffsValue;
	private BigDecimal driveoffsVolume;
	private BigDecimal driveoffsCost;
	private BigDecimal testDelQuantity;
	private BigDecimal testDelVolume;
	private BigDecimal offlineQuantity;
	private BigDecimal offlineVolume;
	private BigDecimal offlineValue;
	private BigDecimal offlineCost;
	private BigDecimal openMechVolume;
	private BigDecimal closeMechVolume;
	private BigDecimal openVolumeTurnoverCorrection;
	private BigDecimal openMoneyTurnoverCorrection;
	private BigDecimal closeVolumeTurnoverCorrection;
	private BigDecimal closeMoneyTurnoverCorrection;
	private BigDecimal openVolumeTurnoverCorrection2;
	private BigDecimal closeVolumeTurnoverCorrection2;
	private BigDecimal hoseVolDisc;
	private BigDecimal hoseValDisc;
	private BigDecimal hoseVolSurc;
	private BigDecimal HoseValSurc;
	public HoseHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoseHistory(Integer periodId, Integer hoseId,
			BigDecimal openMeterValue, BigDecimal closeMeterValue,
			BigDecimal postpayQuantity, BigDecimal openMeterVolume,
			BigDecimal postpayValue, BigDecimal closeMeterVolume,
			BigDecimal postpayVolume, BigDecimal postpayCost,
			BigDecimal prepayQuantity, BigDecimal prepayValue,
			BigDecimal prepayVolume, BigDecimal prepayCost,
			BigDecimal prepayRefundQty, BigDecimal prepayRefundVal,
			BigDecimal preauthQuantity, BigDecimal prepayRfdLstQty,
			BigDecimal preauthValue, BigDecimal prepayRfdLstVal,
			BigDecimal preauthVolume, BigDecimal preauthCost,
			BigDecimal monitorQuantity, BigDecimal monitorValue,
			BigDecimal monitorVolume, BigDecimal monitorCost,
			BigDecimal driveoffsQuantity, BigDecimal driveoffsValue,
			BigDecimal driveoffsVolume, BigDecimal driveoffsCost,
			BigDecimal testDelQuantity, BigDecimal testDelVolume,
			BigDecimal offlineQuantity, BigDecimal offlineVolume,
			BigDecimal offlineValue, BigDecimal offlineCost,
			BigDecimal openMechVolume, BigDecimal closeMechVolume,
			BigDecimal openVolumeTurnoverCorrection,
			BigDecimal openMoneyTurnoverCorrection,
			BigDecimal closeVolumeTurnoverCorrection,
			BigDecimal closeMoneyTurnoverCorrection,
			BigDecimal openVolumeTurnoverCorrection2,
			BigDecimal closeVolumeTurnoverCorrection2, BigDecimal hoseVolDisc,
			BigDecimal hoseValDisc, BigDecimal hoseVolSurc,
			BigDecimal hoseValSurc) {
		super();
		this.periodId = periodId;
		this.hoseId = hoseId;
		this.openMeterValue = openMeterValue;
		this.closeMeterValue = closeMeterValue;
		this.postpayQuantity = postpayQuantity;
		this.openMeterVolume = openMeterVolume;
		this.postpayValue = postpayValue;
		this.closeMeterVolume = closeMeterVolume;
		this.postpayVolume = postpayVolume;
		this.postpayCost = postpayCost;
		this.prepayQuantity = prepayQuantity;
		this.prepayValue = prepayValue;
		this.prepayVolume = prepayVolume;
		this.prepayCost = prepayCost;
		this.prepayRefundQty = prepayRefundQty;
		this.prepayRefundVal = prepayRefundVal;
		this.preauthQuantity = preauthQuantity;
		this.prepayRfdLstQty = prepayRfdLstQty;
		this.preauthValue = preauthValue;
		this.prepayRfdLstVal = prepayRfdLstVal;
		this.preauthVolume = preauthVolume;
		this.preauthCost = preauthCost;
		this.monitorQuantity = monitorQuantity;
		this.monitorValue = monitorValue;
		this.monitorVolume = monitorVolume;
		this.monitorCost = monitorCost;
		this.driveoffsQuantity = driveoffsQuantity;
		this.driveoffsValue = driveoffsValue;
		this.driveoffsVolume = driveoffsVolume;
		this.driveoffsCost = driveoffsCost;
		this.testDelQuantity = testDelQuantity;
		this.testDelVolume = testDelVolume;
		this.offlineQuantity = offlineQuantity;
		this.offlineVolume = offlineVolume;
		this.offlineValue = offlineValue;
		this.offlineCost = offlineCost;
		this.openMechVolume = openMechVolume;
		this.closeMechVolume = closeMechVolume;
		this.openVolumeTurnoverCorrection = openVolumeTurnoverCorrection;
		this.openMoneyTurnoverCorrection = openMoneyTurnoverCorrection;
		this.closeVolumeTurnoverCorrection = closeVolumeTurnoverCorrection;
		this.closeMoneyTurnoverCorrection = closeMoneyTurnoverCorrection;
		this.openVolumeTurnoverCorrection2 = openVolumeTurnoverCorrection2;
		this.closeVolumeTurnoverCorrection2 = closeVolumeTurnoverCorrection2;
		this.hoseVolDisc = hoseVolDisc;
		this.hoseValDisc = hoseValDisc;
		this.hoseVolSurc = hoseVolSurc;
		HoseValSurc = hoseValSurc;
	}
	@Override
	public String toString() {
		return "HoseHistory [periodId=" + periodId + ", hoseId=" + hoseId
				+ ", openMeterValue=" + openMeterValue + ", closeMeterValue="
				+ closeMeterValue + ", postpayQuantity=" + postpayQuantity
				+ ", openMeterVolume=" + openMeterVolume + ", postpayValue="
				+ postpayValue + ", closeMeterVolume=" + closeMeterVolume
				+ ", postpayVolume=" + postpayVolume + ", postpayCost="
				+ postpayCost + ", prepayQuantity=" + prepayQuantity
				+ ", prepayValue=" + prepayValue + ", prepayVolume="
				+ prepayVolume + ", prepayCost=" + prepayCost
				+ ", prepayRefundQty=" + prepayRefundQty + ", prepayRefundVal="
				+ prepayRefundVal + ", preauthQuantity=" + preauthQuantity
				+ ", prepayRfdLstQty=" + prepayRfdLstQty + ", preauthValue="
				+ preauthValue + ", prepayRfdLstVal=" + prepayRfdLstVal
				+ ", preauthVolume=" + preauthVolume + ", preauthCost="
				+ preauthCost + ", monitorQuantity=" + monitorQuantity
				+ ", monitorValue=" + monitorValue + ", monitorVolume="
				+ monitorVolume + ", monitorCost=" + monitorCost
				+ ", driveoffsQuantity=" + driveoffsQuantity
				+ ", driveoffsValue=" + driveoffsValue + ", driveoffsVolume="
				+ driveoffsVolume + ", driveoffsCost=" + driveoffsCost
				+ ", testDelQuantity=" + testDelQuantity + ", testDelVolume="
				+ testDelVolume + ", offlineQuantity=" + offlineQuantity
				+ ", offlineVolume=" + offlineVolume + ", offlineValue="
				+ offlineValue + ", offlineCost=" + offlineCost
				+ ", openMechVolume=" + openMechVolume + ", closeMechVolume="
				+ closeMechVolume + ", openVolumeTurnoverCorrection="
				+ openVolumeTurnoverCorrection
				+ ", openMoneyTurnoverCorrection="
				+ openMoneyTurnoverCorrection
				+ ", closeVolumeTurnoverCorrection="
				+ closeVolumeTurnoverCorrection
				+ ", closeMoneyTurnoverCorrection="
				+ closeMoneyTurnoverCorrection
				+ ", openVolumeTurnoverCorrection2="
				+ openVolumeTurnoverCorrection2
				+ ", closeVolumeTurnoverCorrection2="
				+ closeVolumeTurnoverCorrection2 + ", hoseVolDisc="
				+ hoseVolDisc + ", hoseValDisc=" + hoseValDisc
				+ ", hoseVolSurc=" + hoseVolSurc + ", HoseValSurc="
				+ HoseValSurc + "]";
	}
	public Integer getPeriodId() {
		return periodId;
	}
	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}
	public Integer getHoseId() {
		return hoseId;
	}
	public void setHoseId(Integer hoseId) {
		this.hoseId = hoseId;
	}
	public BigDecimal getOpenMeterValue() {
		return openMeterValue;
	}
	public void setOpenMeterValue(BigDecimal openMeterValue) {
		this.openMeterValue = openMeterValue;
	}
	public BigDecimal getCloseMeterValue() {
		return closeMeterValue;
	}
	public void setCloseMeterValue(BigDecimal closeMeterValue) {
		this.closeMeterValue = closeMeterValue;
	}
	public BigDecimal getPostpayQuantity() {
		return postpayQuantity;
	}
	public void setPostpayQuantity(BigDecimal postpayQuantity) {
		this.postpayQuantity = postpayQuantity;
	}
	public BigDecimal getOpenMeterVolume() {
		return openMeterVolume;
	}
	public void setOpenMeterVolume(BigDecimal openMeterVolume) {
		this.openMeterVolume = openMeterVolume;
	}
	public BigDecimal getPostpayValue() {
		return postpayValue;
	}
	public void setPostpayValue(BigDecimal postpayValue) {
		this.postpayValue = postpayValue;
	}
	public BigDecimal getCloseMeterVolume() {
		return closeMeterVolume;
	}
	public void setCloseMeterVolume(BigDecimal closeMeterVolume) {
		this.closeMeterVolume = closeMeterVolume;
	}
	public BigDecimal getPostpayVolume() {
		return postpayVolume;
	}
	public void setPostpayVolume(BigDecimal postpayVolume) {
		this.postpayVolume = postpayVolume;
	}
	public BigDecimal getPostpayCost() {
		return postpayCost;
	}
	public void setPostpayCost(BigDecimal postpayCost) {
		this.postpayCost = postpayCost;
	}
	public BigDecimal getPrepayQuantity() {
		return prepayQuantity;
	}
	public void setPrepayQuantity(BigDecimal prepayQuantity) {
		this.prepayQuantity = prepayQuantity;
	}
	public BigDecimal getPrepayValue() {
		return prepayValue;
	}
	public void setPrepayValue(BigDecimal prepayValue) {
		this.prepayValue = prepayValue;
	}
	public BigDecimal getPrepayVolume() {
		return prepayVolume;
	}
	public void setPrepayVolume(BigDecimal prepayVolume) {
		this.prepayVolume = prepayVolume;
	}
	public BigDecimal getPrepayCost() {
		return prepayCost;
	}
	public void setPrepayCost(BigDecimal prepayCost) {
		this.prepayCost = prepayCost;
	}
	public BigDecimal getPrepayRefundQty() {
		return prepayRefundQty;
	}
	public void setPrepayRefundQty(BigDecimal prepayRefundQty) {
		this.prepayRefundQty = prepayRefundQty;
	}
	public BigDecimal getPrepayRefundVal() {
		return prepayRefundVal;
	}
	public void setPrepayRefundVal(BigDecimal prepayRefundVal) {
		this.prepayRefundVal = prepayRefundVal;
	}
	public BigDecimal getPreauthQuantity() {
		return preauthQuantity;
	}
	public void setPreauthQuantity(BigDecimal preauthQuantity) {
		this.preauthQuantity = preauthQuantity;
	}
	public BigDecimal getPrepayRfdLstQty() {
		return prepayRfdLstQty;
	}
	public void setPrepayRfdLstQty(BigDecimal prepayRfdLstQty) {
		this.prepayRfdLstQty = prepayRfdLstQty;
	}
	public BigDecimal getPreauthValue() {
		return preauthValue;
	}
	public void setPreauthValue(BigDecimal preauthValue) {
		this.preauthValue = preauthValue;
	}
	public BigDecimal getPrepayRfdLstVal() {
		return prepayRfdLstVal;
	}
	public void setPrepayRfdLstVal(BigDecimal prepayRfdLstVal) {
		this.prepayRfdLstVal = prepayRfdLstVal;
	}
	public BigDecimal getPreauthVolume() {
		return preauthVolume;
	}
	public void setPreauthVolume(BigDecimal preauthVolume) {
		this.preauthVolume = preauthVolume;
	}
	public BigDecimal getPreauthCost() {
		return preauthCost;
	}
	public void setPreauthCost(BigDecimal preauthCost) {
		this.preauthCost = preauthCost;
	}
	public BigDecimal getMonitorQuantity() {
		return monitorQuantity;
	}
	public void setMonitorQuantity(BigDecimal monitorQuantity) {
		this.monitorQuantity = monitorQuantity;
	}
	public BigDecimal getMonitorValue() {
		return monitorValue;
	}
	public void setMonitorValue(BigDecimal monitorValue) {
		this.monitorValue = monitorValue;
	}
	public BigDecimal getMonitorVolume() {
		return monitorVolume;
	}
	public void setMonitorVolume(BigDecimal monitorVolume) {
		this.monitorVolume = monitorVolume;
	}
	public BigDecimal getMonitorCost() {
		return monitorCost;
	}
	public void setMonitorCost(BigDecimal monitorCost) {
		this.monitorCost = monitorCost;
	}
	public BigDecimal getDriveoffsQuantity() {
		return driveoffsQuantity;
	}
	public void setDriveoffsQuantity(BigDecimal driveoffsQuantity) {
		this.driveoffsQuantity = driveoffsQuantity;
	}
	public BigDecimal getDriveoffsValue() {
		return driveoffsValue;
	}
	public void setDriveoffsValue(BigDecimal driveoffsValue) {
		this.driveoffsValue = driveoffsValue;
	}
	public BigDecimal getDriveoffsVolume() {
		return driveoffsVolume;
	}
	public void setDriveoffsVolume(BigDecimal driveoffsVolume) {
		this.driveoffsVolume = driveoffsVolume;
	}
	public BigDecimal getDriveoffsCost() {
		return driveoffsCost;
	}
	public void setDriveoffsCost(BigDecimal driveoffsCost) {
		this.driveoffsCost = driveoffsCost;
	}
	public BigDecimal getTestDelQuantity() {
		return testDelQuantity;
	}
	public void setTestDelQuantity(BigDecimal testDelQuantity) {
		this.testDelQuantity = testDelQuantity;
	}
	public BigDecimal getTestDelVolume() {
		return testDelVolume;
	}
	public void setTestDelVolume(BigDecimal testDelVolume) {
		this.testDelVolume = testDelVolume;
	}
	public BigDecimal getOfflineQuantity() {
		return offlineQuantity;
	}
	public void setOfflineQuantity(BigDecimal offlineQuantity) {
		this.offlineQuantity = offlineQuantity;
	}
	public BigDecimal getOfflineVolume() {
		return offlineVolume;
	}
	public void setOfflineVolume(BigDecimal offlineVolume) {
		this.offlineVolume = offlineVolume;
	}
	public BigDecimal getOfflineValue() {
		return offlineValue;
	}
	public void setOfflineValue(BigDecimal offlineValue) {
		this.offlineValue = offlineValue;
	}
	public BigDecimal getOfflineCost() {
		return offlineCost;
	}
	public void setOfflineCost(BigDecimal offlineCost) {
		this.offlineCost = offlineCost;
	}
	public BigDecimal getOpenMechVolume() {
		return openMechVolume;
	}
	public void setOpenMechVolume(BigDecimal openMechVolume) {
		this.openMechVolume = openMechVolume;
	}
	public BigDecimal getCloseMechVolume() {
		return closeMechVolume;
	}
	public void setCloseMechVolume(BigDecimal closeMechVolume) {
		this.closeMechVolume = closeMechVolume;
	}
	public BigDecimal getOpenVolumeTurnoverCorrection() {
		return openVolumeTurnoverCorrection;
	}
	public void setOpenVolumeTurnoverCorrection(
			BigDecimal openVolumeTurnoverCorrection) {
		this.openVolumeTurnoverCorrection = openVolumeTurnoverCorrection;
	}
	public BigDecimal getOpenMoneyTurnoverCorrection() {
		return openMoneyTurnoverCorrection;
	}
	public void setOpenMoneyTurnoverCorrection(
			BigDecimal openMoneyTurnoverCorrection) {
		this.openMoneyTurnoverCorrection = openMoneyTurnoverCorrection;
	}
	public BigDecimal getCloseVolumeTurnoverCorrection() {
		return closeVolumeTurnoverCorrection;
	}
	public void setCloseVolumeTurnoverCorrection(
			BigDecimal closeVolumeTurnoverCorrection) {
		this.closeVolumeTurnoverCorrection = closeVolumeTurnoverCorrection;
	}
	public BigDecimal getCloseMoneyTurnoverCorrection() {
		return closeMoneyTurnoverCorrection;
	}
	public void setCloseMoneyTurnoverCorrection(
			BigDecimal closeMoneyTurnoverCorrection) {
		this.closeMoneyTurnoverCorrection = closeMoneyTurnoverCorrection;
	}
	public BigDecimal getOpenVolumeTurnoverCorrection2() {
		return openVolumeTurnoverCorrection2;
	}
	public void setOpenVolumeTurnoverCorrection2(
			BigDecimal openVolumeTurnoverCorrection2) {
		this.openVolumeTurnoverCorrection2 = openVolumeTurnoverCorrection2;
	}
	public BigDecimal getCloseVolumeTurnoverCorrection2() {
		return closeVolumeTurnoverCorrection2;
	}
	public void setCloseVolumeTurnoverCorrection2(
			BigDecimal closeVolumeTurnoverCorrection2) {
		this.closeVolumeTurnoverCorrection2 = closeVolumeTurnoverCorrection2;
	}
	public BigDecimal getHoseVolDisc() {
		return hoseVolDisc;
	}
	public void setHoseVolDisc(BigDecimal hoseVolDisc) {
		this.hoseVolDisc = hoseVolDisc;
	}
	public BigDecimal getHoseValDisc() {
		return hoseValDisc;
	}
	public void setHoseValDisc(BigDecimal hoseValDisc) {
		this.hoseValDisc = hoseValDisc;
	}
	public BigDecimal getHoseVolSurc() {
		return hoseVolSurc;
	}
	public void setHoseVolSurc(BigDecimal hoseVolSurc) {
		this.hoseVolSurc = hoseVolSurc;
	}
	public BigDecimal getHoseValSurc() {
		return HoseValSurc;
	}
	public void setHoseValSurc(BigDecimal hoseValSurc) {
		HoseValSurc = hoseValSurc;
	}
	
}
