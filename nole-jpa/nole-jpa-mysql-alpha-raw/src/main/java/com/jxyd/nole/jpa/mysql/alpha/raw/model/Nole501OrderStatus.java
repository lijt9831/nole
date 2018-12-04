package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.io.Serializable;

public class Nole501OrderStatus implements Serializable {
    private Long id;

    private Long nole500Id;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNole500Id() {
        return nole500Id;
    }

    public void setNole500Id(Long nole500Id) {
        this.nole500Id = nole500Id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nole500Id=").append(nole500Id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}