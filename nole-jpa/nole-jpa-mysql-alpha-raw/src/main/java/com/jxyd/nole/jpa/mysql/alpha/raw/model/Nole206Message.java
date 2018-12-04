package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.io.Serializable;
import java.util.Date;

public class Nole206Message implements Serializable {
    private Long id;

    private Long nole200Id;

    private Date gmtCreate;

    private String type;

    private String content;

    private String availableOrNot;

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

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
        sb.append(", nole200Id=").append(nole200Id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", type=").append(type);
        sb.append(", content=").append(content);
        sb.append(", availableOrNot=").append(availableOrNot);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}