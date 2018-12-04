package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Nole016EquitmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Nole016EquitmentExample() {
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
            addCriterion("`nole016_id` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`nole016_id` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("`nole016_id` =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("`nole016_id` <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("`nole016_id` >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("`nole016_id` >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("`nole016_id` <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("`nole016_id` <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("`nole016_id` in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("`nole016_id` not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("`nole016_id` between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("`nole016_id` not between", value1, value2, "id");
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

        public Criteria andEquitmentIsNull() {
            addCriterion("`equitment` is null");
            return (Criteria) this;
        }

        public Criteria andEquitmentIsNotNull() {
            addCriterion("`equitment` is not null");
            return (Criteria) this;
        }

        public Criteria andEquitmentEqualTo(String value) {
            addCriterion("`equitment` =", value, "equitment");
            return (Criteria) this;
        }

        public Criteria andEquitmentNotEqualTo(String value) {
            addCriterion("`equitment` <>", value, "equitment");
            return (Criteria) this;
        }

        public Criteria andEquitmentGreaterThan(String value) {
            addCriterion("`equitment` >", value, "equitment");
            return (Criteria) this;
        }

        public Criteria andEquitmentGreaterThanOrEqualTo(String value) {
            addCriterion("`equitment` >=", value, "equitment");
            return (Criteria) this;
        }

        public Criteria andEquitmentLessThan(String value) {
            addCriterion("`equitment` <", value, "equitment");
            return (Criteria) this;
        }

        public Criteria andEquitmentLessThanOrEqualTo(String value) {
            addCriterion("`equitment` <=", value, "equitment");
            return (Criteria) this;
        }

        public Criteria andEquitmentLike(String value) {
            addCriterion("`equitment` like", value, "equitment");
            return (Criteria) this;
        }

        public Criteria andEquitmentNotLike(String value) {
            addCriterion("`equitment` not like", value, "equitment");
            return (Criteria) this;
        }

        public Criteria andEquitmentIn(List<String> values) {
            addCriterion("`equitment` in", values, "equitment");
            return (Criteria) this;
        }

        public Criteria andEquitmentNotIn(List<String> values) {
            addCriterion("`equitment` not in", values, "equitment");
            return (Criteria) this;
        }

        public Criteria andEquitmentBetween(String value1, String value2) {
            addCriterion("`equitment` between", value1, value2, "equitment");
            return (Criteria) this;
        }

        public Criteria andEquitmentNotBetween(String value1, String value2) {
            addCriterion("`equitment` not between", value1, value2, "equitment");
            return (Criteria) this;
        }

        public Criteria andOrderrIsNull() {
            addCriterion("`orderr` is null");
            return (Criteria) this;
        }

        public Criteria andOrderrIsNotNull() {
            addCriterion("`orderr` is not null");
            return (Criteria) this;
        }

        public Criteria andOrderrEqualTo(Integer value) {
            addCriterion("`orderr` =", value, "orderr");
            return (Criteria) this;
        }

        public Criteria andOrderrNotEqualTo(Integer value) {
            addCriterion("`orderr` <>", value, "orderr");
            return (Criteria) this;
        }

        public Criteria andOrderrGreaterThan(Integer value) {
            addCriterion("`orderr` >", value, "orderr");
            return (Criteria) this;
        }

        public Criteria andOrderrGreaterThanOrEqualTo(Integer value) {
            addCriterion("`orderr` >=", value, "orderr");
            return (Criteria) this;
        }

        public Criteria andOrderrLessThan(Integer value) {
            addCriterion("`orderr` <", value, "orderr");
            return (Criteria) this;
        }

        public Criteria andOrderrLessThanOrEqualTo(Integer value) {
            addCriterion("`orderr` <=", value, "orderr");
            return (Criteria) this;
        }

        public Criteria andOrderrIn(List<Integer> values) {
            addCriterion("`orderr` in", values, "orderr");
            return (Criteria) this;
        }

        public Criteria andOrderrNotIn(List<Integer> values) {
            addCriterion("`orderr` not in", values, "orderr");
            return (Criteria) this;
        }

        public Criteria andOrderrBetween(Integer value1, Integer value2) {
            addCriterion("`orderr` between", value1, value2, "orderr");
            return (Criteria) this;
        }

        public Criteria andOrderrNotBetween(Integer value1, Integer value2) {
            addCriterion("`orderr` not between", value1, value2, "orderr");
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

        public Criteria andEquitmentLikeInsensitive(String value) {
            addCriterion("upper(`equitment`) like", value.toUpperCase(), "equitment");
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