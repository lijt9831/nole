package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.io.Serializable;
import java.util.Date;

public class Nole400Line implements Serializable {
    private Long id;

    private String lineTitle;

    private String type;

    private String mapParams;

    private Date gmtModified;

    private Date gmtCreate;

    private String description;

    private String paramlength;

    private String parammaxgradient;

    private String paramelevation;

    private String paramdowntowndistance;

    private String paramroadcondition;

    private String status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLineTitle() {
        return lineTitle;
    }

    public void setLineTitle(String lineTitle) {
        this.lineTitle = lineTitle == null ? null : lineTitle.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getMapParams() {
        return mapParams;
    }

    public void setMapParams(String mapParams) {
        this.mapParams = mapParams == null ? null : mapParams.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getParamlength() {
        return paramlength;
    }

    public void setParamlength(String paramlength) {
        this.paramlength = paramlength == null ? null : paramlength.trim();
    }

    public String getParammaxgradient() {
        return parammaxgradient;
    }

    public void setParammaxgradient(String parammaxgradient) {
        this.parammaxgradient = parammaxgradient == null ? null : parammaxgradient.trim();
    }

    public String getParamelevation() {
        return paramelevation;
    }

    public void setParamelevation(String paramelevation) {
        this.paramelevation = paramelevation == null ? null : paramelevation.trim();
    }

    public String getParamdowntowndistance() {
        return paramdowntowndistance;
    }

    public void setParamdowntowndistance(String paramdowntowndistance) {
        this.paramdowntowndistance = paramdowntowndistance == null ? null : paramdowntowndistance.trim();
    }

    public String getParamroadcondition() {
        return paramroadcondition;
    }

    public void setParamroadcondition(String paramroadcondition) {
        this.paramroadcondition = paramroadcondition == null ? null : paramroadcondition.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", lineTitle=").append(lineTitle);
        sb.append(", type=").append(type);
        sb.append(", mapParams=").append(mapParams);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", description=").append(description);
        sb.append(", paramlength=").append(paramlength);
        sb.append(", parammaxgradient=").append(parammaxgradient);
        sb.append(", paramelevation=").append(paramelevation);
        sb.append(", paramdowntowndistance=").append(paramdowntowndistance);
        sb.append(", paramroadcondition=").append(paramroadcondition);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}