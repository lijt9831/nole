package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Nole308VoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Nole308VoteExample() {
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
            addCriterion("`nole308_id` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`nole308_id` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("`nole308_id` =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("`nole308_id` <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("`nole308_id` >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("`nole308_id` >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("`nole308_id` <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("`nole308_id` <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("`nole308_id` in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("`nole308_id` not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("`nole308_id` between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("`nole308_id` not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNole304IdIsNull() {
            addCriterion("`nole304_id` is null");
            return (Criteria) this;
        }

        public Criteria andNole304IdIsNotNull() {
            addCriterion("`nole304_id` is not null");
            return (Criteria) this;
        }

        public Criteria andNole304IdEqualTo(Long value) {
            addCriterion("`nole304_id` =", value, "nole304Id");
            return (Criteria) this;
        }

        public Criteria andNole304IdNotEqualTo(Long value) {
            addCriterion("`nole304_id` <>", value, "nole304Id");
            return (Criteria) this;
        }

        public Criteria andNole304IdGreaterThan(Long value) {
            addCriterion("`nole304_id` >", value, "nole304Id");
            return (Criteria) this;
        }

        public Criteria andNole304IdGreaterThanOrEqualTo(Long value) {
            addCriterion("`nole304_id` >=", value, "nole304Id");
            return (Criteria) this;
        }

        public Criteria andNole304IdLessThan(Long value) {
            addCriterion("`nole304_id` <", value, "nole304Id");
            return (Criteria) this;
        }

        public Criteria andNole304IdLessThanOrEqualTo(Long value) {
            addCriterion("`nole304_id` <=", value, "nole304Id");
            return (Criteria) this;
        }

        public Criteria andNole304IdIn(List<Long> values) {
            addCriterion("`nole304_id` in", values, "nole304Id");
            return (Criteria) this;
        }

        public Criteria andNole304IdNotIn(List<Long> values) {
            addCriterion("`nole304_id` not in", values, "nole304Id");
            return (Criteria) this;
        }

        public Criteria andNole304IdBetween(Long value1, Long value2) {
            addCriterion("`nole304_id` between", value1, value2, "nole304Id");
            return (Criteria) this;
        }

        public Criteria andNole304IdNotBetween(Long value1, Long value2) {
            addCriterion("`nole304_id` not between", value1, value2, "nole304Id");
            return (Criteria) this;
        }

        public Criteria andNole200IdIsNull() {
            addCriterion("`nole200_id` is null");
            return (Criteria) this;
        }

        public Criteria andNole200IdIsNotNull() {
            addCriterion("`nole200_id` is not null");
            return (Criteria) this;
        }

        public Criteria andNole200IdEqualTo(Long value) {
            addCriterion("`nole200_id` =", value, "nole200Id");
            return (Criteria) this;
        }

        public Criteria andNole200IdNotEqualTo(Long value) {
            addCriterion("`nole200_id` <>", value, "nole200Id");
            return (Criteria) this;
        }

        public Criteria andNole200IdGreaterThan(Long value) {
            addCriterion("`nole200_id` >", value, "nole200Id");
            return (Criteria) this;
        }

        public Criteria andNole200IdGreaterThanOrEqualTo(Long value) {
            addCriterion("`nole200_id` >=", value, "nole200Id");
            return (Criteria) this;
        }

        public Criteria andNole200IdLessThan(Long value) {
            addCriterion("`nole200_id` <", value, "nole200Id");
            return (Criteria) this;
        }

        public Criteria andNole200IdLessThanOrEqualTo(Long value) {
            addCriterion("`nole200_id` <=", value, "nole200Id");
            return (Criteria) this;
        }

        public Criteria andNole200IdIn(List<Long> values) {
            addCriterion("`nole200_id` in", values, "nole200Id");
            return (Criteria) this;
        }

        public Criteria andNole200IdNotIn(List<Long> values) {
            addCriterion("`nole200_id` not in", values, "nole200Id");
            return (Criteria) this;
        }

        public Criteria andNole200IdBetween(Long value1, Long value2) {
            addCriterion("`nole200_id` between", value1, value2, "nole200Id");
            return (Criteria) this;
        }

        public Criteria andNole200IdNotBetween(Long value1, Long value2) {
            addCriterion("`nole200_id` not between", value1, value2, "nole200Id");
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

        public Criteria andPassOrNotIsNull() {
            addCriterion("`pass_or_not` is null");
            return (Criteria) this;
        }

        public Criteria andPassOrNotIsNotNull() {
            addCriterion("`pass_or_not` is not null");
            return (Criteria) this;
        }

        public Criteria andPassOrNotEqualTo(String value) {
            addCriterion("`pass_or_not` =", value, "passOrNot");
            return (Criteria) this;
        }

        public Criteria andPassOrNotNotEqualTo(String value) {
            addCriterion("`pass_or_not` <>", value, "passOrNot");
            return (Criteria) this;
        }

        public Criteria andPassOrNotGreaterThan(String value) {
            addCriterion("`pass_or_not` >", value, "passOrNot");
            return (Criteria) this;
        }

        public Criteria andPassOrNotGreaterThanOrEqualTo(String value) {
            addCriterion("`pass_or_not` >=", value, "passOrNot");
            return (Criteria) this;
        }

        public Criteria andPassOrNotLessThan(String value) {
            addCriterion("`pass_or_not` <", value, "passOrNot");
            return (Criteria) this;
        }

        public Criteria andPassOrNotLessThanOrEqualTo(String value) {
            addCriterion("`pass_or_not` <=", value, "passOrNot");
            return (Criteria) this;
        }

        public Criteria andPassOrNotLike(String value) {
            addCriterion("`pass_or_not` like", value, "passOrNot");
            return (Criteria) this;
        }

        public Criteria andPassOrNotNotLike(String value) {
            addCriterion("`pass_or_not` not like", value, "passOrNot");
            return (Criteria) this;
        }

        public Criteria andPassOrNotIn(List<String> values) {
            addCriterion("`pass_or_not` in", values, "passOrNot");
            return (Criteria) this;
        }

        public Criteria andPassOrNotNotIn(List<String> values) {
            addCriterion("`pass_or_not` not in", values, "passOrNot");
            return (Criteria) this;
        }

        public Criteria andPassOrNotBetween(String value1, String value2) {
            addCriterion("`pass_or_not` between", value1, value2, "passOrNot");
            return (Criteria) this;
        }

        public Criteria andPassOrNotNotBetween(String value1, String value2) {
            addCriterion("`pass_or_not` not between", value1, value2, "passOrNot");
            return (Criteria) this;
        }

        public Criteria andPassOrNotLikeInsensitive(String value) {
            addCriterion("upper(`pass_or_not`) like", value.toUpperCase(), "passOrNot");
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