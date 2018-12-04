package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.io.Serializable;
import java.util.Date;

public class Sys01Permission implements Serializable {
    private Integer id;

    private Integer pid;

    private Integer isTree;

    private Integer isBranch;

    private Integer isLeaf;

    private Integer isVein;

    private Integer isVeinMain;

    private String name;

    private Integer level;

    private Integer order;

    private Integer isCollapsed;

    private String icon;

    private String description;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getIsTree() {
        return isTree;
    }

    public void setIsTree(Integer isTree) {
        this.isTree = isTree;
    }

    public Integer getIsBranch() {
        return isBranch;
    }

    public void setIsBranch(Integer isBranch) {
        this.isBranch = isBranch;
    }

    public Integer getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }

    public Integer getIsVein() {
        return isVein;
    }

    public void setIsVein(Integer isVein) {
        this.isVein = isVein;
    }

    public Integer getIsVeinMain() {
        return isVeinMain;
    }

    public void setIsVeinMain(Integer isVeinMain) {
        this.isVeinMain = isVeinMain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getIsCollapsed() {
        return isCollapsed;
    }

    public void setIsCollapsed(Integer isCollapsed) {
        this.isCollapsed = isCollapsed;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pid=").append(pid);
        sb.append(", isTree=").append(isTree);
        sb.append(", isBranch=").append(isBranch);
        sb.append(", isLeaf=").append(isLeaf);
        sb.append(", isVein=").append(isVein);
        sb.append(", isVeinMain=").append(isVeinMain);
        sb.append(", name=").append(name);
        sb.append(", level=").append(level);
        sb.append(", order=").append(order);
        sb.append(", isCollapsed=").append(isCollapsed);
        sb.append(", icon=").append(icon);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}