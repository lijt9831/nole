package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.util.ArrayList;
import java.util.List;

public class Nole500OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Nole500OrderExample() {
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
            addCriterion("`nole500_id` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`nole500_id` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("`nole500_id` =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("`nole500_id` <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("`nole500_id` >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("`nole500_id` >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("`nole500_id` <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("`nole500_id` <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("`nole500_id` in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("`nole500_id` not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("`nole500_id` between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("`nole500_id` not between", value1, value2, "id");
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

        public Criteria andInBizNoIsNull() {
            addCriterion("`in_biz_no` is null");
            return (Criteria) this;
        }

        public Criteria andInBizNoIsNotNull() {
            addCriterion("`in_biz_no` is not null");
            return (Criteria) this;
        }

        public Criteria andInBizNoEqualTo(String value) {
            addCriterion("`in_biz_no` =", value, "inBizNo");
            return (Criteria) this;
        }

        public Criteria andInBizNoNotEqualTo(String value) {
            addCriterion("`in_biz_no` <>", value, "inBizNo");
            return (Criteria) this;
        }

        public Criteria andInBizNoGreaterThan(String value) {
            addCriterion("`in_biz_no` >", value, "inBizNo");
            return (Criteria) this;
        }

        public Criteria andInBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("`in_biz_no` >=", value, "inBizNo");
            return (Criteria) this;
        }

        public Criteria andInBizNoLessThan(String value) {
            addCriterion("`in_biz_no` <", value, "inBizNo");
            return (Criteria) this;
        }

        public Criteria andInBizNoLessThanOrEqualTo(String value) {
            addCriterion("`in_biz_no` <=", value, "inBizNo");
            return (Criteria) this;
        }

        public Criteria andInBizNoLike(String value) {
            addCriterion("`in_biz_no` like", value, "inBizNo");
            return (Criteria) this;
        }

        public Criteria andInBizNoNotLike(String value) {
            addCriterion("`in_biz_no` not like", value, "inBizNo");
            return (Criteria) this;
        }

        public Criteria andInBizNoIn(List<String> values) {
            addCriterion("`in_biz_no` in", values, "inBizNo");
            return (Criteria) this;
        }

        public Criteria andInBizNoNotIn(List<String> values) {
            addCriterion("`in_biz_no` not in", values, "inBizNo");
            return (Criteria) this;
        }

        public Criteria andInBizNoBetween(String value1, String value2) {
            addCriterion("`in_biz_no` between", value1, value2, "inBizNo");
            return (Criteria) this;
        }

        public Criteria andInBizNoNotBetween(String value1, String value2) {
            addCriterion("`in_biz_no` not between", value1, value2, "inBizNo");
            return (Criteria) this;
        }

        public Criteria andInBizNoLikeInsensitive(String value) {
            addCriterion("upper(`in_biz_no`) like", value.toUpperCase(), "inBizNo");
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