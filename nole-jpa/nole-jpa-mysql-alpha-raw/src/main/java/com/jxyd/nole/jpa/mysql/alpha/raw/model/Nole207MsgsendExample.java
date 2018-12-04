package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Nole207MsgsendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Nole207MsgsendExample() {
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
            addCriterion("`nole207_id` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`nole207_id` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("`nole207_id` =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("`nole207_id` <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("`nole207_id` >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("`nole207_id` >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("`nole207_id` <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("`nole207_id` <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("`nole207_id` in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("`nole207_id` not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("`nole207_id` between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("`nole207_id` not between", value1, value2, "id");
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

        public Criteria andNole206IdIsNull() {
            addCriterion("`nole206_id` is null");
            return (Criteria) this;
        }

        public Criteria andNole206IdIsNotNull() {
            addCriterion("`nole206_id` is not null");
            return (Criteria) this;
        }

        public Criteria andNole206IdEqualTo(Long value) {
            addCriterion("`nole206_id` =", value, "nole206Id");
            return (Criteria) this;
        }

        public Criteria andNole206IdNotEqualTo(Long value) {
            addCriterion("`nole206_id` <>", value, "nole206Id");
            return (Criteria) this;
        }

        public Criteria andNole206IdGreaterThan(Long value) {
            addCriterion("`nole206_id` >", value, "nole206Id");
            return (Criteria) this;
        }

        public Criteria andNole206IdGreaterThanOrEqualTo(Long value) {
            addCriterion("`nole206_id` >=", value, "nole206Id");
            return (Criteria) this;
        }

        public Criteria andNole206IdLessThan(Long value) {
            addCriterion("`nole206_id` <", value, "nole206Id");
            return (Criteria) this;
        }

        public Criteria andNole206IdLessThanOrEqualTo(Long value) {
            addCriterion("`nole206_id` <=", value, "nole206Id");
            return (Criteria) this;
        }

        public Criteria andNole206IdIn(List<Long> values) {
            addCriterion("`nole206_id` in", values, "nole206Id");
            return (Criteria) this;
        }

        public Criteria andNole206IdNotIn(List<Long> values) {
            addCriterion("`nole206_id` not in", values, "nole206Id");
            return (Criteria) this;
        }

        public Criteria andNole206IdBetween(Long value1, Long value2) {
            addCriterion("`nole206_id` between", value1, value2, "nole206Id");
            return (Criteria) this;
        }

        public Criteria andNole206IdNotBetween(Long value1, Long value2) {
            addCriterion("`nole206_id` not between", value1, value2, "nole206Id");
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