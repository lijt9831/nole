package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.io.Serializable;
import java.util.Date;

public class Nole016Equitment implements Serializable {
    private Long id;

    private Long nole200Id;

    private String equitment;

    private Integer orderr;

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

    public String getEquitment() {
        return equitment;
    }

    public void setEquitment(String equitment) {
        this.equitment = equitment == null ? null : equitment.trim();
    }

    public Integer getOrderr() {
        return orderr;
    }

    public void setOrderr(Integer orderr) {
        this.orderr = orderr;
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
        sb.append(", equitment=").append(equitment);
        sb.append(", orderr=").append(orderr);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}