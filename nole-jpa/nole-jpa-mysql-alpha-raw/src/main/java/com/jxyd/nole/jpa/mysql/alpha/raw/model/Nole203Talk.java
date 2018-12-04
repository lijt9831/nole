package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.io.Serializable;
import java.util.Date;

public class Nole203Talk implements Serializable {
    private Long id;

    private Long nole200Id;

    private Long nole301Id;

    private Long nole203Pid;

    private String path;

    private Date gmtCreate;

    private String type;

    private String content;

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

    public Long getNole301Id() {
        return nole301Id;
    }

    public void setNole301Id(Long nole301Id) {
        this.nole301Id = nole301Id;
    }

    public Long getNole203Pid() {
        return nole203Pid;
    }

    public void setNole203Pid(Long nole203Pid) {
        this.nole203Pid = nole203Pid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nole200Id=").append(nole200Id);
        sb.append(", nole301Id=").append(nole301Id);
        sb.append(", nole203Pid=").append(nole203Pid);
        sb.append(", path=").append(path);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", type=").append(type);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}