package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.io.Serializable;
import java.util.Date;

public class Nole308Vote implements Serializable {
    private Long id;

    private Long nole304Id;

    private Long nole200Id;

    private Date gmtCreate;

    private String passOrNot;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNole304Id() {
        return nole304Id;
    }

    public void setNole304Id(Long nole304Id) {
        this.nole304Id = nole304Id;
    }

    public Long getNole200Id() {
        return nole200Id;
    }

    public void setNole200Id(Long nole200Id) {
        this.nole200Id = nole200Id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getPassOrNot() {
        return passOrNot;
    }

    public void setPassOrNot(String passOrNot) {
        this.passOrNot = passOrNot == null ? null : passOrNot.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nole304Id=").append(nole304Id);
        sb.append(", nole200Id=").append(nole200Id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", passOrNot=").append(passOrNot);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}