package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.io.Serializable;
import java.util.Date;

public class Nole200User implements Serializable {
    private Long id;

    private String wxOpenid;

    private String wxSessionKey;

    private String wxNickName;

    private String wxAvatarUrl;

    private String wxGender;

    private String wxCity;

    private String wxProvince;

    private String wxCountry;

    private String mobile;

    private String truename;

    private String nickname;

    private String verifiedOrNot;

    private Date gmtModified;

    private Date gmtCreate;

    private String availableOrNot;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid == null ? null : wxOpenid.trim();
    }

    public String getWxSessionKey() {
        return wxSessionKey;
    }

    public void setWxSessionKey(String wxSessionKey) {
        this.wxSessionKey = wxSessionKey == null ? null : wxSessionKey.trim();
    }

    public String getWxNickName() {
        return wxNickName;
    }

    public void setWxNickName(String wxNickName) {
        this.wxNickName = wxNickName == null ? null : wxNickName.trim();
    }

    public String getWxAvatarUrl() {
        return wxAvatarUrl;
    }

    public void setWxAvatarUrl(String wxAvatarUrl) {
        this.wxAvatarUrl = wxAvatarUrl == null ? null : wxAvatarUrl.trim();
    }

    public String getWxGender() {
        return wxGender;
    }

    public void setWxGender(String wxGender) {
        this.wxGender = wxGender == null ? null : wxGender.trim();
    }

    public String getWxCity() {
        return wxCity;
    }

    public void setWxCity(String wxCity) {
        this.wxCity = wxCity == null ? null : wxCity.trim();
    }

    public String getWxProvince() {
        return wxProvince;
    }

    public void setWxProvince(String wxProvince) {
        this.wxProvince = wxProvince == null ? null : wxProvince.trim();
    }

    public String getWxCountry() {
        return wxCountry;
    }

    public void setWxCountry(String wxCountry) {
        this.wxCountry = wxCountry == null ? null : wxCountry.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getVerifiedOrNot() {
        return verifiedOrNot;
    }

    public void setVerifiedOrNot(String verifiedOrNot) {
        this.verifiedOrNot = verifiedOrNot == null ? null : verifiedOrNot.trim();
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
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
        sb.append(", wxOpenid=").append(wxOpenid);
        sb.append(", wxSessionKey=").append(wxSessionKey);
        sb.append(", wxNickName=").append(wxNickName);
        sb.append(", wxAvatarUrl=").append(wxAvatarUrl);
        sb.append(", wxGender=").append(wxGender);
        sb.append(", wxCity=").append(wxCity);
        sb.append(", wxProvince=").append(wxProvince);
        sb.append(", wxCountry=").append(wxCountry);
        sb.append(", mobile=").append(mobile);
        sb.append(", truename=").append(truename);
        sb.append(", nickname=").append(nickname);
        sb.append(", verifiedOrNot=").append(verifiedOrNot);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", availableOrNot=").append(availableOrNot);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}