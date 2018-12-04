package com.jxyd.nole.jpa.mysql.alpha.raw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sys01PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys01PermissionExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("`pid` is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("`pid` is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("`pid` =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("`pid` <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("`pid` >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("`pid` >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("`pid` <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("`pid` <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("`pid` in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("`pid` not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("`pid` between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("`pid` not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andIsTreeIsNull() {
            addCriterion("`is_tree` is null");
            return (Criteria) this;
        }

        public Criteria andIsTreeIsNotNull() {
            addCriterion("`is_tree` is not null");
            return (Criteria) this;
        }

        public Criteria andIsTreeEqualTo(Integer value) {
            addCriterion("`is_tree` =", value, "isTree");
            return (Criteria) this;
        }

        public Criteria andIsTreeNotEqualTo(Integer value) {
            addCriterion("`is_tree` <>", value, "isTree");
            return (Criteria) this;
        }

        public Criteria andIsTreeGreaterThan(Integer value) {
            addCriterion("`is_tree` >", value, "isTree");
            return (Criteria) this;
        }

        public Criteria andIsTreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`is_tree` >=", value, "isTree");
            return (Criteria) this;
        }

        public Criteria andIsTreeLessThan(Integer value) {
            addCriterion("`is_tree` <", value, "isTree");
            return (Criteria) this;
        }

        public Criteria andIsTreeLessThanOrEqualTo(Integer value) {
            addCriterion("`is_tree` <=", value, "isTree");
            return (Criteria) this;
        }

        public Criteria andIsTreeIn(List<Integer> values) {
            addCriterion("`is_tree` in", values, "isTree");
            return (Criteria) this;
        }

        public Criteria andIsTreeNotIn(List<Integer> values) {
            addCriterion("`is_tree` not in", values, "isTree");
            return (Criteria) this;
        }

        public Criteria andIsTreeBetween(Integer value1, Integer value2) {
            addCriterion("`is_tree` between", value1, value2, "isTree");
            return (Criteria) this;
        }

        public Criteria andIsTreeNotBetween(Integer value1, Integer value2) {
            addCriterion("`is_tree` not between", value1, value2, "isTree");
            return (Criteria) this;
        }

        public Criteria andIsBranchIsNull() {
            addCriterion("`is_branch` is null");
            return (Criteria) this;
        }

        public Criteria andIsBranchIsNotNull() {
            addCriterion("`is_branch` is not null");
            return (Criteria) this;
        }

        public Criteria andIsBranchEqualTo(Integer value) {
            addCriterion("`is_branch` =", value, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchNotEqualTo(Integer value) {
            addCriterion("`is_branch` <>", value, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchGreaterThan(Integer value) {
            addCriterion("`is_branch` >", value, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchGreaterThanOrEqualTo(Integer value) {
            addCriterion("`is_branch` >=", value, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchLessThan(Integer value) {
            addCriterion("`is_branch` <", value, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchLessThanOrEqualTo(Integer value) {
            addCriterion("`is_branch` <=", value, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchIn(List<Integer> values) {
            addCriterion("`is_branch` in", values, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchNotIn(List<Integer> values) {
            addCriterion("`is_branch` not in", values, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchBetween(Integer value1, Integer value2) {
            addCriterion("`is_branch` between", value1, value2, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchNotBetween(Integer value1, Integer value2) {
            addCriterion("`is_branch` not between", value1, value2, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsLeafIsNull() {
            addCriterion("`is_leaf` is null");
            return (Criteria) this;
        }

        public Criteria andIsLeafIsNotNull() {
            addCriterion("`is_leaf` is not null");
            return (Criteria) this;
        }

        public Criteria andIsLeafEqualTo(Integer value) {
            addCriterion("`is_leaf` =", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotEqualTo(Integer value) {
            addCriterion("`is_leaf` <>", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafGreaterThan(Integer value) {
            addCriterion("`is_leaf` >", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafGreaterThanOrEqualTo(Integer value) {
            addCriterion("`is_leaf` >=", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafLessThan(Integer value) {
            addCriterion("`is_leaf` <", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafLessThanOrEqualTo(Integer value) {
            addCriterion("`is_leaf` <=", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafIn(List<Integer> values) {
            addCriterion("`is_leaf` in", values, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotIn(List<Integer> values) {
            addCriterion("`is_leaf` not in", values, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafBetween(Integer value1, Integer value2) {
            addCriterion("`is_leaf` between", value1, value2, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotBetween(Integer value1, Integer value2) {
            addCriterion("`is_leaf` not between", value1, value2, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsVeinIsNull() {
            addCriterion("`is_vein` is null");
            return (Criteria) this;
        }

        public Criteria andIsVeinIsNotNull() {
            addCriterion("`is_vein` is not null");
            return (Criteria) this;
        }

        public Criteria andIsVeinEqualTo(Integer value) {
            addCriterion("`is_vein` =", value, "isVein");
            return (Criteria) this;
        }

        public Criteria andIsVeinNotEqualTo(Integer value) {
            addCriterion("`is_vein` <>", value, "isVein");
            return (Criteria) this;
        }

        public Criteria andIsVeinGreaterThan(Integer value) {
            addCriterion("`is_vein` >", value, "isVein");
            return (Criteria) this;
        }

        public Criteria andIsVeinGreaterThanOrEqualTo(Integer value) {
            addCriterion("`is_vein` >=", value, "isVein");
            return (Criteria) this;
        }

        public Criteria andIsVeinLessThan(Integer value) {
            addCriterion("`is_vein` <", value, "isVein");
            return (Criteria) this;
        }

        public Criteria andIsVeinLessThanOrEqualTo(Integer value) {
            addCriterion("`is_vein` <=", value, "isVein");
            return (Criteria) this;
        }

        public Criteria andIsVeinIn(List<Integer> values) {
            addCriterion("`is_vein` in", values, "isVein");
            return (Criteria) this;
        }

        public Criteria andIsVeinNotIn(List<Integer> values) {
            addCriterion("`is_vein` not in", values, "isVein");
            return (Criteria) this;
        }

        public Criteria andIsVeinBetween(Integer value1, Integer value2) {
            addCriterion("`is_vein` between", value1, value2, "isVein");
            return (Criteria) this;
        }

        public Criteria andIsVeinNotBetween(Integer value1, Integer value2) {
            addCriterion("`is_vein` not between", value1, value2, "isVein");
            return (Criteria) this;
        }

        public Criteria andIsVeinMainIsNull() {
            addCriterion("`is_vein_main` is null");
            return (Criteria) this;
        }

        public Criteria andIsVeinMainIsNotNull() {
            addCriterion("`is_vein_main` is not null");
            return (Criteria) this;
        }

        public Criteria andIsVeinMainEqualTo(Integer value) {
            addCriterion("`is_vein_main` =", value, "isVeinMain");
            return (Criteria) this;
        }

        public Criteria andIsVeinMainNotEqualTo(Integer value) {
            addCriterion("`is_vein_main` <>", value, "isVeinMain");
            return (Criteria) this;
        }

        public Criteria andIsVeinMainGreaterThan(Integer value) {
            addCriterion("`is_vein_main` >", value, "isVeinMain");
            return (Criteria) this;
        }

        public Criteria andIsVeinMainGreaterThanOrEqualTo(Integer value) {
            addCriterion("`is_vein_main` >=", value, "isVeinMain");
            return (Criteria) this;
        }

        public Criteria andIsVeinMainLessThan(Integer value) {
            addCriterion("`is_vein_main` <", value, "isVeinMain");
            return (Criteria) this;
        }

        public Criteria andIsVeinMainLessThanOrEqualTo(Integer value) {
            addCriterion("`is_vein_main` <=", value, "isVeinMain");
            return (Criteria) this;
        }

        public Criteria andIsVeinMainIn(List<Integer> values) {
            addCriterion("`is_vein_main` in", values, "isVeinMain");
            return (Criteria) this;
        }

        public Criteria andIsVeinMainNotIn(List<Integer> values) {
            addCriterion("`is_vein_main` not in", values, "isVeinMain");
            return (Criteria) this;
        }

        public Criteria andIsVeinMainBetween(Integer value1, Integer value2) {
            addCriterion("`is_vein_main` between", value1, value2, "isVeinMain");
            return (Criteria) this;
        }

        public Criteria andIsVeinMainNotBetween(Integer value1, Integer value2) {
            addCriterion("`is_vein_main` not between", value1, value2, "isVeinMain");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("`level` is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("`level` is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("`level` =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("`level` <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("`level` >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("`level` >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("`level` <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("`level` <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("`level` in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("`level` not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("`level` between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("`level` not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andOrderIsNull() {
            addCriterion("`order` is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("`order` is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEqualTo(Integer value) {
            addCriterion("`order` =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(Integer value) {
            addCriterion("`order` <>", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThan(Integer value) {
            addCriterion("`order` >", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("`order` >=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThan(Integer value) {
            addCriterion("`order` <", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThanOrEqualTo(Integer value) {
            addCriterion("`order` <=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderIn(List<Integer> values) {
            addCriterion("`order` in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotIn(List<Integer> values) {
            addCriterion("`order` not in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderBetween(Integer value1, Integer value2) {
            addCriterion("`order` between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("`order` not between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andIsCollapsedIsNull() {
            addCriterion("`is_collapsed` is null");
            return (Criteria) this;
        }

        public Criteria andIsCollapsedIsNotNull() {
            addCriterion("`is_collapsed` is not null");
            return (Criteria) this;
        }

        public Criteria andIsCollapsedEqualTo(Integer value) {
            addCriterion("`is_collapsed` =", value, "isCollapsed");
            return (Criteria) this;
        }

        public Criteria andIsCollapsedNotEqualTo(Integer value) {
            addCriterion("`is_collapsed` <>", value, "isCollapsed");
            return (Criteria) this;
        }

        public Criteria andIsCollapsedGreaterThan(Integer value) {
            addCriterion("`is_collapsed` >", value, "isCollapsed");
            return (Criteria) this;
        }

        public Criteria andIsCollapsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("`is_collapsed` >=", value, "isCollapsed");
            return (Criteria) this;
        }

        public Criteria andIsCollapsedLessThan(Integer value) {
            addCriterion("`is_collapsed` <", value, "isCollapsed");
            return (Criteria) this;
        }

        public Criteria andIsCollapsedLessThanOrEqualTo(Integer value) {
            addCriterion("`is_collapsed` <=", value, "isCollapsed");
            return (Criteria) this;
        }

        public Criteria andIsCollapsedIn(List<Integer> values) {
            addCriterion("`is_collapsed` in", values, "isCollapsed");
            return (Criteria) this;
        }

        public Criteria andIsCollapsedNotIn(List<Integer> values) {
            addCriterion("`is_collapsed` not in", values, "isCollapsed");
            return (Criteria) this;
        }

        public Criteria andIsCollapsedBetween(Integer value1, Integer value2) {
            addCriterion("`is_collapsed` between", value1, value2, "isCollapsed");
            return (Criteria) this;
        }

        public Criteria andIsCollapsedNotBetween(Integer value1, Integer value2) {
            addCriterion("`is_collapsed` not between", value1, value2, "isCollapsed");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("`icon` is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("`icon` is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("`icon` =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("`icon` <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("`icon` >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("`icon` >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("`icon` <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("`icon` <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("`icon` like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("`icon` not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("`icon` in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("`icon` not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("`icon` between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("`icon` not between", value1, value2, "icon");
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

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(`name`) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andIconLikeInsensitive(String value) {
            addCriterion("upper(`icon`) like", value.toUpperCase(), "icon");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(`description`) like", value.toUpperCase(), "description");
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