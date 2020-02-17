package com.woniu.godaji.pojo;

import java.util.ArrayList;
import java.util.List;

public class BtcSysWarecftbrandExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BTC_sys_wareCftBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BTC_sys_wareCftBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BTC_sys_wareCftBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareCftBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public BtcSysWarecftbrandExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareCftBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareCftBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareCftBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareCftBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareCftBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareCftBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareCftBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareCftBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareCftBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareCftBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BTC_sys_wareCftBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
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

        public Criteria andWareclassificationtypeidIsNull() {
            addCriterion("wareClassificationTypeID is null");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypeidIsNotNull() {
            addCriterion("wareClassificationTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypeidEqualTo(Integer value) {
            addCriterion("wareClassificationTypeID =", value, "wareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypeidNotEqualTo(Integer value) {
            addCriterion("wareClassificationTypeID <>", value, "wareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypeidGreaterThan(Integer value) {
            addCriterion("wareClassificationTypeID >", value, "wareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wareClassificationTypeID >=", value, "wareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypeidLessThan(Integer value) {
            addCriterion("wareClassificationTypeID <", value, "wareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("wareClassificationTypeID <=", value, "wareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypeidIn(List<Integer> values) {
            addCriterion("wareClassificationTypeID in", values, "wareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypeidNotIn(List<Integer> values) {
            addCriterion("wareClassificationTypeID not in", values, "wareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypeidBetween(Integer value1, Integer value2) {
            addCriterion("wareClassificationTypeID between", value1, value2, "wareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("wareClassificationTypeID not between", value1, value2, "wareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andWarebrandidIsNull() {
            addCriterion("wareBrandID is null");
            return (Criteria) this;
        }

        public Criteria andWarebrandidIsNotNull() {
            addCriterion("wareBrandID is not null");
            return (Criteria) this;
        }

        public Criteria andWarebrandidEqualTo(Integer value) {
            addCriterion("wareBrandID =", value, "warebrandid");
            return (Criteria) this;
        }

        public Criteria andWarebrandidNotEqualTo(Integer value) {
            addCriterion("wareBrandID <>", value, "warebrandid");
            return (Criteria) this;
        }

        public Criteria andWarebrandidGreaterThan(Integer value) {
            addCriterion("wareBrandID >", value, "warebrandid");
            return (Criteria) this;
        }

        public Criteria andWarebrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wareBrandID >=", value, "warebrandid");
            return (Criteria) this;
        }

        public Criteria andWarebrandidLessThan(Integer value) {
            addCriterion("wareBrandID <", value, "warebrandid");
            return (Criteria) this;
        }

        public Criteria andWarebrandidLessThanOrEqualTo(Integer value) {
            addCriterion("wareBrandID <=", value, "warebrandid");
            return (Criteria) this;
        }

        public Criteria andWarebrandidIn(List<Integer> values) {
            addCriterion("wareBrandID in", values, "warebrandid");
            return (Criteria) this;
        }

        public Criteria andWarebrandidNotIn(List<Integer> values) {
            addCriterion("wareBrandID not in", values, "warebrandid");
            return (Criteria) this;
        }

        public Criteria andWarebrandidBetween(Integer value1, Integer value2) {
            addCriterion("wareBrandID between", value1, value2, "warebrandid");
            return (Criteria) this;
        }

        public Criteria andWarebrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("wareBrandID not between", value1, value2, "warebrandid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BTC_sys_wareCftBrand
     *
     * @mbggenerated do_not_delete_during_merge Tue Feb 18 00:31:41 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BTC_sys_wareCftBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
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