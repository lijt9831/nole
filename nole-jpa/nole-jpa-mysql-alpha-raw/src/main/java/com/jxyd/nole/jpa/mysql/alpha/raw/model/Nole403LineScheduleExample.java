package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Nole403LineScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Nole403LineScheduleExample() {
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
            addCriterion("`nole403_id` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`nole403_id` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("`nole403_id` =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("`nole403_id` <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("`nole403_id` >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("`nole403_id` >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("`nole403_id` <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("`nole403_id` <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("`nole403_id` in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("`nole403_id` not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("`nole403_id` between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("`nole403_id` not between", value1, value2, "id");
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

        public Criteria andDecriptionIsNull() {
            addCriterion("`decription` is null");
            return (Criteria) this;
        }

        public Criteria andDecriptionIsNotNull() {
            addCriterion("`decription` is not null");
            return (Criteria) this;
        }

        public Criteria andDecriptionEqualTo(String value) {
            addCriterion("`decription` =", value, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionNotEqualTo(String value) {
            addCriterion("`decription` <>", value, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionGreaterThan(String value) {
            addCriterion("`decription` >", value, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionGreaterThanOrEqualTo(String value) {
            addCriterion("`decription` >=", value, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionLessThan(String value) {
            addCriterion("`decription` <", value, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionLessThanOrEqualTo(String value) {
            addCriterion("`decription` <=", value, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionLike(String value) {
            addCriterion("`decription` like", value, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionNotLike(String value) {
            addCriterion("`decription` not like", value, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionIn(List<String> values) {
            addCriterion("`decription` in", values, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionNotIn(List<String> values) {
            addCriterion("`decription` not in", values, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionBetween(String value1, String value2) {
            addCriterion("`decription` between", value1, value2, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionNotBetween(String value1, String value2) {
            addCriterion("`decription` not between", value1, value2, "decription");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("`destination` is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("`destination` is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("`destination` =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("`destination` <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("`destination` >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("`destination` >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("`destination` <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("`destination` <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("`destination` like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("`destination` not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("`destination` in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("`destination` not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("`destination` between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("`destination` not between", value1, value2, "destination");
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

        public Criteria andDaynumIsNull() {
            addCriterion("`daynum` is null");
            return (Criteria) this;
        }

        public Criteria andDaynumIsNotNull() {
            addCriterion("`daynum` is not null");
            return (Criteria) this;
        }

        public Criteria andDaynumEqualTo(Integer value) {
            addCriterion("`daynum` =", value, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumNotEqualTo(Integer value) {
            addCriterion("`daynum` <>", value, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumGreaterThan(Integer value) {
            addCriterion("`daynum` >", value, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumGreaterThanOrEqualTo(Integer value) {
            addCriterion("`daynum` >=", value, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumLessThan(Integer value) {
            addCriterion("`daynum` <", value, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumLessThanOrEqualTo(Integer value) {
            addCriterion("`daynum` <=", value, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumIn(List<Integer> values) {
            addCriterion("`daynum` in", values, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumNotIn(List<Integer> values) {
            addCriterion("`daynum` not in", values, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumBetween(Integer value1, Integer value2) {
            addCriterion("`daynum` between", value1, value2, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumNotBetween(Integer value1, Integer value2) {
            addCriterion("`daynum` not between", value1, value2, "daynum");
            return (Criteria) this;
        }

        public Criteria andDecriptionLikeInsensitive(String value) {
            addCriterion("upper(`decription`) like", value.toUpperCase(), "decription");
            return (Criteria) this;
        }

        public Criteria andDestinationLikeInsensitive(String value) {
            addCriterion("upper(`destination`) like", value.toUpperCase(), "destination");
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