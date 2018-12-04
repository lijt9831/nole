package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Nole304ActivityVersion implements Serializable {
    private Long id;

    private Long nole301Id;

    private String onsaleOrNot;

    private Integer version;

    private String remark;

    private Integer participantNo;

    private Integer shouldNo;

    private Integer actualNo;

    private Date gmtModified;

    private Date gmtCreate;

    private String availableOrNot;

    private String activitySubject;

    private Date activityStart;

    private Date activityEnd;

    private String gatherPoint;

    private Date gatherTime;

    private String frequencyBand;

    private String powerCondition;

    private Integer applyNo;

    private Integer maxNo;

    private BigDecimal frontMoney;

    private Date handDown;

    private Date handUp;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNole301Id() {
        return nole301Id;
    }

    public void setNole301Id(Long nole301Id) {
        this.nole301Id = nole301Id;
    }

    public String getOnsaleOrNot() {
        return onsaleOrNot;
    }

    public void setOnsaleOrNot(String onsaleOrNot) {
        this.onsaleOrNot = onsaleOrNot == null ? null : onsaleOrNot.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(Integer participantNo) {
        this.participantNo = participantNo;
    }

    public Integer getShouldNo() {
        return shouldNo;
    }

    public void setShouldNo(Integer shouldNo) {
        this.shouldNo = shouldNo;
    }

    public Integer getActualNo() {
        return actualNo;
    }

    public void setActualNo(Integer actualNo) {
        this.actualNo = actualNo;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getAvailableOrNot() {
        return availableOrNot;
    }

    public void setAvailableOrNot(String availableOrNot) {
        this.availableOrNot = availableOrNot == null ? null : availableOrNot.trim();
    }

    public String getActivitySubject() {
        return activitySubject;
    }

    public void setActivitySubject(String activitySubject) {
        this.activitySubject = activitySubject == null ? null : activitySubject.trim();
    }

    public Date getActivityStart() {
        return activityStart;
    }

    public void setActivityStart(Date activityStart) {
        this.activityStart = activityStart;
    }

    public Date getActivityEnd() {
        return activityEnd;
    }

    public void setActivityEnd(Date activityEnd) {
        this.activityEnd = activityEnd;
    }

    public String getGatherPoint() {
        return gatherPoint;
    }

    public void setGatherPoint(String gatherPoint) {
        this.gatherPoint = gatherPoint == null ? null : gatherPoint.trim();
    }

    public Date getGatherTime() {
        return gatherTime;
    }

    public void setGatherTime(Date gatherTime) {
        this.gatherTime = gatherTime;
    }

    public String getFrequencyBand() {
        return frequencyBand;
    }

    public void setFrequencyBand(String frequencyBand) {
        this.frequencyBand = frequencyBand == null ? null : frequencyBand.trim();
    }

    public String getPowerCondition() {
        return powerCondition;
    }

    public void setPowerCondition(String powerCondition) {
        this.powerCondition = powerCondition == null ? null : powerCondition.trim();
    }

    public Integer getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(Integer applyNo) {
        this.applyNo = applyNo;
    }

    public Integer getMaxNo() {
        return maxNo;
    }

    public void setMaxNo(Integer maxNo) {
        this.maxNo = maxNo;
    }

    public BigDecimal getFrontMoney() {
        return frontMoney;
    }

    public void setFrontMoney(BigDecimal frontMoney) {
        this.frontMoney = frontMoney;
    }

    public Date getHandDown() {
        return handDown;
    }

    public void setHandDown(Date handDown) {
        this.handDown = handDown;
    }

    public Date getHandUp() {
        return handUp;
    }

    public void setHandUp(Date handUp) {
        this.handUp = handUp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nole301Id=").append(nole301Id);
        sb.append(", onsaleOrNot=").append(onsaleOrNot);
        sb.append(", version=").append(version);
        sb.append(", remark=").append(remark);
        sb.append(", participantNo=").append(participantNo);
        sb.append(", shouldNo=").append(shouldNo);
        sb.append(", actualNo=").append(actualNo);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", availableOrNot=").append(availableOrNot);
        sb.append(", activitySubject=").append(activitySubject);
        sb.append(", activityStart=").append(activityStart);
        sb.append(", activityEnd=").append(activityEnd);
        sb.append(", gatherPoint=").append(gatherPoint);
        sb.append(", gatherTime=").append(gatherTime);
        sb.append(", frequencyBand=").append(frequencyBand);
        sb.append(", powerCondition=").append(powerCondition);
        sb.append(", applyNo=").append(applyNo);
        sb.append(", maxNo=").append(maxNo);
        sb.append(", frontMoney=").append(frontMoney);
        sb.append(", handDown=").append(handDown);
        sb.append(", handUp=").append(handUp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}