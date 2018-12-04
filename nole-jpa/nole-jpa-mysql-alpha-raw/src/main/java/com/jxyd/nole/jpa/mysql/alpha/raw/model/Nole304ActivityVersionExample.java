package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Nole304ActivityVersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Nole304ActivityVersionExample() {
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
            addCriterion("`nole304_id` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`nole304_id` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("`nole304_id` =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("`nole304_id` <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("`nole304_id` >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("`nole304_id` >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("`nole304_id` <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("`nole304_id` <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("`nole304_id` in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("`nole304_id` not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("`nole304_id` between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("`nole304_id` not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNole301IdIsNull() {
            addCriterion("`nole301_id` is null");
            return (Criteria) this;
        }

        public Criteria andNole301IdIsNotNull() {
            addCriterion("`nole301_id` is not null");
            return (Criteria) this;
        }

        public Criteria andNole301IdEqualTo(Long value) {
            addCriterion("`nole301_id` =", value, "nole301Id");
            return (Criteria) this;
        }

        public Criteria andNole301IdNotEqualTo(Long value) {
            addCriterion("`nole301_id` <>", value, "nole301Id");
            return (Criteria) this;
        }

        public Criteria andNole301IdGreaterThan(Long value) {
            addCriterion("`nole301_id` >", value, "nole301Id");
            return (Criteria) this;
        }

        public Criteria andNole301IdGreaterThanOrEqualTo(Long value) {
            addCriterion("`nole301_id` >=", value, "nole301Id");
            return (Criteria) this;
        }

        public Criteria andNole301IdLessThan(Long value) {
            addCriterion("`nole301_id` <", value, "nole301Id");
            return (Criteria) this;
        }

        public Criteria andNole301IdLessThanOrEqualTo(Long value) {
            addCriterion("`nole301_id` <=", value, "nole301Id");
            return (Criteria) this;
        }

        public Criteria andNole301IdIn(List<Long> values) {
            addCriterion("`nole301_id` in", values, "nole301Id");
            return (Criteria) this;
        }

        public Criteria andNole301IdNotIn(List<Long> values) {
            addCriterion("`nole301_id` not in", values, "nole301Id");
            return (Criteria) this;
        }

        public Criteria andNole301IdBetween(Long value1, Long value2) {
            addCriterion("`nole301_id` between", value1, value2, "nole301Id");
            return (Criteria) this;
        }

        public Criteria andNole301IdNotBetween(Long value1, Long value2) {
            addCriterion("`nole301_id` not between", value1, value2, "nole301Id");
            return (Criteria) this;
        }

        public Criteria andOnsaleOrNotIsNull() {
            addCriterion("`onsale_or_not` is null");
            return (Criteria) this;
        }

        public Criteria andOnsaleOrNotIsNotNull() {
            addCriterion("`onsale_or_not` is not null");
            return (Criteria) this;
        }

        public Criteria andOnsaleOrNotEqualTo(String value) {
            addCriterion("`onsale_or_not` =", value, "onsaleOrNot");
            return (Criteria) this;
        }

        public Criteria andOnsaleOrNotNotEqualTo(String value) {
            addCriterion("`onsale_or_not` <>", value, "onsaleOrNot");
            return (Criteria) this;
        }

        public Criteria andOnsaleOrNotGreaterThan(String value) {
            addCriterion("`onsale_or_not` >", value, "onsaleOrNot");
            return (Criteria) this;
        }

        public Criteria andOnsaleOrNotGreaterThanOrEqualTo(String value) {
            addCriterion("`onsale_or_not` >=", value, "onsaleOrNot");
            return (Criteria) this;
        }

        public Criteria andOnsaleOrNotLessThan(String value) {
            addCriterion("`onsale_or_not` <", value, "onsaleOrNot");
            return (Criteria) this;
        }

        public Criteria andOnsaleOrNotLessThanOrEqualTo(String value) {
            addCriterion("`onsale_or_not` <=", value, "onsaleOrNot");
            return (Criteria) this;
        }

        public Criteria andOnsaleOrNotLike(String value) {
            addCriterion("`onsale_or_not` like", value, "onsaleOrNot");
            return (Criteria) this;
        }

        public Criteria andOnsaleOrNotNotLike(String value) {
            addCriterion("`onsale_or_not` not like", value, "onsaleOrNot");
            return (Criteria) this;
        }

        public Criteria andOnsaleOrNotIn(List<String> values) {
            addCriterion("`onsale_or_not` in", values, "onsaleOrNot");
            return (Criteria) this;
        }

        public Criteria andOnsaleOrNotNotIn(List<String> values) {
            addCriterion("`onsale_or_not` not in", values, "onsaleOrNot");
            return (Criteria) this;
        }

        public Criteria andOnsaleOrNotBetween(String value1, String value2) {
            addCriterion("`onsale_or_not` between", value1, value2, "onsaleOrNot");
            return (Criteria) this;
        }

        public Criteria andOnsaleOrNotNotBetween(String value1, String value2) {
            addCriterion("`onsale_or_not` not between", value1, value2, "onsaleOrNot");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("`version` is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("`version` is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("`version` =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("`version` <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("`version` >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("`version` >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("`version` <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("`version` <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("`version` in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("`version` not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("`version` between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("`version` not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("`remark` is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("`remark` is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("`remark` =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("`remark` <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("`remark` >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("`remark` >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("`remark` <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("`remark` <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("`remark` like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("`remark` not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("`remark` in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("`remark` not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("`remark` between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("`remark` not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andParticipantNoIsNull() {
            addCriterion("`participant_no` is null");
            return (Criteria) this;
        }

        public Criteria andParticipantNoIsNotNull() {
            addCriterion("`participant_no` is not null");
            return (Criteria) this;
        }

        public Criteria andParticipantNoEqualTo(Integer value) {
            addCriterion("`participant_no` =", value, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoNotEqualTo(Integer value) {
            addCriterion("`participant_no` <>", value, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoGreaterThan(Integer value) {
            addCriterion("`participant_no` >", value, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("`participant_no` >=", value, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoLessThan(Integer value) {
            addCriterion("`participant_no` <", value, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoLessThanOrEqualTo(Integer value) {
            addCriterion("`participant_no` <=", value, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoIn(List<Integer> values) {
            addCriterion("`participant_no` in", values, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoNotIn(List<Integer> values) {
            addCriterion("`participant_no` not in", values, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoBetween(Integer value1, Integer value2) {
            addCriterion("`participant_no` between", value1, value2, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoNotBetween(Integer value1, Integer value2) {
            addCriterion("`participant_no` not between", value1, value2, "participantNo");
            return (Criteria) this;
        }

        public Criteria andShouldNoIsNull() {
            addCriterion("`should_no` is null");
            return (Criteria) this;
        }

        public Criteria andShouldNoIsNotNull() {
            addCriterion("`should_no` is not null");
            return (Criteria) this;
        }

        public Criteria andShouldNoEqualTo(Integer value) {
            addCriterion("`should_no` =", value, "shouldNo");
            return (Criteria) this;
        }

        public Criteria andShouldNoNotEqualTo(Integer value) {
            addCriterion("`should_no` <>", value, "shouldNo");
            return (Criteria) this;
        }

        public Criteria andShouldNoGreaterThan(Integer value) {
            addCriterion("`should_no` >", value, "shouldNo");
            return (Criteria) this;
        }

        public Criteria andShouldNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("`should_no` >=", value, "shouldNo");
            return (Criteria) this;
        }

        public Criteria andShouldNoLessThan(Integer value) {
            addCriterion("`should_no` <", value, "shouldNo");
            return (Criteria) this;
        }

        public Criteria andShouldNoLessThanOrEqualTo(Integer value) {
            addCriterion("`should_no` <=", value, "shouldNo");
            return (Criteria) this;
        }

        public Criteria andShouldNoIn(List<Integer> values) {
            addCriterion("`should_no` in", values, "shouldNo");
            return (Criteria) this;
        }

        public Criteria andShouldNoNotIn(List<Integer> values) {
            addCriterion("`should_no` not in", values, "shouldNo");
            return (Criteria) this;
        }

        public Criteria andShouldNoBetween(Integer value1, Integer value2) {
            addCriterion("`should_no` between", value1, value2, "shouldNo");
            return (Criteria) this;
        }

        public Criteria andShouldNoNotBetween(Integer value1, Integer value2) {
            addCriterion("`should_no` not between", value1, value2, "shouldNo");
            return (Criteria) this;
        }

        public Criteria andActualNoIsNull() {
            addCriterion("`actual_no` is null");
            return (Criteria) this;
        }

        public Criteria andActualNoIsNotNull() {
            addCriterion("`actual_no` is not null");
            return (Criteria) this;
        }

        public Criteria andActualNoEqualTo(Integer value) {
            addCriterion("`actual_no` =", value, "actualNo");
            return (Criteria) this;
        }

        public Criteria andActualNoNotEqualTo(Integer value) {
            addCriterion("`actual_no` <>", value, "actualNo");
            return (Criteria) this;
        }

        public Criteria andActualNoGreaterThan(Integer value) {
            addCriterion("`actual_no` >", value, "actualNo");
            return (Criteria) this;
        }

        public Criteria andActualNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("`actual_no` >=", value, "actualNo");
            return (Criteria) this;
        }

        public Criteria andActualNoLessThan(Integer value) {
            addCriterion("`actual_no` <", value, "actualNo");
            return (Criteria) this;
        }

        public Criteria andActualNoLessThanOrEqualTo(Integer value) {
            addCriterion("`actual_no` <=", value, "actualNo");
            return (Criteria) this;
        }

        public Criteria andActualNoIn(List<Integer> values) {
            addCriterion("`actual_no` in", values, "actualNo");
            return (Criteria) this;
        }

        public Criteria andActualNoNotIn(List<Integer> values) {
            addCriterion("`actual_no` not in", values, "actualNo");
            return (Criteria) this;
        }

        public Criteria andActualNoBetween(Integer value1, Integer value2) {
            addCriterion("`actual_no` between", value1, value2, "actualNo");
            return (Criteria) this;
        }

        public Criteria andActualNoNotBetween(Integer value1, Integer value2) {
            addCriterion("`actual_no` not between", value1, value2, "actualNo");
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

        public Criteria andActivitySubjectIsNull() {
            addCriterion("`activity_subject` is null");
            return (Criteria) this;
        }

        public Criteria andActivitySubjectIsNotNull() {
            addCriterion("`activity_subject` is not null");
            return (Criteria) this;
        }

        public Criteria andActivitySubjectEqualTo(String value) {
            addCriterion("`activity_subject` =", value, "activitySubject");
            return (Criteria) this;
        }

        public Criteria andActivitySubjectNotEqualTo(String value) {
            addCriterion("`activity_subject` <>", value, "activitySubject");
            return (Criteria) this;
        }

        public Criteria andActivitySubjectGreaterThan(String value) {
            addCriterion("`activity_subject` >", value, "activitySubject");
            return (Criteria) this;
        }

        public Criteria andActivitySubjectGreaterThanOrEqualTo(String value) {
            addCriterion("`activity_subject` >=", value, "activitySubject");
            return (Criteria) this;
        }

        public Criteria andActivitySubjectLessThan(String value) {
            addCriterion("`activity_subject` <", value, "activitySubject");
            return (Criteria) this;
        }

        public Criteria andActivitySubjectLessThanOrEqualTo(String value) {
            addCriterion("`activity_subject` <=", value, "activitySubject");
            return (Criteria) this;
        }

        public Criteria andActivitySubjectLike(String value) {
            addCriterion("`activity_subject` like", value, "activitySubject");
            return (Criteria) this;
        }

        public Criteria andActivitySubjectNotLike(String value) {
            addCriterion("`activity_subject` not like", value, "activitySubject");
            return (Criteria) this;
        }

        public Criteria andActivitySubjectIn(List<String> values) {
            addCriterion("`activity_subject` in", values, "activitySubject");
            return (Criteria) this;
        }

        public Criteria andActivitySubjectNotIn(List<String> values) {
            addCriterion("`activity_subject` not in", values, "activitySubject");
            return (Criteria) this;
        }

        public Criteria andActivitySubjectBetween(String value1, String value2) {
            addCriterion("`activity_subject` between", value1, value2, "activitySubject");
            return (Criteria) this;
        }

        public Criteria andActivitySubjectNotBetween(String value1, String value2) {
            addCriterion("`activity_subject` not between", value1, value2, "activitySubject");
            return (Criteria) this;
        }

        public Criteria andActivityStartIsNull() {
            addCriterion("`activity_start` is null");
            return (Criteria) this;
        }

        public Criteria andActivityStartIsNotNull() {
            addCriterion("`activity_start` is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStartEqualTo(Date value) {
            addCriterion("`activity_start` =", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartNotEqualTo(Date value) {
            addCriterion("`activity_start` <>", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartGreaterThan(Date value) {
            addCriterion("`activity_start` >", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartGreaterThanOrEqualTo(Date value) {
            addCriterion("`activity_start` >=", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartLessThan(Date value) {
            addCriterion("`activity_start` <", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartLessThanOrEqualTo(Date value) {
            addCriterion("`activity_start` <=", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartIn(List<Date> values) {
            addCriterion("`activity_start` in", values, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartNotIn(List<Date> values) {
            addCriterion("`activity_start` not in", values, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartBetween(Date value1, Date value2) {
            addCriterion("`activity_start` between", value1, value2, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartNotBetween(Date value1, Date value2) {
            addCriterion("`activity_start` not between", value1, value2, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityEndIsNull() {
            addCriterion("`activity_end` is null");
            return (Criteria) this;
        }

        public Criteria andActivityEndIsNotNull() {
            addCriterion("`activity_end` is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEndEqualTo(Date value) {
            addCriterion("`activity_end` =", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndNotEqualTo(Date value) {
            addCriterion("`activity_end` <>", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndGreaterThan(Date value) {
            addCriterion("`activity_end` >", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndGreaterThanOrEqualTo(Date value) {
            addCriterion("`activity_end` >=", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndLessThan(Date value) {
            addCriterion("`activity_end` <", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndLessThanOrEqualTo(Date value) {
            addCriterion("`activity_end` <=", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndIn(List<Date> values) {
            addCriterion("`activity_end` in", values, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndNotIn(List<Date> values) {
            addCriterion("`activity_end` not in", values, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndBetween(Date value1, Date value2) {
            addCriterion("`activity_end` between", value1, value2, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndNotBetween(Date value1, Date value2) {
            addCriterion("`activity_end` not between", value1, value2, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andGatherPointIsNull() {
            addCriterion("`gather_point` is null");
            return (Criteria) this;
        }

        public Criteria andGatherPointIsNotNull() {
            addCriterion("`gather_point` is not null");
            return (Criteria) this;
        }

        public Criteria andGatherPointEqualTo(String value) {
            addCriterion("`gather_point` =", value, "gatherPoint");
            return (Criteria) this;
        }

        public Criteria andGatherPointNotEqualTo(String value) {
            addCriterion("`gather_point` <>", value, "gatherPoint");
            return (Criteria) this;
        }

        public Criteria andGatherPointGreaterThan(String value) {
            addCriterion("`gather_point` >", value, "gatherPoint");
            return (Criteria) this;
        }

        public Criteria andGatherPointGreaterThanOrEqualTo(String value) {
            addCriterion("`gather_point` >=", value, "gatherPoint");
            return (Criteria) this;
        }

        public Criteria andGatherPointLessThan(String value) {
            addCriterion("`gather_point` <", value, "gatherPoint");
            return (Criteria) this;
        }

        public Criteria andGatherPointLessThanOrEqualTo(String value) {
            addCriterion("`gather_point` <=", value, "gatherPoint");
            return (Criteria) this;
        }

        public Criteria andGatherPointLike(String value) {
            addCriterion("`gather_point` like", value, "gatherPoint");
            return (Criteria) this;
        }

        public Criteria andGatherPointNotLike(String value) {
            addCriterion("`gather_point` not like", value, "gatherPoint");
            return (Criteria) this;
        }

        public Criteria andGatherPointIn(List<String> values) {
            addCriterion("`gather_point` in", values, "gatherPoint");
            return (Criteria) this;
        }

        public Criteria andGatherPointNotIn(List<String> values) {
            addCriterion("`gather_point` not in", values, "gatherPoint");
            return (Criteria) this;
        }

        public Criteria andGatherPointBetween(String value1, String value2) {
            addCriterion("`gather_point` between", value1, value2, "gatherPoint");
            return (Criteria) this;
        }

        public Criteria andGatherPointNotBetween(String value1, String value2) {
            addCriterion("`gather_point` not between", value1, value2, "gatherPoint");
            return (Criteria) this;
        }

        public Criteria andGatherTimeIsNull() {
            addCriterion("`gather_time` is null");
            return (Criteria) this;
        }

        public Criteria andGatherTimeIsNotNull() {
            addCriterion("`gather_time` is not null");
            return (Criteria) this;
        }

        public Criteria andGatherTimeEqualTo(Date value) {
            addCriterion("`gather_time` =", value, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeNotEqualTo(Date value) {
            addCriterion("`gather_time` <>", value, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeGreaterThan(Date value) {
            addCriterion("`gather_time` >", value, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`gather_time` >=", value, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeLessThan(Date value) {
            addCriterion("`gather_time` <", value, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeLessThanOrEqualTo(Date value) {
            addCriterion("`gather_time` <=", value, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeIn(List<Date> values) {
            addCriterion("`gather_time` in", values, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeNotIn(List<Date> values) {
            addCriterion("`gather_time` not in", values, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeBetween(Date value1, Date value2) {
            addCriterion("`gather_time` between", value1, value2, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeNotBetween(Date value1, Date value2) {
            addCriterion("`gather_time` not between", value1, value2, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andFrequencyBandIsNull() {
            addCriterion("`frequency_band` is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyBandIsNotNull() {
            addCriterion("`frequency_band` is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyBandEqualTo(String value) {
            addCriterion("`frequency_band` =", value, "frequencyBand");
            return (Criteria) this;
        }

        public Criteria andFrequencyBandNotEqualTo(String value) {
            addCriterion("`frequency_band` <>", value, "frequencyBand");
            return (Criteria) this;
        }

        public Criteria andFrequencyBandGreaterThan(String value) {
            addCriterion("`frequency_band` >", value, "frequencyBand");
            return (Criteria) this;
        }

        public Criteria andFrequencyBandGreaterThanOrEqualTo(String value) {
            addCriterion("`frequency_band` >=", value, "frequencyBand");
            return (Criteria) this;
        }

        public Criteria andFrequencyBandLessThan(String value) {
            addCriterion("`frequency_band` <", value, "frequencyBand");
            return (Criteria) this;
        }

        public Criteria andFrequencyBandLessThanOrEqualTo(String value) {
            addCriterion("`frequency_band` <=", value, "frequencyBand");
            return (Criteria) this;
        }

        public Criteria andFrequencyBandLike(String value) {
            addCriterion("`frequency_band` like", value, "frequencyBand");
            return (Criteria) this;
        }

        public Criteria andFrequencyBandNotLike(String value) {
            addCriterion("`frequency_band` not like", value, "frequencyBand");
            return (Criteria) this;
        }

        public Criteria andFrequencyBandIn(List<String> values) {
            addCriterion("`frequency_band` in", values, "frequencyBand");
            return (Criteria) this;
        }

        public Criteria andFrequencyBandNotIn(List<String> values) {
            addCriterion("`frequency_band` not in", values, "frequencyBand");
            return (Criteria) this;
        }

        public Criteria andFrequencyBandBetween(String value1, String value2) {
            addCriterion("`frequency_band` between", value1, value2, "frequencyBand");
            return (Criteria) this;
        }

        public Criteria andFrequencyBandNotBetween(String value1, String value2) {
            addCriterion("`frequency_band` not between", value1, value2, "frequencyBand");
            return (Criteria) this;
        }

        public Criteria andPowerConditionIsNull() {
            addCriterion("`power_condition` is null");
            return (Criteria) this;
        }

        public Criteria andPowerConditionIsNotNull() {
            addCriterion("`power_condition` is not null");
            return (Criteria) this;
        }

        public Criteria andPowerConditionEqualTo(String value) {
            addCriterion("`power_condition` =", value, "powerCondition");
            return (Criteria) this;
        }

        public Criteria andPowerConditionNotEqualTo(String value) {
            addCriterion("`power_condition` <>", value, "powerCondition");
            return (Criteria) this;
        }

        public Criteria andPowerConditionGreaterThan(String value) {
            addCriterion("`power_condition` >", value, "powerCondition");
            return (Criteria) this;
        }

        public Criteria andPowerConditionGreaterThanOrEqualTo(String value) {
            addCriterion("`power_condition` >=", value, "powerCondition");
            return (Criteria) this;
        }

        public Criteria andPowerConditionLessThan(String value) {
            addCriterion("`power_condition` <", value, "powerCondition");
            return (Criteria) this;
        }

        public Criteria andPowerConditionLessThanOrEqualTo(String value) {
            addCriterion("`power_condition` <=", value, "powerCondition");
            return (Criteria) this;
        }

        public Criteria andPowerConditionLike(String value) {
            addCriterion("`power_condition` like", value, "powerCondition");
            return (Criteria) this;
        }

        public Criteria andPowerConditionNotLike(String value) {
            addCriterion("`power_condition` not like", value, "powerCondition");
            return (Criteria) this;
        }

        public Criteria andPowerConditionIn(List<String> values) {
            addCriterion("`power_condition` in", values, "powerCondition");
            return (Criteria) this;
        }

        public Criteria andPowerConditionNotIn(List<String> values) {
            addCriterion("`power_condition` not in", values, "powerCondition");
            return (Criteria) this;
        }

        public Criteria andPowerConditionBetween(String value1, String value2) {
            addCriterion("`power_condition` between", value1, value2, "powerCondition");
            return (Criteria) this;
        }

        public Criteria andPowerConditionNotBetween(String value1, String value2) {
            addCriterion("`power_condition` not between", value1, value2, "powerCondition");
            return (Criteria) this;
        }

        public Criteria andApplyNoIsNull() {
            addCriterion("`apply_no` is null");
            return (Criteria) this;
        }

        public Criteria andApplyNoIsNotNull() {
            addCriterion("`apply_no` is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNoEqualTo(Integer value) {
            addCriterion("`apply_no` =", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotEqualTo(Integer value) {
            addCriterion("`apply_no` <>", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThan(Integer value) {
            addCriterion("`apply_no` >", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("`apply_no` >=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThan(Integer value) {
            addCriterion("`apply_no` <", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThanOrEqualTo(Integer value) {
            addCriterion("`apply_no` <=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoIn(List<Integer> values) {
            addCriterion("`apply_no` in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotIn(List<Integer> values) {
            addCriterion("`apply_no` not in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoBetween(Integer value1, Integer value2) {
            addCriterion("`apply_no` between", value1, value2, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotBetween(Integer value1, Integer value2) {
            addCriterion("`apply_no` not between", value1, value2, "applyNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoIsNull() {
            addCriterion("`max_no` is null");
            return (Criteria) this;
        }

        public Criteria andMaxNoIsNotNull() {
            addCriterion("`max_no` is not null");
            return (Criteria) this;
        }

        public Criteria andMaxNoEqualTo(Integer value) {
            addCriterion("`max_no` =", value, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoNotEqualTo(Integer value) {
            addCriterion("`max_no` <>", value, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoGreaterThan(Integer value) {
            addCriterion("`max_no` >", value, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("`max_no` >=", value, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoLessThan(Integer value) {
            addCriterion("`max_no` <", value, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoLessThanOrEqualTo(Integer value) {
            addCriterion("`max_no` <=", value, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoIn(List<Integer> values) {
            addCriterion("`max_no` in", values, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoNotIn(List<Integer> values) {
            addCriterion("`max_no` not in", values, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoBetween(Integer value1, Integer value2) {
            addCriterion("`max_no` between", value1, value2, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoNotBetween(Integer value1, Integer value2) {
            addCriterion("`max_no` not between", value1, value2, "maxNo");
            return (Criteria) this;
        }

        public Criteria andFrontMoneyIsNull() {
            addCriterion("`front_money` is null");
            return (Criteria) this;
        }

        public Criteria andFrontMoneyIsNotNull() {
            addCriterion("`front_money` is not null");
            return (Criteria) this;
        }

        public Criteria andFrontMoneyEqualTo(BigDecimal value) {
            addCriterion("`front_money` =", value, "frontMoney");
            return (Criteria) this;
        }

        public Criteria andFrontMoneyNotEqualTo(BigDecimal value) {
            addCriterion("`front_money` <>", value, "frontMoney");
            return (Criteria) this;
        }

        public Criteria andFrontMoneyGreaterThan(BigDecimal value) {
            addCriterion("`front_money` >", value, "frontMoney");
            return (Criteria) this;
        }

        public Criteria andFrontMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("`front_money` >=", value, "frontMoney");
            return (Criteria) this;
        }

        public Criteria andFrontMoneyLessThan(BigDecimal value) {
            addCriterion("`front_money` <", value, "frontMoney");
            return (Criteria) this;
        }

        public Criteria andFrontMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("`front_money` <=", value, "frontMoney");
            return (Criteria) this;
        }

        public Criteria andFrontMoneyIn(List<BigDecimal> values) {
            addCriterion("`front_money` in", values, "frontMoney");
            return (Criteria) this;
        }

        public Criteria andFrontMoneyNotIn(List<BigDecimal> values) {
            addCriterion("`front_money` not in", values, "frontMoney");
            return (Criteria) this;
        }

        public Criteria andFrontMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("`front_money` between", value1, value2, "frontMoney");
            return (Criteria) this;
        }

        public Criteria andFrontMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("`front_money` not between", value1, value2, "frontMoney");
            return (Criteria) this;
        }

        public Criteria andHandDownIsNull() {
            addCriterion("`hand_down` is null");
            return (Criteria) this;
        }

        public Criteria andHandDownIsNotNull() {
            addCriterion("`hand_down` is not null");
            return (Criteria) this;
        }

        public Criteria andHandDownEqualTo(Date value) {
            addCriterion("`hand_down` =", value, "handDown");
            return (Criteria) this;
        }

        public Criteria andHandDownNotEqualTo(Date value) {
            addCriterion("`hand_down` <>", value, "handDown");
            return (Criteria) this;
        }

        public Criteria andHandDownGreaterThan(Date value) {
            addCriterion("`hand_down` >", value, "handDown");
            return (Criteria) this;
        }

        public Criteria andHandDownGreaterThanOrEqualTo(Date value) {
            addCriterion("`hand_down` >=", value, "handDown");
            return (Criteria) this;
        }

        public Criteria andHandDownLessThan(Date value) {
            addCriterion("`hand_down` <", value, "handDown");
            return (Criteria) this;
        }

        public Criteria andHandDownLessThanOrEqualTo(Date value) {
            addCriterion("`hand_down` <=", value, "handDown");
            return (Criteria) this;
        }

        public Criteria andHandDownIn(List<Date> values) {
            addCriterion("`hand_down` in", values, "handDown");
            return (Criteria) this;
        }

        public Criteria andHandDownNotIn(List<Date> values) {
            addCriterion("`hand_down` not in", values, "handDown");
            return (Criteria) this;
        }

        public Criteria andHandDownBetween(Date value1, Date value2) {
            addCriterion("`hand_down` between", value1, value2, "handDown");
            return (Criteria) this;
        }

        public Criteria andHandDownNotBetween(Date value1, Date value2) {
            addCriterion("`hand_down` not between", value1, value2, "handDown");
            return (Criteria) this;
        }

        public Criteria andHandUpIsNull() {
            addCriterion("`hand_up` is null");
            return (Criteria) this;
        }

        public Criteria andHandUpIsNotNull() {
            addCriterion("`hand_up` is not null");
            return (Criteria) this;
        }

        public Criteria andHandUpEqualTo(Date value) {
            addCriterion("`hand_up` =", value, "handUp");
            return (Criteria) this;
        }

        public Criteria andHandUpNotEqualTo(Date value) {
            addCriterion("`hand_up` <>", value, "handUp");
            return (Criteria) this;
        }

        public Criteria andHandUpGreaterThan(Date value) {
            addCriterion("`hand_up` >", value, "handUp");
            return (Criteria) this;
        }

        public Criteria andHandUpGreaterThanOrEqualTo(Date value) {
            addCriterion("`hand_up` >=", value, "handUp");
            return (Criteria) this;
        }

        public Criteria andHandUpLessThan(Date value) {
            addCriterion("`hand_up` <", value, "handUp");
            return (Criteria) this;
        }

        public Criteria andHandUpLessThanOrEqualTo(Date value) {
            addCriterion("`hand_up` <=", value, "handUp");
            return (Criteria) this;
        }

        public Criteria andHandUpIn(List<Date> values) {
            addCriterion("`hand_up` in", values, "handUp");
            return (Criteria) this;
        }

        public Criteria andHandUpNotIn(List<Date> values) {
            addCriterion("`hand_up` not in", values, "handUp");
            return (Criteria) this;
        }

        public Criteria andHandUpBetween(Date value1, Date value2) {
            addCriterion("`hand_up` between", value1, value2, "handUp");
            return (Criteria) this;
        }

        public Criteria andHandUpNotBetween(Date value1, Date value2) {
            addCriterion("`hand_up` not between", value1, value2, "handUp");
            return (Criteria) this;
        }

        public Criteria andOnsaleOrNotLikeInsensitive(String value) {
            addCriterion("upper(`onsale_or_not`) like", value.toUpperCase(), "onsaleOrNot");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(`remark`) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }

        public Criteria andAvailableOrNotLikeInsensitive(String value) {
            addCriterion("upper(`available_or_not`) like", value.toUpperCase(), "availableOrNot");
            return (Criteria) this;
        }

        public Criteria andActivitySubjectLikeInsensitive(String value) {
            addCriterion("upper(`activity_subject`) like", value.toUpperCase(), "activitySubject");
            return (Criteria) this;
        }

        public Criteria andGatherPointLikeInsensitive(String value) {
            addCriterion("upper(`gather_point`) like", value.toUpperCase(), "gatherPoint");
            return (Criteria) this;
        }

        public Criteria andFrequencyBandLikeInsensitive(String value) {
            addCriterion("upper(`frequency_band`) like", value.toUpperCase(), "frequencyBand");
            return (Criteria) this;
        }

        public Criteria andPowerConditionLikeInsensitive(String value) {
            addCriterion("upper(`power_condition`) like", value.toUpperCase(), "powerCondition");
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