package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sys04UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys04UserExample() {
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
            addCriterion("`id` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`id` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("`id` =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("`id` <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("`id` >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`id` >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("`id` <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("`id` <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("`id` in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("`id` not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("`id` between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`id` not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("`username` is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("`username` is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("`username` =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("`username` <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("`username` >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("`username` >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("`username` <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("`username` <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("`username` like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("`username` not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("`username` in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("`username` not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("`username` between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("`username` not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("`password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`password` not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltIsNull() {
            addCriterion("`password_salt` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltIsNotNull() {
            addCriterion("`password_salt` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltEqualTo(String value) {
            addCriterion("`password_salt` =", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotEqualTo(String value) {
            addCriterion("`password_salt` <>", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltGreaterThan(String value) {
            addCriterion("`password_salt` >", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltGreaterThanOrEqualTo(String value) {
            addCriterion("`password_salt` >=", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltLessThan(String value) {
            addCriterion("`password_salt` <", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltLessThanOrEqualTo(String value) {
            addCriterion("`password_salt` <=", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltLike(String value) {
            addCriterion("`password_salt` like", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotLike(String value) {
            addCriterion("`password_salt` not like", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltIn(List<String> values) {
            addCriterion("`password_salt` in", values, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotIn(List<String> values) {
            addCriterion("`password_salt` not in", values, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltBetween(String value1, String value2) {
            addCriterion("`password_salt` between", value1, value2, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotBetween(String value1, String value2) {
            addCriterion("`password_salt` not between", value1, value2, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andAccountMobileIsNull() {
            addCriterion("`account_mobile` is null");
            return (Criteria) this;
        }

        public Criteria andAccountMobileIsNotNull() {
            addCriterion("`account_mobile` is not null");
            return (Criteria) this;
        }

        public Criteria andAccountMobileEqualTo(String value) {
            addCriterion("`account_mobile` =", value, "accountMobile");
            return (Criteria) this;
        }

        public Criteria andAccountMobileNotEqualTo(String value) {
            addCriterion("`account_mobile` <>", value, "accountMobile");
            return (Criteria) this;
        }

        public Criteria andAccountMobileGreaterThan(String value) {
            addCriterion("`account_mobile` >", value, "accountMobile");
            return (Criteria) this;
        }

        public Criteria andAccountMobileGreaterThanOrEqualTo(String value) {
            addCriterion("`account_mobile` >=", value, "accountMobile");
            return (Criteria) this;
        }

        public Criteria andAccountMobileLessThan(String value) {
            addCriterion("`account_mobile` <", value, "accountMobile");
            return (Criteria) this;
        }

        public Criteria andAccountMobileLessThanOrEqualTo(String value) {
            addCriterion("`account_mobile` <=", value, "accountMobile");
            return (Criteria) this;
        }

        public Criteria andAccountMobileLike(String value) {
            addCriterion("`account_mobile` like", value, "accountMobile");
            return (Criteria) this;
        }

        public Criteria andAccountMobileNotLike(String value) {
            addCriterion("`account_mobile` not like", value, "accountMobile");
            return (Criteria) this;
        }

        public Criteria andAccountMobileIn(List<String> values) {
            addCriterion("`account_mobile` in", values, "accountMobile");
            return (Criteria) this;
        }

        public Criteria andAccountMobileNotIn(List<String> values) {
            addCriterion("`account_mobile` not in", values, "accountMobile");
            return (Criteria) this;
        }

        public Criteria andAccountMobileBetween(String value1, String value2) {
            addCriterion("`account_mobile` between", value1, value2, "accountMobile");
            return (Criteria) this;
        }

        public Criteria andAccountMobileNotBetween(String value1, String value2) {
            addCriterion("`account_mobile` not between", value1, value2, "accountMobile");
            return (Criteria) this;
        }

        public Criteria andAccountEmailIsNull() {
            addCriterion("`account_email` is null");
            return (Criteria) this;
        }

        public Criteria andAccountEmailIsNotNull() {
            addCriterion("`account_email` is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEmailEqualTo(String value) {
            addCriterion("`account_email` =", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotEqualTo(String value) {
            addCriterion("`account_email` <>", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailGreaterThan(String value) {
            addCriterion("`account_email` >", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailGreaterThanOrEqualTo(String value) {
            addCriterion("`account_email` >=", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLessThan(String value) {
            addCriterion("`account_email` <", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLessThanOrEqualTo(String value) {
            addCriterion("`account_email` <=", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLike(String value) {
            addCriterion("`account_email` like", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotLike(String value) {
            addCriterion("`account_email` not like", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailIn(List<String> values) {
            addCriterion("`account_email` in", values, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotIn(List<String> values) {
            addCriterion("`account_email` not in", values, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailBetween(String value1, String value2) {
            addCriterion("`account_email` between", value1, value2, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotBetween(String value1, String value2) {
            addCriterion("`account_email` not between", value1, value2, "accountEmail");
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

        public Criteria andValidateStatusMobileIsNull() {
            addCriterion("`validate_status_mobile` is null");
            return (Criteria) this;
        }

        public Criteria andValidateStatusMobileIsNotNull() {
            addCriterion("`validate_status_mobile` is not null");
            return (Criteria) this;
        }

        public Criteria andValidateStatusMobileEqualTo(Integer value) {
            addCriterion("`validate_status_mobile` =", value, "validateStatusMobile");
            return (Criteria) this;
        }

        public Criteria andValidateStatusMobileNotEqualTo(Integer value) {
            addCriterion("`validate_status_mobile` <>", value, "validateStatusMobile");
            return (Criteria) this;
        }

        public Criteria andValidateStatusMobileGreaterThan(Integer value) {
            addCriterion("`validate_status_mobile` >", value, "validateStatusMobile");
            return (Criteria) this;
        }

        public Criteria andValidateStatusMobileGreaterThanOrEqualTo(Integer value) {
            addCriterion("`validate_status_mobile` >=", value, "validateStatusMobile");
            return (Criteria) this;
        }

        public Criteria andValidateStatusMobileLessThan(Integer value) {
            addCriterion("`validate_status_mobile` <", value, "validateStatusMobile");
            return (Criteria) this;
        }

        public Criteria andValidateStatusMobileLessThanOrEqualTo(Integer value) {
            addCriterion("`validate_status_mobile` <=", value, "validateStatusMobile");
            return (Criteria) this;
        }

        public Criteria andValidateStatusMobileIn(List<Integer> values) {
            addCriterion("`validate_status_mobile` in", values, "validateStatusMobile");
            return (Criteria) this;
        }

        public Criteria andValidateStatusMobileNotIn(List<Integer> values) {
            addCriterion("`validate_status_mobile` not in", values, "validateStatusMobile");
            return (Criteria) this;
        }

        public Criteria andValidateStatusMobileBetween(Integer value1, Integer value2) {
            addCriterion("`validate_status_mobile` between", value1, value2, "validateStatusMobile");
            return (Criteria) this;
        }

        public Criteria andValidateStatusMobileNotBetween(Integer value1, Integer value2) {
            addCriterion("`validate_status_mobile` not between", value1, value2, "validateStatusMobile");
            return (Criteria) this;
        }

        public Criteria andValidateStatusEmailIsNull() {
            addCriterion("`validate_status_email` is null");
            return (Criteria) this;
        }

        public Criteria andValidateStatusEmailIsNotNull() {
            addCriterion("`validate_status_email` is not null");
            return (Criteria) this;
        }

        public Criteria andValidateStatusEmailEqualTo(Integer value) {
            addCriterion("`validate_status_email` =", value, "validateStatusEmail");
            return (Criteria) this;
        }

        public Criteria andValidateStatusEmailNotEqualTo(Integer value) {
            addCriterion("`validate_status_email` <>", value, "validateStatusEmail");
            return (Criteria) this;
        }

        public Criteria andValidateStatusEmailGreaterThan(Integer value) {
            addCriterion("`validate_status_email` >", value, "validateStatusEmail");
            return (Criteria) this;
        }

        public Criteria andValidateStatusEmailGreaterThanOrEqualTo(Integer value) {
            addCriterion("`validate_status_email` >=", value, "validateStatusEmail");
            return (Criteria) this;
        }

        public Criteria andValidateStatusEmailLessThan(Integer value) {
            addCriterion("`validate_status_email` <", value, "validateStatusEmail");
            return (Criteria) this;
        }

        public Criteria andValidateStatusEmailLessThanOrEqualTo(Integer value) {
            addCriterion("`validate_status_email` <=", value, "validateStatusEmail");
            return (Criteria) this;
        }

        public Criteria andValidateStatusEmailIn(List<Integer> values) {
            addCriterion("`validate_status_email` in", values, "validateStatusEmail");
            return (Criteria) this;
        }

        public Criteria andValidateStatusEmailNotIn(List<Integer> values) {
            addCriterion("`validate_status_email` not in", values, "validateStatusEmail");
            return (Criteria) this;
        }

        public Criteria andValidateStatusEmailBetween(Integer value1, Integer value2) {
            addCriterion("`validate_status_email` between", value1, value2, "validateStatusEmail");
            return (Criteria) this;
        }

        public Criteria andValidateStatusEmailNotBetween(Integer value1, Integer value2) {
            addCriterion("`validate_status_email` not between", value1, value2, "validateStatusEmail");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("`create_time` is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("`create_time` is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("`create_time` =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("`create_time` <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("`create_time` >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`create_time` >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("`create_time` <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("`create_time` <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("`create_time` in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("`create_time` not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("`create_time` between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("`create_time` not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(`username`) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(`password`) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltLikeInsensitive(String value) {
            addCriterion("upper(`password_salt`) like", value.toUpperCase(), "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andAccountMobileLikeInsensitive(String value) {
            addCriterion("upper(`account_mobile`) like", value.toUpperCase(), "accountMobile");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLikeInsensitive(String value) {
            addCriterion("upper(`account_email`) like", value.toUpperCase(), "accountEmail");
            return (Criteria) this;
        }

        public Criteria andNicknameLikeInsensitive(String value) {
            addCriterion("upper(`nickname`) like", value.toUpperCase(), "nickname");
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