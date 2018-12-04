package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.io.Serializable;

public class Nole500Order implements Serializable {
    private Long id;

    private Long nole200Id;

    private String inBizNo;

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

    public String getInBizNo() {
        return inBizNo;
    }

    public void setInBizNo(String inBizNo) {
        this.inBizNo = inBizNo == null ? null : inBizNo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nole200Id=").append(nole200Id);
        sb.append(", inBizNo=").append(inBizNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}