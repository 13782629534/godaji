package com.woniu.godaji.pojo;

import java.util.ArrayList;
import java.util.List;

public class BtcMarketWareclassificationtypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BTC_market_wareClassificationType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BTC_market_wareClassificationType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BTC_market_wareClassificationType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_market_wareClassificationType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public BtcMarketWareclassificationtypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_market_wareClassificationType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_market_wareClassificationType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_market_wareClassificationType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_market_wareClassificationType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_market_wareClassificationType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_market_wareClassificationType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_market_wareClassificationType
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
     * This method corresponds to the database table BTC_market_wareClassificationType
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
     * This method corresponds to the database table BTC_market_wareClassificationType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_market_wareClassificationType
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
     * This class corresponds to the database table BTC_market_wareClassificationType
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

        public Criteria andWareclassificationtypecodeIsNull() {
            addCriterion("wareClassificationTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypecodeIsNotNull() {
            addCriterion("wareClassificationTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypecodeEqualTo(String value) {
            addCriterion("wareClassificationTypeCode =", value, "wareclassificationtypecode");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypecodeNotEqualTo(String value) {
            addCriterion("wareClassificationTypeCode <>", value, "wareclassificationtypecode");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypecodeGreaterThan(String value) {
            addCriterion("wareClassificationTypeCode >", value, "wareclassificationtypecode");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("wareClassificationTypeCode >=", value, "wareclassificationtypecode");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypecodeLessThan(String value) {
            addCriterion("wareClassificationTypeCode <", value, "wareclassificationtypecode");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypecodeLessThanOrEqualTo(String value) {
            addCriterion("wareClassificationTypeCode <=", value, "wareclassificationtypecode");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypecodeLike(String value) {
            addCriterion("wareClassificationTypeCode like", value, "wareclassificationtypecode");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypecodeNotLike(String value) {
            addCriterion("wareClassificationTypeCode not like", value, "wareclassificationtypecode");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypecodeIn(List<String> values) {
            addCriterion("wareClassificationTypeCode in", values, "wareclassificationtypecode");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypecodeNotIn(List<String> values) {
            addCriterion("wareClassificationTypeCode not in", values, "wareclassificationtypecode");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypecodeBetween(String value1, String value2) {
            addCriterion("wareClassificationTypeCode between", value1, value2, "wareclassificationtypecode");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypecodeNotBetween(String value1, String value2) {
            addCriterion("wareClassificationTypeCode not between", value1, value2, "wareclassificationtypecode");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypenameIsNull() {
            addCriterion("wareClassificationTypeName is null");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypenameIsNotNull() {
            addCriterion("wareClassificationTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypenameEqualTo(String value) {
            addCriterion("wareClassificationTypeName =", value, "wareclassificationtypename");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypenameNotEqualTo(String value) {
            addCriterion("wareClassificationTypeName <>", value, "wareclassificationtypename");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypenameGreaterThan(String value) {
            addCriterion("wareClassificationTypeName >", value, "wareclassificationtypename");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("wareClassificationTypeName >=", value, "wareclassificationtypename");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypenameLessThan(String value) {
            addCriterion("wareClassificationTypeName <", value, "wareclassificationtypename");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypenameLessThanOrEqualTo(String value) {
            addCriterion("wareClassificationTypeName <=", value, "wareclassificationtypename");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypenameLike(String value) {
            addCriterion("wareClassificationTypeName like", value, "wareclassificationtypename");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypenameNotLike(String value) {
            addCriterion("wareClassificationTypeName not like", value, "wareclassificationtypename");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypenameIn(List<String> values) {
            addCriterion("wareClassificationTypeName in", values, "wareclassificationtypename");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypenameNotIn(List<String> values) {
            addCriterion("wareClassificationTypeName not in", values, "wareclassificationtypename");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypenameBetween(String value1, String value2) {
            addCriterion("wareClassificationTypeName between", value1, value2, "wareclassificationtypename");
            return (Criteria) this;
        }

        public Criteria andWareclassificationtypenameNotBetween(String value1, String value2) {
            addCriterion("wareClassificationTypeName not between", value1, value2, "wareclassificationtypename");
            return (Criteria) this;
        }

        public Criteria andParentwareclassificationtypeidIsNull() {
            addCriterion("parentWareClassificationTypeID is null");
            return (Criteria) this;
        }

        public Criteria andParentwareclassificationtypeidIsNotNull() {
            addCriterion("parentWareClassificationTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andParentwareclassificationtypeidEqualTo(Integer value) {
            addCriterion("parentWareClassificationTypeID =", value, "parentwareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andParentwareclassificationtypeidNotEqualTo(Integer value) {
            addCriterion("parentWareClassificationTypeID <>", value, "parentwareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andParentwareclassificationtypeidGreaterThan(Integer value) {
            addCriterion("parentWareClassificationTypeID >", value, "parentwareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andParentwareclassificationtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentWareClassificationTypeID >=", value, "parentwareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andParentwareclassificationtypeidLessThan(Integer value) {
            addCriterion("parentWareClassificationTypeID <", value, "parentwareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andParentwareclassificationtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("parentWareClassificationTypeID <=", value, "parentwareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andParentwareclassificationtypeidIn(List<Integer> values) {
            addCriterion("parentWareClassificationTypeID in", values, "parentwareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andParentwareclassificationtypeidNotIn(List<Integer> values) {
            addCriterion("parentWareClassificationTypeID not in", values, "parentwareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andParentwareclassificationtypeidBetween(Integer value1, Integer value2) {
            addCriterion("parentWareClassificationTypeID between", value1, value2, "parentwareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andParentwareclassificationtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentWareClassificationTypeID not between", value1, value2, "parentwareclassificationtypeid");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isDelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIscurrentIsNull() {
            addCriterion("isCurrent is null");
            return (Criteria) this;
        }

        public Criteria andIscurrentIsNotNull() {
            addCriterion("isCurrent is not null");
            return (Criteria) this;
        }

        public Criteria andIscurrentEqualTo(Integer value) {
            addCriterion("isCurrent =", value, "iscurrent");
            return (Criteria) this;
        }

        public Criteria andIscurrentNotEqualTo(Integer value) {
            addCriterion("isCurrent <>", value, "iscurrent");
            return (Criteria) this;
        }

        public Criteria andIscurrentGreaterThan(Integer value) {
            addCriterion("isCurrent >", value, "iscurrent");
            return (Criteria) this;
        }

        public Criteria andIscurrentGreaterThanOrEqualTo(Integer value) {
            addCriterion("isCurrent >=", value, "iscurrent");
            return (Criteria) this;
        }

        public Criteria andIscurrentLessThan(Integer value) {
            addCriterion("isCurrent <", value, "iscurrent");
            return (Criteria) this;
        }

        public Criteria andIscurrentLessThanOrEqualTo(Integer value) {
            addCriterion("isCurrent <=", value, "iscurrent");
            return (Criteria) this;
        }

        public Criteria andIscurrentIn(List<Integer> values) {
            addCriterion("isCurrent in", values, "iscurrent");
            return (Criteria) this;
        }

        public Criteria andIscurrentNotIn(List<Integer> values) {
            addCriterion("isCurrent not in", values, "iscurrent");
            return (Criteria) this;
        }

        public Criteria andIscurrentBetween(Integer value1, Integer value2) {
            addCriterion("isCurrent between", value1, value2, "iscurrent");
            return (Criteria) this;
        }

        public Criteria andIscurrentNotBetween(Integer value1, Integer value2) {
            addCriterion("isCurrent not between", value1, value2, "iscurrent");
            return (Criteria) this;
        }

        public Criteria andSortnumIsNull() {
            addCriterion("sortNum is null");
            return (Criteria) this;
        }

        public Criteria andSortnumIsNotNull() {
            addCriterion("sortNum is not null");
            return (Criteria) this;
        }

        public Criteria andSortnumEqualTo(Integer value) {
            addCriterion("sortNum =", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumNotEqualTo(Integer value) {
            addCriterion("sortNum <>", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumGreaterThan(Integer value) {
            addCriterion("sortNum >", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sortNum >=", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumLessThan(Integer value) {
            addCriterion("sortNum <", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumLessThanOrEqualTo(Integer value) {
            addCriterion("sortNum <=", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumIn(List<Integer> values) {
            addCriterion("sortNum in", values, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumNotIn(List<Integer> values) {
            addCriterion("sortNum not in", values, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumBetween(Integer value1, Integer value2) {
            addCriterion("sortNum between", value1, value2, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumNotBetween(Integer value1, Integer value2) {
            addCriterion("sortNum not between", value1, value2, "sortnum");
            return (Criteria) this;
        }

        public Criteria andThenoteIsNull() {
            addCriterion("theNote is null");
            return (Criteria) this;
        }

        public Criteria andThenoteIsNotNull() {
            addCriterion("theNote is not null");
            return (Criteria) this;
        }

        public Criteria andThenoteEqualTo(String value) {
            addCriterion("theNote =", value, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteNotEqualTo(String value) {
            addCriterion("theNote <>", value, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteGreaterThan(String value) {
            addCriterion("theNote >", value, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteGreaterThanOrEqualTo(String value) {
            addCriterion("theNote >=", value, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteLessThan(String value) {
            addCriterion("theNote <", value, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteLessThanOrEqualTo(String value) {
            addCriterion("theNote <=", value, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteLike(String value) {
            addCriterion("theNote like", value, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteNotLike(String value) {
            addCriterion("theNote not like", value, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteIn(List<String> values) {
            addCriterion("theNote in", values, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteNotIn(List<String> values) {
            addCriterion("theNote not in", values, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteBetween(String value1, String value2) {
            addCriterion("theNote between", value1, value2, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteNotBetween(String value1, String value2) {
            addCriterion("theNote not between", value1, value2, "thenote");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(String value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(String value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(String value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(String value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(String value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(String value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLike(String value) {
            addCriterion("fid like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotLike(String value) {
            addCriterion("fid not like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<String> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<String> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(String value1, String value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(String value1, String value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFparentidIsNull() {
            addCriterion("fparentid is null");
            return (Criteria) this;
        }

        public Criteria andFparentidIsNotNull() {
            addCriterion("fparentid is not null");
            return (Criteria) this;
        }

        public Criteria andFparentidEqualTo(String value) {
            addCriterion("fparentid =", value, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidNotEqualTo(String value) {
            addCriterion("fparentid <>", value, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidGreaterThan(String value) {
            addCriterion("fparentid >", value, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidGreaterThanOrEqualTo(String value) {
            addCriterion("fparentid >=", value, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidLessThan(String value) {
            addCriterion("fparentid <", value, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidLessThanOrEqualTo(String value) {
            addCriterion("fparentid <=", value, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidLike(String value) {
            addCriterion("fparentid like", value, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidNotLike(String value) {
            addCriterion("fparentid not like", value, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidIn(List<String> values) {
            addCriterion("fparentid in", values, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidNotIn(List<String> values) {
            addCriterion("fparentid not in", values, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidBetween(String value1, String value2) {
            addCriterion("fparentid between", value1, value2, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidNotBetween(String value1, String value2) {
            addCriterion("fparentid not between", value1, value2, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BTC_market_wareClassificationType
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
     * This class corresponds to the database table BTC_market_wareClassificationType
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