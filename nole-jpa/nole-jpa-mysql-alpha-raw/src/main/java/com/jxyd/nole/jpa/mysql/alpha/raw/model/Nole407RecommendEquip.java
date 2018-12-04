package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.io.Serializable;
import java.util.Date;

public class Nole407RecommendEquip implements Serializable {
    private Long id;

    private Long nole400Id;

    private Long nole016Id;

    private Date gmtCreate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNole400Id() {
        return nole400Id;
    }

    public void setNole400Id(Long nole400Id) {
        this.nole400Id = nole400Id;
    }

    public Long getNole016Id() {
        return nole016Id;
    }

    public void setNole016Id(Long nole016Id) {
        this.nole016Id = nole016Id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nole400Id=").append(nole400Id);
        sb.append(", nole016Id=").append(nole016Id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}