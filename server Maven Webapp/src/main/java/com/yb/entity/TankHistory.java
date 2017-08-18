package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TankHistory implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer periodId;
	private Integer tankId;
	private BigDecimal openGaugeVolume;
	private BigDecimal closeGaugeVolume;
	private BigDecimal openTheoVolume;
	private BigDecimal closeTheoVolume;
	private BigDecimal openDipVolume;
	private BigDecimal closeDipVolume;
	private BigDecimal hoseDelQuantity;
	private BigDecimal hoseDelVolume;
	private BigDecimal hoseDelValue;
	private BigDecimal hoseDelCost;
	private BigDecimal tankDelQuantity;
	private BigDecimal tankDelVolume;
	private BigDecimal tankDelCost;
	private BigDecimal tankLossQuantity;
	private BigDecimal tankLossVolume;
	private BigDecimal tankTransferInQuantity;
	private BigDecimal tankTransferInVolume;
	private BigDecimal tankTransferOutQuantity;
	private BigDecimal tankTransferOutVolume;
	private BigDecimal dipFuelTemp;
	private BigDecimal dipFuelDensity;
	private BigDecimal openDipWaterVolume;
	private BigDecimal closeDipWaterVolume;
	private BigDecimal openGaugeTcVolume;
	private BigDecimal closeGaugeTcVolume;
	private BigDecimal openWaterVolume;
	private BigDecimal closeWaterVolume;
	private BigDecimal openFuelDensity;
	
	private BigDecimal closeFuelDensity;
	private BigDecimal openFuelTemp;
	
	private BigDecimal closeFuelTemp;
	private Integer openTankProbeStatusId;
	private Integer closeTankProbeStatusId;
	private Date tankReadingDt;
	private Integer openTankDeliveryStateId;
	private Integer closeTankDeliveryStateId;
	private Integer openPumpDeliveryState;
	private Integer closePumpDeliveryState;
	private Integer openDipTypeId;
	private Integer closeDipTypeId;
	private String TankVarianceReasonId;
	public TankHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TankHistory(Integer periodId, Integer tankId,
			BigDecimal openGaugeVolume, BigDecimal closeGaugeVolume,
			BigDecimal openTheoVolume, BigDecimal closeTheoVolume,
			BigDecimal openDipVolume, BigDecimal closeDipVolume,
			BigDecimal hoseDelQuantity, BigDecimal hoseDelVolume,
			BigDecimal hoseDelValue, BigDecimal hoseDelCost,
			BigDecimal tankDelQuantity, BigDecimal tankDelVolume,
			BigDecimal tankDelCost, BigDecimal tankLossQuantity,
			BigDecimal tankLossVolume, BigDecimal tankTransferInQuantity,
			BigDecimal tankTransferInVolume,
			BigDecimal tankTransferOutQuantity,
			BigDecimal tankTransferOutVolume, BigDecimal dipFuelTemp,
			BigDecimal dipFuelDensity, BigDecimal openDipWaterVolume,
			BigDecimal closeDipWaterVolume, BigDecimal openGaugeTcVolume,
			BigDecimal closeGaugeTcVolume, BigDecimal openWaterVolume,
			BigDecimal closeWaterVolume, BigDecimal openFuelDensity,
			BigDecimal closeFuelDensity, BigDecimal openFuelTemp,
			BigDecimal closeFuelTemp, Integer openTankProbeStatusId,
			Integer closeTankProbeStatusId, Date tankReadingDt,
			Integer openTankDeliveryStateId, Integer closeTankDeliveryStateId,
			Integer openPumpDeliveryState, Integer closePumpDeliveryState,
			Integer openDipTypeId, Integer closeDipTypeId,
			String tankVarianceReasonId) {
		super();
		this.periodId = periodId;
		this.tankId = tankId;
		this.openGaugeVolume = openGaugeVolume;
		this.closeGaugeVolume = closeGaugeVolume;
		this.openTheoVolume = openTheoVolume;
		this.closeTheoVolume = closeTheoVolume;
		this.openDipVolume = openDipVolume;
		this.closeDipVolume = closeDipVolume;
		this.hoseDelQuantity = hoseDelQuantity;
		this.hoseDelVolume = hoseDelVolume;
		this.hoseDelValue = hoseDelValue;
		this.hoseDelCost = hoseDelCost;
		this.tankDelQuantity = tankDelQuantity;
		this.tankDelVolume = tankDelVolume;
		this.tankDelCost = tankDelCost;
		this.tankLossQuantity = tankLossQuantity;
		this.tankLossVolume = tankLossVolume;
		this.tankTransferInQuantity = tankTransferInQuantity;
		this.tankTransferInVolume = tankTransferInVolume;
		this.tankTransferOutQuantity = tankTransferOutQuantity;
		this.tankTransferOutVolume = tankTransferOutVolume;
		this.dipFuelTemp = dipFuelTemp;
		this.dipFuelDensity = dipFuelDensity;
		this.openDipWaterVolume = openDipWaterVolume;
		this.closeDipWaterVolume = closeDipWaterVolume;
		this.openGaugeTcVolume = openGaugeTcVolume;
		this.closeGaugeTcVolume = closeGaugeTcVolume;
		this.openWaterVolume = openWaterVolume;
		this.closeWaterVolume = closeWaterVolume;
		this.openFuelDensity = openFuelDensity;
		this.closeFuelDensity = closeFuelDensity;
		this.openFuelTemp = openFuelTemp;
		this.closeFuelTemp = closeFuelTemp;
		this.openTankProbeStatusId = openTankProbeStatusId;
		this.closeTankProbeStatusId = closeTankProbeStatusId;
		this.tankReadingDt = tankReadingDt;
		this.openTankDeliveryStateId = openTankDeliveryStateId;
		this.closeTankDeliveryStateId = closeTankDeliveryStateId;
		this.openPumpDeliveryState = openPumpDeliveryState;
		this.closePumpDeliveryState = closePumpDeliveryState;
		this.openDipTypeId = openDipTypeId;
		this.closeDipTypeId = closeDipTypeId;
		TankVarianceReasonId = tankVarianceReasonId;
	}
	@Override
	public String toString() {
		return "TankHistory [periodId=" + periodId + ", tankId=" + tankId
				+ ", openGaugeVolume=" + openGaugeVolume
				+ ", closeGaugeVolume=" + closeGaugeVolume
				+ ", openTheoVolume=" + openTheoVolume + ", closeTheoVolume="
				+ closeTheoVolume + ", openDipVolume=" + openDipVolume
				+ ", closeDipVolume=" + closeDipVolume + ", hoseDelQuantity="
				+ hoseDelQuantity + ", hoseDelVolume=" + hoseDelVolume
				+ ", hoseDelValue=" + hoseDelValue + ", hoseDelCost="
				+ hoseDelCost + ", tankDelQuantity=" + tankDelQuantity
				+ ", tankDelVolume=" + tankDelVolume + ", tankDelCost="
				+ tankDelCost + ", tankLossQuantity=" + tankLossQuantity
				+ ", tankLossVolume=" + tankLossVolume
				+ ", tankTransferInQuantity=" + tankTransferInQuantity
				+ ", tankTransferInVolume=" + tankTransferInVolume
				+ ", tankTransferOutQuantity=" + tankTransferOutQuantity
				+ ", tankTransferOutVolume=" + tankTransferOutVolume
				+ ", dipFuelTemp=" + dipFuelTemp + ", dipFuelDensity="
				+ dipFuelDensity + ", openDipWaterVolume=" + openDipWaterVolume
				+ ", closeDipWaterVolume=" + closeDipWaterVolume
				+ ", openGaugeTcVolume=" + openGaugeTcVolume
				+ ", closeGaugeTcVolume=" + closeGaugeTcVolume
				+ ", openWaterVolume=" + openWaterVolume
				+ ", closeWaterVolume=" + closeWaterVolume
				+ ", openFuelDensity=" + openFuelDensity
				+ ", closeFuelDensity=" + closeFuelDensity + ", openFuelTemp="
				+ openFuelTemp + ", closeFuelTemp=" + closeFuelTemp
				+ ", openTankProbeStatusId=" + openTankProbeStatusId
				+ ", closeTankProbeStatusId=" + closeTankProbeStatusId
				+ ", tankReadingDt=" + tankReadingDt
				+ ", openTankDeliveryStateId=" + openTankDeliveryStateId
				+ ", closeTankDeliveryStateId=" + closeTankDeliveryStateId
				+ ", openPumpDeliveryState=" + openPumpDeliveryState
				+ ", closePumpDeliveryState=" + closePumpDeliveryState
				+ ", openDipTypeId=" + openDipTypeId + ", closeDipTypeId="
				+ closeDipTypeId + ", TankVarianceReasonId="
				+ TankVarianceReasonId + "]";
	}
	public Integer getPeriodId() {
		return periodId;
	}
	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}
	public Integer getTankId() {
		return tankId;
	}
	public void setTankId(Integer tankId) {
		this.tankId = tankId;
	}
	public BigDecimal getOpenGaugeVolume() {
		return openGaugeVolume;
	}
	public void setOpenGaugeVolume(BigDecimal openGaugeVolume) {
		this.openGaugeVolume = openGaugeVolume;
	}
	public BigDecimal getCloseGaugeVolume() {
		return closeGaugeVolume;
	}
	public void setCloseGaugeVolume(BigDecimal closeGaugeVolume) {
		this.closeGaugeVolume = closeGaugeVolume;
	}
	public BigDecimal getOpenTheoVolume() {
		return openTheoVolume;
	}
	public void setOpenTheoVolume(BigDecimal openTheoVolume) {
		this.openTheoVolume = openTheoVolume;
	}
	public BigDecimal getCloseTheoVolume() {
		return closeTheoVolume;
	}
	public void setCloseTheoVolume(BigDecimal closeTheoVolume) {
		this.closeTheoVolume = closeTheoVolume;
	}
	public BigDecimal getOpenDipVolume() {
		return openDipVolume;
	}
	public void setOpenDipVolume(BigDecimal openDipVolume) {
		this.openDipVolume = openDipVolume;
	}
	public BigDecimal getCloseDipVolume() {
		return closeDipVolume;
	}
	public void setCloseDipVolume(BigDecimal closeDipVolume) {
		this.closeDipVolume = closeDipVolume;
	}
	public BigDecimal getHoseDelQuantity() {
		return hoseDelQuantity;
	}
	public void setHoseDelQuantity(BigDecimal hoseDelQuantity) {
		this.hoseDelQuantity = hoseDelQuantity;
	}
	public BigDecimal getHoseDelVolume() {
		return hoseDelVolume;
	}
	public void setHoseDelVolume(BigDecimal hoseDelVolume) {
		this.hoseDelVolume = hoseDelVolume;
	}
	public BigDecimal getHoseDelValue() {
		return hoseDelValue;
	}
	public void setHoseDelValue(BigDecimal hoseDelValue) {
		this.hoseDelValue = hoseDelValue;
	}
	public BigDecimal getHoseDelCost() {
		return hoseDelCost;
	}
	public void setHoseDelCost(BigDecimal hoseDelCost) {
		this.hoseDelCost = hoseDelCost;
	}
	public BigDecimal getTankDelQuantity() {
		return tankDelQuantity;
	}
	public void setTankDelQuantity(BigDecimal tankDelQuantity) {
		this.tankDelQuantity = tankDelQuantity;
	}
	public BigDecimal getTankDelVolume() {
		return tankDelVolume;
	}
	public void setTankDelVolume(BigDecimal tankDelVolume) {
		this.tankDelVolume = tankDelVolume;
	}
	public BigDecimal getTankDelCost() {
		return tankDelCost;
	}
	public void setTankDelCost(BigDecimal tankDelCost) {
		this.tankDelCost = tankDelCost;
	}
	public BigDecimal getTankLossQuantity() {
		return tankLossQuantity;
	}
	public void setTankLossQuantity(BigDecimal tankLossQuantity) {
		this.tankLossQuantity = tankLossQuantity;
	}
	public BigDecimal getTankLossVolume() {
		return tankLossVolume;
	}
	public void setTankLossVolume(BigDecimal tankLossVolume) {
		this.tankLossVolume = tankLossVolume;
	}
	public BigDecimal getTankTransferInQuantity() {
		return tankTransferInQuantity;
	}
	public void setTankTransferInQuantity(BigDecimal tankTransferInQuantity) {
		this.tankTransferInQuantity = tankTransferInQuantity;
	}
	public BigDecimal getTankTransferInVolume() {
		return tankTransferInVolume;
	}
	public void setTankTransferInVolume(BigDecimal tankTransferInVolume) {
		this.tankTransferInVolume = tankTransferInVolume;
	}
	public BigDecimal getTankTransferOutQuantity() {
		return tankTransferOutQuantity;
	}
	public void setTankTransferOutQuantity(BigDecimal tankTransferOutQuantity) {
		this.tankTransferOutQuantity = tankTransferOutQuantity;
	}
	public BigDecimal getTankTransferOutVolume() {
		return tankTransferOutVolume;
	}
	public void setTankTransferOutVolume(BigDecimal tankTransferOutVolume) {
		this.tankTransferOutVolume = tankTransferOutVolume;
	}
	public BigDecimal getDipFuelTemp() {
		return dipFuelTemp;
	}
	public void setDipFuelTemp(BigDecimal dipFuelTemp) {
		this.dipFuelTemp = dipFuelTemp;
	}
	public BigDecimal getDipFuelDensity() {
		return dipFuelDensity;
	}
	public void setDipFuelDensity(BigDecimal dipFuelDensity) {
		this.dipFuelDensity = dipFuelDensity;
	}
	public BigDecimal getOpenDipWaterVolume() {
		return openDipWaterVolume;
	}
	public void setOpenDipWaterVolume(BigDecimal openDipWaterVolume) {
		this.openDipWaterVolume = openDipWaterVolume;
	}
	public BigDecimal getCloseDipWaterVolume() {
		return closeDipWaterVolume;
	}
	public void setCloseDipWaterVolume(BigDecimal closeDipWaterVolume) {
		this.closeDipWaterVolume = closeDipWaterVolume;
	}
	public BigDecimal getOpenGaugeTcVolume() {
		return openGaugeTcVolume;
	}
	public void setOpenGaugeTcVolume(BigDecimal openGaugeTcVolume) {
		this.openGaugeTcVolume = openGaugeTcVolume;
	}
	public BigDecimal getCloseGaugeTcVolume() {
		return closeGaugeTcVolume;
	}
	public void setCloseGaugeTcVolume(BigDecimal closeGaugeTcVolume) {
		this.closeGaugeTcVolume = closeGaugeTcVolume;
	}
	public BigDecimal getOpenWaterVolume() {
		return openWaterVolume;
	}
	public void setOpenWaterVolume(BigDecimal openWaterVolume) {
		this.openWaterVolume = openWaterVolume;
	}
	public BigDecimal getCloseWaterVolume() {
		return closeWaterVolume;
	}
	public void setCloseWaterVolume(BigDecimal closeWaterVolume) {
		this.closeWaterVolume = closeWaterVolume;
	}
	public BigDecimal getOpenFuelDensity() {
		return openFuelDensity;
	}
	public void setOpenFuelDensity(BigDecimal openFuelDensity) {
		this.openFuelDensity = openFuelDensity;
	}
	public BigDecimal getCloseFuelDensity() {
		return closeFuelDensity;
	}
	public void setCloseFuelDensity(BigDecimal closeFuelDensity) {
		this.closeFuelDensity = closeFuelDensity;
	}
	public BigDecimal getOpenFuelTemp() {
		return openFuelTemp;
	}
	public void setOpenFuelTemp(BigDecimal openFuelTemp) {
		this.openFuelTemp = openFuelTemp;
	}
	public BigDecimal getCloseFuelTemp() {
		return closeFuelTemp;
	}
	public void setCloseFuelTemp(BigDecimal closeFuelTemp) {
		this.closeFuelTemp = closeFuelTemp;
	}
	public Integer getOpenTankProbeStatusId() {
		return openTankProbeStatusId;
	}
	public void setOpenTankProbeStatusId(Integer openTankProbeStatusId) {
		this.openTankProbeStatusId = openTankProbeStatusId;
	}
	public Integer getCloseTankProbeStatusId() {
		return closeTankProbeStatusId;
	}
	public void setCloseTankProbeStatusId(Integer closeTankProbeStatusId) {
		this.closeTankProbeStatusId = closeTankProbeStatusId;
	}
	public Date getTankReadingDt() {
		return tankReadingDt;
	}
	public void setTankReadingDt(Date tankReadingDt) {
		this.tankReadingDt = tankReadingDt;
	}
	public Integer getOpenTankDeliveryStateId() {
		return openTankDeliveryStateId;
	}
	public void setOpenTankDeliveryStateId(Integer openTankDeliveryStateId) {
		this.openTankDeliveryStateId = openTankDeliveryStateId;
	}
	public Integer getCloseTankDeliveryStateId() {
		return closeTankDeliveryStateId;
	}
	public void setCloseTankDeliveryStateId(Integer closeTankDeliveryStateId) {
		this.closeTankDeliveryStateId = closeTankDeliveryStateId;
	}
	public Integer getOpenPumpDeliveryState() {
		return openPumpDeliveryState;
	}
	public void setOpenPumpDeliveryState(Integer openPumpDeliveryState) {
		this.openPumpDeliveryState = openPumpDeliveryState;
	}
	public Integer getClosePumpDeliveryState() {
		return closePumpDeliveryState;
	}
	public void setClosePumpDeliveryState(Integer closePumpDeliveryState) {
		this.closePumpDeliveryState = closePumpDeliveryState;
	}
	public Integer getOpenDipTypeId() {
		return openDipTypeId;
	}
	public void setOpenDipTypeId(Integer openDipTypeId) {
		this.openDipTypeId = openDipTypeId;
	}
	public Integer getCloseDipTypeId() {
		return closeDipTypeId;
	}
	public void setCloseDipTypeId(Integer closeDipTypeId) {
		this.closeDipTypeId = closeDipTypeId;
	}
	public String getTankVarianceReasonId() {
		return TankVarianceReasonId;
	}
	public void setTankVarianceReasonId(String tankVarianceReasonId) {
		TankVarianceReasonId = tankVarianceReasonId;
	}
	
}
