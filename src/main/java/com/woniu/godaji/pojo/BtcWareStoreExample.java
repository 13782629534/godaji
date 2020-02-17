package com.woniu.godaji.pojo;

import java.util.ArrayList;
import java.util.List;

public class BtcWareStoreExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table btc_ware_store
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table btc_ware_store
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table btc_ware_store
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ware_store
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public BtcWareStoreExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ware_store
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ware_store
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ware_store
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ware_store
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ware_store
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ware_store
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ware_store
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
     * This method corresponds to the database table btc_ware_store
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
     * This method corresponds to the database table btc_ware_store
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ware_store
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
     * This class corresponds to the database table btc_ware_store
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

        public Criteria andBtcwarestoreidIsNull() {
            addCriterion("btcWareStoreID is null");
            return (Criteria) this;
        }

        public Criteria andBtcwarestoreidIsNotNull() {
            addCriterion("btcWareStoreID is not null");
            return (Criteria) this;
        }

        public Criteria andBtcwarestoreidEqualTo(Integer value) {
            addCriterion("btcWareStoreID =", value, "btcwarestoreid");
            return (Criteria) this;
        }

        public Criteria andBtcwarestoreidNotEqualTo(Integer value) {
            addCriterion("btcWareStoreID <>", value, "btcwarestoreid");
            return (Criteria) this;
        }

        public Criteria andBtcwarestoreidGreaterThan(Integer value) {
            addCriterion("btcWareStoreID >", value, "btcwarestoreid");
            return (Criteria) this;
        }

        public Criteria andBtcwarestoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("btcWareStoreID >=", value, "btcwarestoreid");
            return (Criteria) this;
        }

        public Criteria andBtcwarestoreidLessThan(Integer value) {
            addCriterion("btcWareStoreID <", value, "btcwarestoreid");
            return (Criteria) this;
        }

        public Criteria andBtcwarestoreidLessThanOrEqualTo(Integer value) {
            addCriterion("btcWareStoreID <=", value, "btcwarestoreid");
            return (Criteria) this;
        }

        public Criteria andBtcwarestoreidIn(List<Integer> values) {
            addCriterion("btcWareStoreID in", values, "btcwarestoreid");
            return (Criteria) this;
        }

        public Criteria andBtcwarestoreidNotIn(List<Integer> values) {
            addCriterion("btcWareStoreID not in", values, "btcwarestoreid");
            return (Criteria) this;
        }

        public Criteria andBtcwarestoreidBetween(Integer value1, Integer value2) {
            addCriterion("btcWareStoreID between", value1, value2, "btcwarestoreid");
            return (Criteria) this;
        }

        public Criteria andBtcwarestoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("btcWareStoreID not between", value1, value2, "btcwarestoreid");
            return (Criteria) this;
        }

        public Criteria andWareidIsNull() {
            addCriterion("wareID is null");
            return (Criteria) this;
        }

        public Criteria andWareidIsNotNull() {
            addCriterion("wareID is not null");
            return (Criteria) this;
        }

        public Criteria andWareidEqualTo(Integer value) {
            addCriterion("wareID =", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidNotEqualTo(Integer value) {
            addCriterion("wareID <>", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidGreaterThan(Integer value) {
            addCriterion("wareID >", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wareID >=", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidLessThan(Integer value) {
            addCriterion("wareID <", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidLessThanOrEqualTo(Integer value) {
            addCriterion("wareID <=", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidIn(List<Integer> values) {
            addCriterion("wareID in", values, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidNotIn(List<Integer> values) {
            addCriterion("wareID not in", values, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidBetween(Integer value1, Integer value2) {
            addCriterion("wareID between", value1, value2, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidNotBetween(Integer value1, Integer value2) {
            addCriterion("wareID not between", value1, value2, "wareid");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNull() {
            addCriterion("storeID is null");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNotNull() {
            addCriterion("storeID is not null");
            return (Criteria) this;
        }

        public Criteria andStoreidEqualTo(Integer value) {
            addCriterion("storeID =", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotEqualTo(Integer value) {
            addCriterion("storeID <>", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThan(Integer value) {
            addCriterion("storeID >", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeID >=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThan(Integer value) {
            addCriterion("storeID <", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThanOrEqualTo(Integer value) {
            addCriterion("storeID <=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidIn(List<Integer> values) {
            addCriterion("storeID in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotIn(List<Integer> values) {
            addCriterion("storeID not in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidBetween(Integer value1, Integer value2) {
            addCriterion("storeID between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("storeID not between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andMaterialidIsNull() {
            addCriterion("materialID is null");
            return (Criteria) this;
        }

        public Criteria andMaterialidIsNotNull() {
            addCriterion("materialID is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialidEqualTo(String value) {
            addCriterion("materialID =", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotEqualTo(String value) {
            addCriterion("materialID <>", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidGreaterThan(String value) {
            addCriterion("materialID >", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidGreaterThanOrEqualTo(String value) {
            addCriterion("materialID >=", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidLessThan(String value) {
            addCriterion("materialID <", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidLessThanOrEqualTo(String value) {
            addCriterion("materialID <=", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidLike(String value) {
            addCriterion("materialID like", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotLike(String value) {
            addCriterion("materialID not like", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidIn(List<String> values) {
            addCriterion("materialID in", values, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotIn(List<String> values) {
            addCriterion("materialID not in", values, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidBetween(String value1, String value2) {
            addCriterion("materialID between", value1, value2, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotBetween(String value1, String value2) {
            addCriterion("materialID not between", value1, value2, "materialid");
            return (Criteria) this;
        }

        public Criteria andCompanyfidIsNull() {
            addCriterion("companyfid is null");
            return (Criteria) this;
        }

        public Criteria andCompanyfidIsNotNull() {
            addCriterion("companyfid is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyfidEqualTo(String value) {
            addCriterion("companyfid =", value, "companyfid");
            return (Criteria) this;
        }

        public Criteria andCompanyfidNotEqualTo(String value) {
            addCriterion("companyfid <>", value, "companyfid");
            return (Criteria) this;
        }

        public Criteria andCompanyfidGreaterThan(String value) {
            addCriterion("companyfid >", value, "companyfid");
            return (Criteria) this;
        }

        public Criteria andCompanyfidGreaterThanOrEqualTo(String value) {
            addCriterion("companyfid >=", value, "companyfid");
            return (Criteria) this;
        }

        public Criteria andCompanyfidLessThan(String value) {
            addCriterion("companyfid <", value, "companyfid");
            return (Criteria) this;
        }

        public Criteria andCompanyfidLessThanOrEqualTo(String value) {
            addCriterion("companyfid <=", value, "companyfid");
            return (Criteria) this;
        }

        public Criteria andCompanyfidLike(String value) {
            addCriterion("companyfid like", value, "companyfid");
            return (Criteria) this;
        }

        public Criteria andCompanyfidNotLike(String value) {
            addCriterion("companyfid not like", value, "companyfid");
            return (Criteria) this;
        }

        public Criteria andCompanyfidIn(List<String> values) {
            addCriterion("companyfid in", values, "companyfid");
            return (Criteria) this;
        }

        public Criteria andCompanyfidNotIn(List<String> values) {
            addCriterion("companyfid not in", values, "companyfid");
            return (Criteria) this;
        }

        public Criteria andCompanyfidBetween(String value1, String value2) {
            addCriterion("companyfid between", value1, value2, "companyfid");
            return (Criteria) this;
        }

        public Criteria andCompanyfidNotBetween(String value1, String value2) {
            addCriterion("companyfid not between", value1, value2, "companyfid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table btc_ware_store
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
     * This class corresponds to the database table btc_ware_store
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