package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.io.Serializable;
import java.util.Date;

public class Sys04User implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String passwordSalt;

    private String accountMobile;

    private String accountEmail;

    private String nickname;

    private Integer validateStatusMobile;

    private Integer validateStatusEmail;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt == null ? null : passwordSalt.trim();
    }

    public String getAccountMobile() {
        return accountMobile;
    }

    public void setAccountMobile(String accountMobile) {
        this.accountMobile = accountMobile == null ? null : accountMobile.trim();
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail == null ? null : accountEmail.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getValidateStatusMobile() {
        return validateStatusMobile;
    }

    public void setValidateStatusMobile(Integer validateStatusMobile) {
        this.validateStatusMobile = validateStatusMobile;
    }

    public Integer getValidateStatusEmail() {
        return validateStatusEmail;
    }

    public void setValidateStatusEmail(Integer validateStatusEmail) {
        this.validateStatusEmail = validateStatusEmail;
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
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", passwordSalt=").append(passwordSalt);
        sb.append(", accountMobile=").append(accountMobile);
        sb.append(", accountEmail=").append(accountEmail);
        sb.append(", nickname=").append(nickname);
        sb.append(", validateStatusMobile=").append(validateStatusMobile);
        sb.append(", validateStatusEmail=").append(validateStatusEmail);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}