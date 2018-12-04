package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.io.Serializable;
import java.util.Date;

public class Nole311RecommendCar implements Serializable {
    private Long id;

    private Long nole304Id;

    private Long nole015Id;

    private Date gmtCreate;

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

    public Long getNole015Id() {
        return nole015Id;
    }

    public void setNole015Id(Long nole015Id) {
        this.nole015Id = nole015Id;
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
        sb.append(", nole304Id=").append(nole304Id);
        sb.append(", nole015Id=").append(nole015Id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}