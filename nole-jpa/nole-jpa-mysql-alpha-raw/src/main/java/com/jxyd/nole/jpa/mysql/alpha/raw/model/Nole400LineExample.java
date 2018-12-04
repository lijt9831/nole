package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Nole400LineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Nole400LineExample() {
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
            addCriterion("`nole400_id` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`nole400_id` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("`nole400_id` =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("`nole400_id` <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("`nole400_id` >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("`nole400_id` >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("`nole400_id` <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("`nole400_id` <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("`nole400_id` in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("`nole400_id` not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("`nole400_id` between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("`nole400_id` not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLineTitleIsNull() {
            addCriterion("`line_title` is null");
            return (Criteria) this;
        }

        public Criteria andLineTitleIsNotNull() {
            addCriterion("`line_title` is not null");
            return (Criteria) this;
        }

        public Criteria andLineTitleEqualTo(String value) {
            addCriterion("`line_title` =", value, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleNotEqualTo(String value) {
            addCriterion("`line_title` <>", value, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleGreaterThan(String value) {
            addCriterion("`line_title` >", value, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleGreaterThanOrEqualTo(String value) {
            addCriterion("`line_title` >=", value, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleLessThan(String value) {
            addCriterion("`line_title` <", value, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleLessThanOrEqualTo(String value) {
            addCriterion("`line_title` <=", value, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleLike(String value) {
            addCriterion("`line_title` like", value, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleNotLike(String value) {
            addCriterion("`line_title` not like", value, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleIn(List<String> values) {
            addCriterion("`line_title` in", values, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleNotIn(List<String> values) {
            addCriterion("`line_title` not in", values, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleBetween(String value1, String value2) {
            addCriterion("`line_title` between", value1, value2, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleNotBetween(String value1, String value2) {
            addCriterion("`line_title` not between", value1, value2, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMapParamsIsNull() {
            addCriterion("`map_params` is null");
            return (Criteria) this;
        }

        public Criteria andMapParamsIsNotNull() {
            addCriterion("`map_params` is not null");
            return (Criteria) this;
        }

        public Criteria andMapParamsEqualTo(String value) {
            addCriterion("`map_params` =", value, "mapParams");
            return (Criteria) this;
        }

        public Criteria andMapParamsNotEqualTo(String value) {
            addCriterion("`map_params` <>", value, "mapParams");
            return (Criteria) this;
        }

        public Criteria andMapParamsGreaterThan(String value) {
            addCriterion("`map_params` >", value, "mapParams");
            return (Criteria) this;
        }

        public Criteria andMapParamsGreaterThanOrEqualTo(String value) {
            addCriterion("`map_params` >=", value, "mapParams");
            return (Criteria) this;
        }

        public Criteria andMapParamsLessThan(String value) {
            addCriterion("`map_params` <", value, "mapParams");
            return (Criteria) this;
        }

        public Criteria andMapParamsLessThanOrEqualTo(String value) {
            addCriterion("`map_params` <=", value, "mapParams");
            return (Criteria) this;
        }

        public Criteria andMapParamsLike(String value) {
            addCriterion("`map_params` like", value, "mapParams");
            return (Criteria) this;
        }

        public Criteria andMapParamsNotLike(String value) {
            addCriterion("`map_params` not like", value, "mapParams");
            return (Criteria) this;
        }

        public Criteria andMapParamsIn(List<String> values) {
            addCriterion("`map_params` in", values, "mapParams");
            return (Criteria) this;
        }

        public Criteria andMapParamsNotIn(List<String> values) {
            addCriterion("`map_params` not in", values, "mapParams");
            return (Criteria) this;
        }

        public Criteria andMapParamsBetween(String value1, String value2) {
            addCriterion("`map_params` between", value1, value2, "mapParams");
            return (Criteria) this;
        }

        public Criteria andMapParamsNotBetween(String value1, String value2) {
            addCriterion("`map_params` not between", value1, value2, "mapParams");
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

        public Criteria andDescriptionIsNull() {
            addCriterion("`description` is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("`description` is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("`description` =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("`description` <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("`description` >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("`description` >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("`description` <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("`description` <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("`description` like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("`description` not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("`description` in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("`description` not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("`description` between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("`description` not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andParamlengthIsNull() {
            addCriterion("`paramLength` is null");
            return (Criteria) this;
        }

        public Criteria andParamlengthIsNotNull() {
            addCriterion("`paramLength` is not null");
            return (Criteria) this;
        }

        public Criteria andParamlengthEqualTo(String value) {
            addCriterion("`paramLength` =", value, "paramlength");
            return (Criteria) this;
        }

        public Criteria andParamlengthNotEqualTo(String value) {
            addCriterion("`paramLength` <>", value, "paramlength");
            return (Criteria) this;
        }

        public Criteria andParamlengthGreaterThan(String value) {
            addCriterion("`paramLength` >", value, "paramlength");
            return (Criteria) this;
        }

        public Criteria andParamlengthGreaterThanOrEqualTo(String value) {
            addCriterion("`paramLength` >=", value, "paramlength");
            return (Criteria) this;
        }

        public Criteria andParamlengthLessThan(String value) {
            addCriterion("`paramLength` <", value, "paramlength");
            return (Criteria) this;
        }

        public Criteria andParamlengthLessThanOrEqualTo(String value) {
            addCriterion("`paramLength` <=", value, "paramlength");
            return (Criteria) this;
        }

        public Criteria andParamlengthLike(String value) {
            addCriterion("`paramLength` like", value, "paramlength");
            return (Criteria) this;
        }

        public Criteria andParamlengthNotLike(String value) {
            addCriterion("`paramLength` not like", value, "paramlength");
            return (Criteria) this;
        }

        public Criteria andParamlengthIn(List<String> values) {
            addCriterion("`paramLength` in", values, "paramlength");
            return (Criteria) this;
        }

        public Criteria andParamlengthNotIn(List<String> values) {
            addCriterion("`paramLength` not in", values, "paramlength");
            return (Criteria) this;
        }

        public Criteria andParamlengthBetween(String value1, String value2) {
            addCriterion("`paramLength` between", value1, value2, "paramlength");
            return (Criteria) this;
        }

        public Criteria andParamlengthNotBetween(String value1, String value2) {
            addCriterion("`paramLength` not between", value1, value2, "paramlength");
            return (Criteria) this;
        }

        public Criteria andParammaxgradientIsNull() {
            addCriterion("`paramMaxGradient` is null");
            return (Criteria) this;
        }

        public Criteria andParammaxgradientIsNotNull() {
            addCriterion("`paramMaxGradient` is not null");
            return (Criteria) this;
        }

        public Criteria andParammaxgradientEqualTo(String value) {
            addCriterion("`paramMaxGradient` =", value, "parammaxgradient");
            return (Criteria) this;
        }

        public Criteria andParammaxgradientNotEqualTo(String value) {
            addCriterion("`paramMaxGradient` <>", value, "parammaxgradient");
            return (Criteria) this;
        }

        public Criteria andParammaxgradientGreaterThan(String value) {
            addCriterion("`paramMaxGradient` >", value, "parammaxgradient");
            return (Criteria) this;
        }

        public Criteria andParammaxgradientGreaterThanOrEqualTo(String value) {
            addCriterion("`paramMaxGradient` >=", value, "parammaxgradient");
            return (Criteria) this;
        }

        public Criteria andParammaxgradientLessThan(String value) {
            addCriterion("`paramMaxGradient` <", value, "parammaxgradient");
            return (Criteria) this;
        }

        public Criteria andParammaxgradientLessThanOrEqualTo(String value) {
            addCriterion("`paramMaxGradient` <=", value, "parammaxgradient");
            return (Criteria) this;
        }

        public Criteria andParammaxgradientLike(String value) {
            addCriterion("`paramMaxGradient` like", value, "parammaxgradient");
            return (Criteria) this;
        }

        public Criteria andParammaxgradientNotLike(String value) {
            addCriterion("`paramMaxGradient` not like", value, "parammaxgradient");
            return (Criteria) this;
        }

        public Criteria andParammaxgradientIn(List<String> values) {
            addCriterion("`paramMaxGradient` in", values, "parammaxgradient");
            return (Criteria) this;
        }

        public Criteria andParammaxgradientNotIn(List<String> values) {
            addCriterion("`paramMaxGradient` not in", values, "parammaxgradient");
            return (Criteria) this;
        }

        public Criteria andParammaxgradientBetween(String value1, String value2) {
            addCriterion("`paramMaxGradient` between", value1, value2, "parammaxgradient");
            return (Criteria) this;
        }

        public Criteria andParammaxgradientNotBetween(String value1, String value2) {
            addCriterion("`paramMaxGradient` not between", value1, value2, "parammaxgradient");
            return (Criteria) this;
        }

        public Criteria andParamelevationIsNull() {
            addCriterion("`paramElevation` is null");
            return (Criteria) this;
        }

        public Criteria andParamelevationIsNotNull() {
            addCriterion("`paramElevation` is not null");
            return (Criteria) this;
        }

        public Criteria andParamelevationEqualTo(String value) {
            addCriterion("`paramElevation` =", value, "paramelevation");
            return (Criteria) this;
        }

        public Criteria andParamelevationNotEqualTo(String value) {
            addCriterion("`paramElevation` <>", value, "paramelevation");
            return (Criteria) this;
        }

        public Criteria andParamelevationGreaterThan(String value) {
            addCriterion("`paramElevation` >", value, "paramelevation");
            return (Criteria) this;
        }

        public Criteria andParamelevationGreaterThanOrEqualTo(String value) {
            addCriterion("`paramElevation` >=", value, "paramelevation");
            return (Criteria) this;
        }

        public Criteria andParamelevationLessThan(String value) {
            addCriterion("`paramElevation` <", value, "paramelevation");
            return (Criteria) this;
        }

        public Criteria andParamelevationLessThanOrEqualTo(String value) {
            addCriterion("`paramElevation` <=", value, "paramelevation");
            return (Criteria) this;
        }

        public Criteria andParamelevationLike(String value) {
            addCriterion("`paramElevation` like", value, "paramelevation");
            return (Criteria) this;
        }

        public Criteria andParamelevationNotLike(String value) {
            addCriterion("`paramElevation` not like", value, "paramelevation");
            return (Criteria) this;
        }

        public Criteria andParamelevationIn(List<String> values) {
            addCriterion("`paramElevation` in", values, "paramelevation");
            return (Criteria) this;
        }

        public Criteria andParamelevationNotIn(List<String> values) {
            addCriterion("`paramElevation` not in", values, "paramelevation");
            return (Criteria) this;
        }

        public Criteria andParamelevationBetween(String value1, String value2) {
            addCriterion("`paramElevation` between", value1, value2, "paramelevation");
            return (Criteria) this;
        }

        public Criteria andParamelevationNotBetween(String value1, String value2) {
            addCriterion("`paramElevation` not between", value1, value2, "paramelevation");
            return (Criteria) this;
        }

        public Criteria andParamdowntowndistanceIsNull() {
            addCriterion("`paramDowntownDistance` is null");
            return (Criteria) this;
        }

        public Criteria andParamdowntowndistanceIsNotNull() {
            addCriterion("`paramDowntownDistance` is not null");
            return (Criteria) this;
        }

        public Criteria andParamdowntowndistanceEqualTo(String value) {
            addCriterion("`paramDowntownDistance` =", value, "paramdowntowndistance");
            return (Criteria) this;
        }

        public Criteria andParamdowntowndistanceNotEqualTo(String value) {
            addCriterion("`paramDowntownDistance` <>", value, "paramdowntowndistance");
            return (Criteria) this;
        }

        public Criteria andParamdowntowndistanceGreaterThan(String value) {
            addCriterion("`paramDowntownDistance` >", value, "paramdowntowndistance");
            return (Criteria) this;
        }

        public Criteria andParamdowntowndistanceGreaterThanOrEqualTo(String value) {
            addCriterion("`paramDowntownDistance` >=", value, "paramdowntowndistance");
            return (Criteria) this;
        }

        public Criteria andParamdowntowndistanceLessThan(String value) {
            addCriterion("`paramDowntownDistance` <", value, "paramdowntowndistance");
            return (Criteria) this;
        }

        public Criteria andParamdowntowndistanceLessThanOrEqualTo(String value) {
            addCriterion("`paramDowntownDistance` <=", value, "paramdowntowndistance");
            return (Criteria) this;
        }

        public Criteria andParamdowntowndistanceLike(String value) {
            addCriterion("`paramDowntownDistance` like", value, "paramdowntowndistance");
            return (Criteria) this;
        }

        public Criteria andParamdowntowndistanceNotLike(String value) {
            addCriterion("`paramDowntownDistance` not like", value, "paramdowntowndistance");
            return (Criteria) this;
        }

        public Criteria andParamdowntowndistanceIn(List<String> values) {
            addCriterion("`paramDowntownDistance` in", values, "paramdowntowndistance");
            return (Criteria) this;
        }

        public Criteria andParamdowntowndistanceNotIn(List<String> values) {
            addCriterion("`paramDowntownDistance` not in", values, "paramdowntowndistance");
            return (Criteria) this;
        }

        public Criteria andParamdowntowndistanceBetween(String value1, String value2) {
            addCriterion("`paramDowntownDistance` between", value1, value2, "paramdowntowndistance");
            return (Criteria) this;
        }

        public Criteria andParamdowntowndistanceNotBetween(String value1, String value2) {
            addCriterion("`paramDowntownDistance` not between", value1, value2, "paramdowntowndistance");
            return (Criteria) this;
        }

        public Criteria andParamroadconditionIsNull() {
            addCriterion("`paramRoadCondition` is null");
            return (Criteria) this;
        }

        public Criteria andParamroadconditionIsNotNull() {
            addCriterion("`paramRoadCondition` is not null");
            return (Criteria) this;
        }

        public Criteria andParamroadconditionEqualTo(String value) {
            addCriterion("`paramRoadCondition` =", value, "paramroadcondition");
            return (Criteria) this;
        }

        public Criteria andParamroadconditionNotEqualTo(String value) {
            addCriterion("`paramRoadCondition` <>", value, "paramroadcondition");
            return (Criteria) this;
        }

        public Criteria andParamroadconditionGreaterThan(String value) {
            addCriterion("`paramRoadCondition` >", value, "paramroadcondition");
            return (Criteria) this;
        }

        public Criteria andParamroadconditionGreaterThanOrEqualTo(String value) {
            addCriterion("`paramRoadCondition` >=", value, "paramroadcondition");
            return (Criteria) this;
        }

        public Criteria andParamroadconditionLessThan(String value) {
            addCriterion("`paramRoadCondition` <", value, "paramroadcondition");
            return (Criteria) this;
        }

        public Criteria andParamroadconditionLessThanOrEqualTo(String value) {
            addCriterion("`paramRoadCondition` <=", value, "paramroadcondition");
            return (Criteria) this;
        }

        public Criteria andParamroadconditionLike(String value) {
            addCriterion("`paramRoadCondition` like", value, "paramroadcondition");
            return (Criteria) this;
        }

        public Criteria andParamroadconditionNotLike(String value) {
            addCriterion("`paramRoadCondition` not like", value, "paramroadcondition");
            return (Criteria) this;
        }

        public Criteria andParamroadconditionIn(List<String> values) {
            addCriterion("`paramRoadCondition` in", values, "paramroadcondition");
            return (Criteria) this;
        }

        public Criteria andParamroadconditionNotIn(List<String> values) {
            addCriterion("`paramRoadCondition` not in", values, "paramroadcondition");
            return (Criteria) this;
        }

        public Criteria andParamroadconditionBetween(String value1, String value2) {
            addCriterion("`paramRoadCondition` between", value1, value2, "paramroadcondition");
            return (Criteria) this;
        }

        public Criteria andParamroadconditionNotBetween(String value1, String value2) {
            addCriterion("`paramRoadCondition` not between", value1, value2, "paramroadcondition");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLineTitleLikeInsensitive(String value) {
            addCriterion("upper(`line_title`) like", value.toUpperCase(), "lineTitle");
            return (Criteria) this;
        }

        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(`type`) like", value.toUpperCase(), "type");
            return (Criteria) this;
        }

        public Criteria andMapParamsLikeInsensitive(String value) {
            addCriterion("upper(`map_params`) like", value.toUpperCase(), "mapParams");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(`description`) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andParamlengthLikeInsensitive(String value) {
            addCriterion("upper(`paramLength`) like", value.toUpperCase(), "paramlength");
            return (Criteria) this;
        }

        public Criteria andParammaxgradientLikeInsensitive(String value) {
            addCriterion("upper(`paramMaxGradient`) like", value.toUpperCase(), "parammaxgradient");
            return (Criteria) this;
        }

        public Criteria andParamelevationLikeInsensitive(String value) {
            addCriterion("upper(`paramElevation`) like", value.toUpperCase(), "paramelevation");
            return (Criteria) this;
        }

        public Criteria andParamdowntowndistanceLikeInsensitive(String value) {
            addCriterion("upper(`paramDowntownDistance`) like", value.toUpperCase(), "paramdowntowndistance");
            return (Criteria) this;
        }

        public Criteria andParamroadconditionLikeInsensitive(String value) {
            addCriterion("upper(`paramRoadCondition`) like", value.toUpperCase(), "paramroadcondition");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(`status`) like", value.toUpperCase(), "status");
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