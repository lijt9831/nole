package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.io.Serializable;
import java.util.Date;

public class Nole301Activity implements Serializable {
    private Long id;

    private Long nole200Id;

    private Long nole300Id;

    private Long nole400Id;

    private Date gmtCreate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNole200Id() {
        return nole200Id;
    }

    public void setNole200Id(Long nole200Id) {
        this.nole200Id = nole200Id;
    }

    public Long getNole300Id() {
        return nole300Id;
    }

    public void setNole300Id(Long nole300Id) {
        this.nole300Id = nole300Id;
    }

    public Long getNole400Id() {
        return nole400Id;
    }

    public void setNole400Id(Long nole400Id) {
        this.nole400Id = nole400Id;
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
        sb.append(", nole200Id=").append(nole200Id);
        sb.append(", nole300Id=").append(nole300Id);
        sb.append(", nole400Id=").append(nole400Id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}