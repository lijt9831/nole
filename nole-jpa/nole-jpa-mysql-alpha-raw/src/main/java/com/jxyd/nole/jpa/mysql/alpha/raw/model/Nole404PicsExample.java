package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Nole404PicsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Nole404PicsExample() {
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
            addCriterion("`nole404_id` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`nole404_id` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("`nole404_id` =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("`nole404_id` <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("`nole404_id` >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("`nole404_id` >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("`nole404_id` <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("`nole404_id` <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("`nole404_id` in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("`nole404_id` not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("`nole404_id` between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("`nole404_id` not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNole400IdIsNull() {
            addCriterion("`nole400_id` is null");
            return (Criteria) this;
        }

        public Criteria andNole400IdIsNotNull() {
            addCriterion("`nole400_id` is not null");
            return (Criteria) this;
        }

        public Criteria andNole400IdEqualTo(Long value) {
            addCriterion("`nole400_id` =", value, "nole400Id");
            return (Criteria) this;
        }

        public Criteria andNole400IdNotEqualTo(Long value) {
            addCriterion("`nole400_id` <>", value, "nole400Id");
            return (Criteria) this;
        }

        public Criteria andNole400IdGreaterThan(Long value) {
            addCriterion("`nole400_id` >", value, "nole400Id");
            return (Criteria) this;
        }

        public Criteria andNole400IdGreaterThanOrEqualTo(Long value) {
            addCriterion("`nole400_id` >=", value, "nole400Id");
            return (Criteria) this;
        }

        public Criteria andNole400IdLessThan(Long value) {
            addCriterion("`nole400_id` <", value, "nole400Id");
            return (Criteria) this;
        }

        public Criteria andNole400IdLessThanOrEqualTo(Long value) {
            addCriterion("`nole400_id` <=", value, "nole400Id");
            return (Criteria) this;
        }

        public Criteria andNole400IdIn(List<Long> values) {
            addCriterion("`nole400_id` in", values, "nole400Id");
            return (Criteria) this;
        }

        public Criteria andNole400IdNotIn(List<Long> values) {
            addCriterion("`nole400_id` not in", values, "nole400Id");
            return (Criteria) this;
        }

        public Criteria andNole400IdBetween(Long value1, Long value2) {
            addCriterion("`nole400_id` between", value1, value2, "nole400Id");
            return (Criteria) this;
        }

        public Criteria andNole400IdNotBetween(Long value1, Long value2) {
            addCriterion("`nole400_id` not between", value1, value2, "nole400Id");
            return (Criteria) this;
        }

        public Criteria andPicPathIsNull() {
            addCriterion("`pic_path` is null");
            return (Criteria) this;
        }

        public Criteria andPicPathIsNotNull() {
            addCriterion("`pic_path` is not null");
            return (Criteria) this;
        }

        public Criteria andPicPathEqualTo(String value) {
            addCriterion("`pic_path` =", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathNotEqualTo(String value) {
            addCriterion("`pic_path` <>", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathGreaterThan(String value) {
            addCriterion("`pic_path` >", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathGreaterThanOrEqualTo(String value) {
            addCriterion("`pic_path` >=", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathLessThan(String value) {
            addCriterion("`pic_path` <", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathLessThanOrEqualTo(String value) {
            addCriterion("`pic_path` <=", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathLike(String value) {
            addCriterion("`pic_path` like", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathNotLike(String value) {
            addCriterion("`pic_path` not like", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathIn(List<String> values) {
            addCriterion("`pic_path` in", values, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathNotIn(List<String> values) {
            addCriterion("`pic_path` not in", values, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathBetween(String value1, String value2) {
            addCriterion("`pic_path` between", value1, value2, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathNotBetween(String value1, String value2) {
            addCriterion("`pic_path` not between", value1, value2, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicTypeIsNull() {
            addCriterion("`pic_type` is null");
            return (Criteria) this;
        }

        public Criteria andPicTypeIsNotNull() {
            addCriterion("`pic_type` is not null");
            return (Criteria) this;
        }

        public Criteria andPicTypeEqualTo(String value) {
            addCriterion("`pic_type` =", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeNotEqualTo(String value) {
            addCriterion("`pic_type` <>", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeGreaterThan(String value) {
            addCriterion("`pic_type` >", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`pic_type` >=", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeLessThan(String value) {
            addCriterion("`pic_type` <", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeLessThanOrEqualTo(String value) {
            addCriterion("`pic_type` <=", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeLike(String value) {
            addCriterion("`pic_type` like", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeNotLike(String value) {
            addCriterion("`pic_type` not like", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeIn(List<String> values) {
            addCriterion("`pic_type` in", values, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeNotIn(List<String> values) {
            addCriterion("`pic_type` not in", values, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeBetween(String value1, String value2) {
            addCriterion("`pic_type` between", value1, value2, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeNotBetween(String value1, String value2) {
            addCriterion("`pic_type` not between", value1, value2, "picType");
            return (Criteria) this;
        }

        public Criteria andPicOrderIsNull() {
            addCriterion("`pic_order` is null");
            return (Criteria) this;
        }

        public Criteria andPicOrderIsNotNull() {
            addCriterion("`pic_order` is not null");
            return (Criteria) this;
        }

        public Criteria andPicOrderEqualTo(Integer value) {
            addCriterion("`pic_order` =", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderNotEqualTo(Integer value) {
            addCriterion("`pic_order` <>", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderGreaterThan(Integer value) {
            addCriterion("`pic_order` >", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("`pic_order` >=", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderLessThan(Integer value) {
            addCriterion("`pic_order` <", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderLessThanOrEqualTo(Integer value) {
            addCriterion("`pic_order` <=", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderIn(List<Integer> values) {
            addCriterion("`pic_order` in", values, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderNotIn(List<Integer> values) {
            addCriterion("`pic_order` not in", values, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderBetween(Integer value1, Integer value2) {
            addCriterion("`pic_order` between", value1, value2, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("`pic_order` not between", value1, value2, "picOrder");
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

        public Criteria andPicPathLikeInsensitive(String value) {
            addCriterion("upper(`pic_path`) like", value.toUpperCase(), "picPath");
            return (Criteria) this;
        }

        public Criteria andPicTypeLikeInsensitive(String value) {
            addCriterion("upper(`pic_type`) like", value.toUpperCase(), "picType");
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