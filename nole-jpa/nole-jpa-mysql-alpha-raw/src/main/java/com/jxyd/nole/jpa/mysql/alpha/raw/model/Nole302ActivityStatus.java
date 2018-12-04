package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.io.Serializable;
import java.util.Date;

public class Nole302ActivityStatus implements Serializable {
    private Long id;

    private Long nole301Id;

    private String status;

    private Date gmtCreate;

    private String availableOrNot;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nole301Id=").append(nole301Id);
        sb.append(", status=").append(status);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", availableOrNot=").append(availableOrNot);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}