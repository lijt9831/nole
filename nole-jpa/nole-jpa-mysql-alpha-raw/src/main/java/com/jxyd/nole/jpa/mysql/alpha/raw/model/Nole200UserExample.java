package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Nole200UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Nole200UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("`nole200_id` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`nole200_id` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("`nole200_id` =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("`nole200_id` <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("`nole200_id` >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("`nole200_id` >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("`nole200_id` <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("`nole200_id` <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("`nole200_id` in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("`nole200_id` not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("`nole200_id` between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("`nole200_id` not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWxOpenidIsNull() {
            addCriterion("`wx_openid` is null");
            return (Criteria) this;
        }

        public Criteria andWxOpenidIsNotNull() {
            addCriterion("`wx_openid` is not null");
            return (Criteria) this;
        }

        public Criteria andWxOpenidEqualTo(String value) {
            addCriterion("`wx_openid` =", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotEqualTo(String value) {
            addCriterion("`wx_openid` <>", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidGreaterThan(String value) {
            addCriterion("`wx_openid` >", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("`wx_openid` >=", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLessThan(String value) {
            addCriterion("`wx_openid` <", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLessThanOrEqualTo(String value) {
            addCriterion("`wx_openid` <=", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLike(String value) {
            addCriterion("`wx_openid` like", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotLike(String value) {
            addCriterion("`wx_openid` not like", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidIn(List<String> values) {
            addCriterion("`wx_openid` in", values, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotIn(List<String> values) {
            addCriterion("`wx_openid` not in", values, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidBetween(String value1, String value2) {
            addCriterion("`wx_openid` between", value1, value2, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotBetween(String value1, String value2) {
            addCriterion("`wx_openid` not between", value1, value2, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyIsNull() {
            addCriterion("`wx_session_key` is null");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyIsNotNull() {
            addCriterion("`wx_session_key` is not null");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyEqualTo(String value) {
            addCriterion("`wx_session_key` =", value, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyNotEqualTo(String value) {
            addCriterion("`wx_session_key` <>", value, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyGreaterThan(String value) {
            addCriterion("`wx_session_key` >", value, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyGreaterThanOrEqualTo(String value) {
            addCriterion("`wx_session_key` >=", value, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyLessThan(String value) {
            addCriterion("`wx_session_key` <", value, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyLessThanOrEqualTo(String value) {
            addCriterion("`wx_session_key` <=", value, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyLike(String value) {
            addCriterion("`wx_session_key` like", value, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyNotLike(String value) {
            addCriterion("`wx_session_key` not like", value, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyIn(List<String> values) {
            addCriterion("`wx_session_key` in", values, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyNotIn(List<String> values) {
            addCriterion("`wx_session_key` not in", values, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyBetween(String value1, String value2) {
            addCriterion("`wx_session_key` between", value1, value2, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyNotBetween(String value1, String value2) {
            addCriterion("`wx_session_key` not between", value1, value2, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxNickNameIsNull() {
            addCriterion("`wx_nick_name` is null");
            return (Criteria) this;
        }

        public Criteria andWxNickNameIsNotNull() {
            addCriterion("`wx_nick_name` is not null");
            return (Criteria) this;
        }

        public Criteria andWxNickNameEqualTo(String value) {
            addCriterion("`wx_nick_name` =", value, "wxNickName");
            return (Criteria) this;
        }

        public Criteria andWxNickNameNotEqualTo(String value) {
            addCriterion("`wx_nick_name` <>", value, "wxNickName");
            return (Criteria) this;
        }

        public Criteria andWxNickNameGreaterThan(String value) {
            addCriterion("`wx_nick_name` >", value, "wxNickName");
            return (Criteria) this;
        }

        public Criteria andWxNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("`wx_nick_name` >=", value, "wxNickName");
            return (Criteria) this;
        }

        public Criteria andWxNickNameLessThan(String value) {
            addCriterion("`wx_nick_name` <", value, "wxNickName");
            return (Criteria) this;
        }

        public Criteria andWxNickNameLessThanOrEqualTo(String value) {
            addCriterion("`wx_nick_name` <=", value, "wxNickName");
            return (Criteria) this;
        }

        public Criteria andWxNickNameLike(String value) {
            addCriterion("`wx_nick_name` like", value, "wxNickName");
            return (Criteria) this;
        }

        public Criteria andWxNickNameNotLike(String value) {
            addCriterion("`wx_nick_name` not like", value, "wxNickName");
            return (Criteria) this;
        }

        public Criteria andWxNickNameIn(List<String> values) {
            addCriterion("`wx_nick_name` in", values, "wxNickName");
            return (Criteria) this;
        }

        public Criteria andWxNickNameNotIn(List<String> values) {
            addCriterion("`wx_nick_name` not in", values, "wxNickName");
            return (Criteria) this;
        }

        public Criteria andWxNickNameBetween(String value1, String value2) {
            addCriterion("`wx_nick_name` between", value1, value2, "wxNickName");
            return (Criteria) this;
        }

        public Criteria andWxNickNameNotBetween(String value1, String value2) {
            addCriterion("`wx_nick_name` not between", value1, value2, "wxNickName");
            return (Criteria) this;
        }

        public Criteria andWxAvatarUrlIsNull() {
            addCriterion("`wx_avatar_url` is null");
            return (Criteria) this;
        }

        public Criteria andWxAvatarUrlIsNotNull() {
            addCriterion("`wx_avatar_url` is not null");
            return (Criteria) this;
        }

        public Criteria andWxAvatarUrlEqualTo(String value) {
            addCriterion("`wx_avatar_url` =", value, "wxAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWxAvatarUrlNotEqualTo(String value) {
            addCriterion("`wx_avatar_url` <>", value, "wxAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWxAvatarUrlGreaterThan(String value) {
            addCriterion("`wx_avatar_url` >", value, "wxAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWxAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("`wx_avatar_url` >=", value, "wxAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWxAvatarUrlLessThan(String value) {
            addCriterion("`wx_avatar_url` <", value, "wxAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWxAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("`wx_avatar_url` <=", value, "wxAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWxAvatarUrlLike(String value) {
            addCriterion("`wx_avatar_url` like", value, "wxAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWxAvatarUrlNotLike(String value) {
            addCriterion("`wx_avatar_url` not like", value, "wxAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWxAvatarUrlIn(List<String> values) {
            addCriterion("`wx_avatar_url` in", values, "wxAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWxAvatarUrlNotIn(List<String> values) {
            addCriterion("`wx_avatar_url` not in", values, "wxAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWxAvatarUrlBetween(String value1, String value2) {
            addCriterion("`wx_avatar_url` between", value1, value2, "wxAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWxAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("`wx_avatar_url` not between", value1, value2, "wxAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWxGenderIsNull() {
            addCriterion("`wx_gender` is null");
            return (Criteria) this;
        }

        public Criteria andWxGenderIsNotNull() {
            addCriterion("`wx_gender` is not null");
            return (Criteria) this;
        }

        public Criteria andWxGenderEqualTo(String value) {
            addCriterion("`wx_gender` =", value, "wxGender");
            return (Criteria) this;
        }

        public Criteria andWxGenderNotEqualTo(String value) {
            addCriterion("`wx_gender` <>", value, "wxGender");
            return (Criteria) this;
        }

        public Criteria andWxGenderGreaterThan(String value) {
            addCriterion("`wx_gender` >", value, "wxGender");
            return (Criteria) this;
        }

        public Criteria andWxGenderGreaterThanOrEqualTo(String value) {
            addCriterion("`wx_gender` >=", value, "wxGender");
            return (Criteria) this;
        }

        public Criteria andWxGenderLessThan(String value) {
            addCriterion("`wx_gender` <", value, "wxGender");
            return (Criteria) this;
        }

        public Criteria andWxGenderLessThanOrEqualTo(String value) {
            addCriterion("`wx_gender` <=", value, "wxGender");
            return (Criteria) this;
        }

        public Criteria andWxGenderLike(String value) {
            addCriterion("`wx_gender` like", value, "wxGender");
            return (Criteria) this;
        }

        public Criteria andWxGenderNotLike(String value) {
            addCriterion("`wx_gender` not like", value, "wxGender");
            return (Criteria) this;
        }

        public Criteria andWxGenderIn(List<String> values) {
            addCriterion("`wx_gender` in", values, "wxGender");
            return (Criteria) this;
        }

        public Criteria andWxGenderNotIn(List<String> values) {
            addCriterion("`wx_gender` not in", values, "wxGender");
            return (Criteria) this;
        }

        public Criteria andWxGenderBetween(String value1, String value2) {
            addCriterion("`wx_gender` between", value1, value2, "wxGender");
            return (Criteria) this;
        }

        public Criteria andWxGenderNotBetween(String value1, String value2) {
            addCriterion("`wx_gender` not between", value1, value2, "wxGender");
            return (Criteria) this;
        }

        public Criteria andWxCityIsNull() {
            addCriterion("`wx_city` is null");
            return (Criteria) this;
        }

        public Criteria andWxCityIsNotNull() {
            addCriterion("`wx_city` is not null");
            return (Criteria) this;
        }

        public Criteria andWxCityEqualTo(String value) {
            addCriterion("`wx_city` =", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityNotEqualTo(String value) {
            addCriterion("`wx_city` <>", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityGreaterThan(String value) {
            addCriterion("`wx_city` >", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityGreaterThanOrEqualTo(String value) {
            addCriterion("`wx_city` >=", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityLessThan(String value) {
            addCriterion("`wx_city` <", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityLessThanOrEqualTo(String value) {
            addCriterion("`wx_city` <=", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityLike(String value) {
            addCriterion("`wx_city` like", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityNotLike(String value) {
            addCriterion("`wx_city` not like", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityIn(List<String> values) {
            addCriterion("`wx_city` in", values, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityNotIn(List<String> values) {
            addCriterion("`wx_city` not in", values, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityBetween(String value1, String value2) {
            addCriterion("`wx_city` between", value1, value2, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityNotBetween(String value1, String value2) {
            addCriterion("`wx_city` not between", value1, value2, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxProvinceIsNull() {
            addCriterion("`wx_province` is null");
            return (Criteria) this;
        }

        public Criteria andWxProvinceIsNotNull() {
            addCriterion("`wx_province` is not null");
            return (Criteria) this;
        }

        public Criteria andWxProvinceEqualTo(String value) {
            addCriterion("`wx_province` =", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceNotEqualTo(String value) {
            addCriterion("`wx_province` <>", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceGreaterThan(String value) {
            addCriterion("`wx_province` >", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("`wx_province` >=", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceLessThan(String value) {
            addCriterion("`wx_province` <", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceLessThanOrEqualTo(String value) {
            addCriterion("`wx_province` <=", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceLike(String value) {
            addCriterion("`wx_province` like", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceNotLike(String value) {
            addCriterion("`wx_province` not like", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceIn(List<String> values) {
            addCriterion("`wx_province` in", values, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceNotIn(List<String> values) {
            addCriterion("`wx_province` not in", values, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceBetween(String value1, String value2) {
            addCriterion("`wx_province` between", value1, value2, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceNotBetween(String value1, String value2) {
            addCriterion("`wx_province` not between", value1, value2, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxCountryIsNull() {
            addCriterion("`wx_country` is null");
            return (Criteria) this;
        }

        public Criteria andWxCountryIsNotNull() {
            addCriterion("`wx_country` is not null");
            return (Criteria) this;
        }

        public Criteria andWxCountryEqualTo(String value) {
            addCriterion("`wx_country` =", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryNotEqualTo(String value) {
            addCriterion("`wx_country` <>", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryGreaterThan(String value) {
            addCriterion("`wx_country` >", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryGreaterThanOrEqualTo(String value) {
            addCriterion("`wx_country` >=", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryLessThan(String value) {
            addCriterion("`wx_country` <", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryLessThanOrEqualTo(String value) {
            addCriterion("`wx_country` <=", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryLike(String value) {
            addCriterion("`wx_country` like", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryNotLike(String value) {
            addCriterion("`wx_country` not like", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryIn(List<String> values) {
            addCriterion("`wx_country` in", values, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryNotIn(List<String> values) {
            addCriterion("`wx_country` not in", values, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryBetween(String value1, String value2) {
            addCriterion("`wx_country` between", value1, value2, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryNotBetween(String value1, String value2) {
            addCriterion("`wx_country` not between", value1, value2, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("`mobile` is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("`mobile` is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("`mobile` =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("`mobile` <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("`mobile` >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("`mobile` >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("`mobile` <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("`mobile` <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("`mobile` like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("`mobile` not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("`mobile` in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("`mobile` not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("`mobile` between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("`mobile` not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNull() {
            addCriterion("`truename` is null");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNotNull() {
            addCriterion("`truename` is not null");
            return (Criteria) this;
        }

        public Criteria andTruenameEqualTo(String value) {
            addCriterion("`truename` =", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotEqualTo(String value) {
            addCriterion("`truename` <>", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThan(String value) {
            addCriterion("`truename` >", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("`truename` >=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThan(String value) {
            addCriterion("`truename` <", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThanOrEqualTo(String value) {
            addCriterion("`truename` <=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLike(String value) {
            addCriterion("`truename` like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotLike(String value) {
            addCriterion("`truename` not like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameIn(List<String> values) {
            addCriterion("`truename` in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotIn(List<String> values) {
            addCriterion("`truename` not in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameBetween(String value1, String value2) {
            addCriterion("`truename` between", value1, value2, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotBetween(String value1, String value2) {
            addCriterion("`truename` not between", value1, value2, "truename");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("`nickname` is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("`nickname` is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("`nickname` =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("`nickname` <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("`nickname` >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("`nickname` >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("`nickname` <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("`nickname` <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("`nickname` like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("`nickname` not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("`nickname` in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("`nickname` not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("`nickname` between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("`nickname` not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andVerifiedOrNotIsNull() {
            addCriterion("`verified_or_not` is null");
            return (Criteria) this;
        }

        public Criteria andVerifiedOrNotIsNotNull() {
            addCriterion("`verified_or_not` is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiedOrNotEqualTo(String value) {
            addCriterion("`verified_or_not` =", value, "verifiedOrNot");
            return (Criteria) this;
        }

        public Criteria andVerifiedOrNotNotEqualTo(String value) {
            addCriterion("`verified_or_not` <>", value, "verifiedOrNot");
            return (Criteria) this;
        }

        public Criteria andVerifiedOrNotGreaterThan(String value) {
            addCriterion("`verified_or_not` >", value, "verifiedOrNot");
            return (Criteria) this;
        }

        public Criteria andVerifiedOrNotGreaterThanOrEqualTo(String value) {
            addCriterion("`verified_or_not` >=", value, "verifiedOrNot");
            return (Criteria) this;
        }

        public Criteria andVerifiedOrNotLessThan(String value) {
            addCriterion("`verified_or_not` <", value, "verifiedOrNot");
            return (Criteria) this;
        }

        public Criteria andVerifiedOrNotLessThanOrEqualTo(String value) {
            addCriterion("`verified_or_not` <=", value, "verifiedOrNot");
            return (Criteria) this;
        }

        public Criteria andVerifiedOrNotLike(String value) {
            addCriterion("`verified_or_not` like", value, "verifiedOrNot");
            return (Criteria) this;
        }

        public Criteria andVerifiedOrNotNotLike(String value) {
            addCriterion("`verified_or_not` not like", value, "verifiedOrNot");
            return (Criteria) this;
        }

        public Criteria andVerifiedOrNotIn(List<String> values) {
            addCriterion("`verified_or_not` in", values, "verifiedOrNot");
            return (Criteria) this;
        }

        public Criteria andVerifiedOrNotNotIn(List<String> values) {
            addCriterion("`verified_or_not` not in", values, "verifiedOrNot");
            return (Criteria) this;
        }

        public Criteria andVerifiedOrNotBetween(String value1, String value2) {
            addCriterion("`verified_or_not` between", value1, value2, "verifiedOrNot");
            return (Criteria) this;
        }

        public Criteria andVerifiedOrNotNotBetween(String value1, String value2) {
            addCriterion("`verified_or_not` not between", value1, value2, "verifiedOrNot");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("`gmt_modified` is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("`gmt_modified` is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("`gmt_modified` =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("`gmt_modified` <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("`gmt_modified` >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("`gmt_modified` >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("`gmt_modified` <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("`gmt_modified` <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("`gmt_modified` in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("`gmt_modified` not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("`gmt_modified` between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("`gmt_modified` not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("`gmt_create` is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("`gmt_create` is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("`gmt_create` =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("`gmt_create` <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("`gmt_create` >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("`gmt_create` >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("`gmt_create` <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("`gmt_create` <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("`gmt_create` in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("`gmt_create` not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("`gmt_create` between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("`gmt_create` not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andAvailableOrNotIsNull() {
            addCriterion("`available_or_not` is null");
            return (Criteria) this;
        }

        public Criteria andAvailableOrNotIsNotNull() {
            addCriterion("`available_or_not` is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableOrNotEqualTo(String value) {
            addCriterion("`available_or_not` =", value, "availableOrNot");
            return (Criteria) this;
        }

        public Criteria andAvailableOrNotNotEqualTo(String value) {
            addCriterion("`available_or_not` <>", value, "availableOrNot");
            return (Criteria) this;
        }

        public Criteria andAvailableOrNotGreaterThan(String value) {
            addCriterion("`available_or_not` >", value, "availableOrNot");
            return (Criteria) this;
        }

        public Criteria andAvailableOrNotGreaterThanOrEqualTo(String value) {
            addCriterion("`available_or_not` >=", value, "availableOrNot");
            return (Criteria) this;
        }

        public Criteria andAvailableOrNotLessThan(String value) {
            addCriterion("`available_or_not` <", value, "availableOrNot");
            return (Criteria) this;
        }

        public Criteria andAvailableOrNotLessThanOrEqualTo(String value) {
            addCriterion("`available_or_not` <=", value, "availableOrNot");
            return (Criteria) this;
        }

        public Criteria andAvailableOrNotLike(String value) {
            addCriterion("`available_or_not` like", value, "availableOrNot");
            return (Criteria) this;
        }

        public Criteria andAvailableOrNotNotLike(String value) {
            addCriterion("`available_or_not` not like", value, "availableOrNot");
            return (Criteria) this;
        }

        public Criteria andAvailableOrNotIn(List<String> values) {
            addCriterion("`available_or_not` in", values, "availableOrNot");
            return (Criteria) this;
        }

        public Criteria andAvailableOrNotNotIn(List<String> values) {
            addCriterion("`available_or_not` not in", values, "availableOrNot");
            return (Criteria) this;
        }

        public Criteria andAvailableOrNotBetween(String value1, String value2) {
            addCriterion("`available_or_not` between", value1, value2, "availableOrNot");
            return (Criteria) this;
        }

        public Criteria andAvailableOrNotNotBetween(String value1, String value2) {
            addCriterion("`available_or_not` not between", value1, value2, "availableOrNot");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLikeInsensitive(String value) {
            addCriterion("upper(`wx_openid`) like", value.toUpperCase(), "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyLikeInsensitive(String value) {
            addCriterion("upper(`wx_session_key`) like", value.toUpperCase(), "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxNickNameLikeInsensitive(String value) {
            addCriterion("upper(`wx_nick_name`) like", value.toUpperCase(), "wxNickName");
            return (Criteria) this;
        }

        public Criteria andWxAvatarUrlLikeInsensitive(String value) {
            addCriterion("upper(`wx_avatar_url`) like", value.toUpperCase(), "wxAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWxGenderLikeInsensitive(String value) {
            addCriterion("upper(`wx_gender`) like", value.toUpperCase(), "wxGender");
            return (Criteria) this;
        }

        public Criteria andWxCityLikeInsensitive(String value) {
            addCriterion("upper(`wx_city`) like", value.toUpperCase(), "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxProvinceLikeInsensitive(String value) {
            addCriterion("upper(`wx_province`) like", value.toUpperCase(), "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxCountryLikeInsensitive(String value) {
            addCriterion("upper(`wx_country`) like", value.toUpperCase(), "wxCountry");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(`mobile`) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andTruenameLikeInsensitive(String value) {
            addCriterion("upper(`truename`) like", value.toUpperCase(), "truename");
            return (Criteria) this;
        }

        public Criteria andNicknameLikeInsensitive(String value) {
            addCriterion("upper(`nickname`) like", value.toUpperCase(), "nickname");
            return (Criteria) this;
        }

        public Criteria andVerifiedOrNotLikeInsensitive(String value) {
            addCriterion("upper(`verified_or_not`) like", value.toUpperCase(), "verifiedOrNot");
            return (Criteria) this;
        }

        public Criteria andAvailableOrNotLikeInsensitive(String value) {
            addCriterion("upper(`available_or_not`) like", value.toUpperCase(), "availableOrNot");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}