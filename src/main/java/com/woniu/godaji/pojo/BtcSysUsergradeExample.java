package com.woniu.godaji.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BtcSysUsergradeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BTC_sys_userGrade
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BTC_sys_userGrade
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BTC_sys_userGrade
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_userGrade
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public BtcSysUsergradeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_userGrade
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_userGrade
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_userGrade
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_userGrade
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_userGrade
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_userGrade
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_userGrade
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
     * This method corresponds to the database table BTC_sys_userGrade
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
     * This method corresponds to the database table BTC_sys_userGrade
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_userGrade
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
     * This class corresponds to the database table BTC_sys_userGrade
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

        public Criteria andUsergradeidIsNull() {
            addCriterion("userGradeID is null");
            return (Criteria) this;
        }

        public Criteria andUsergradeidIsNotNull() {
            addCriterion("userGradeID is not null");
            return (Criteria) this;
        }

        public Criteria andUsergradeidEqualTo(Integer value) {
            addCriterion("userGradeID =", value, "usergradeid");
            return (Criteria) this;
        }

        public Criteria andUsergradeidNotEqualTo(Integer value) {
            addCriterion("userGradeID <>", value, "usergradeid");
            return (Criteria) this;
        }

        public Criteria andUsergradeidGreaterThan(Integer value) {
            addCriterion("userGradeID >", value, "usergradeid");
            return (Criteria) this;
        }

        public Criteria andUsergradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("userGradeID >=", value, "usergradeid");
            return (Criteria) this;
        }

        public Criteria andUsergradeidLessThan(Integer value) {
            addCriterion("userGradeID <", value, "usergradeid");
            return (Criteria) this;
        }

        public Criteria andUsergradeidLessThanOrEqualTo(Integer value) {
            addCriterion("userGradeID <=", value, "usergradeid");
            return (Criteria) this;
        }

        public Criteria andUsergradeidIn(List<Integer> values) {
            addCriterion("userGradeID in", values, "usergradeid");
            return (Criteria) this;
        }

        public Criteria andUsergradeidNotIn(List<Integer> values) {
            addCriterion("userGradeID not in", values, "usergradeid");
            return (Criteria) this;
        }

        public Criteria andUsergradeidBetween(Integer value1, Integer value2) {
            addCriterion("userGradeID between", value1, value2, "usergradeid");
            return (Criteria) this;
        }

        public Criteria andUsergradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("userGradeID not between", value1, value2, "usergradeid");
            return (Criteria) this;
        }

        public Criteria andUsergradenameIsNull() {
            addCriterion("userGradeName is null");
            return (Criteria) this;
        }

        public Criteria andUsergradenameIsNotNull() {
            addCriterion("userGradeName is not null");
            return (Criteria) this;
        }

        public Criteria andUsergradenameEqualTo(String value) {
            addCriterion("userGradeName =", value, "usergradename");
            return (Criteria) this;
        }

        public Criteria andUsergradenameNotEqualTo(String value) {
            addCriterion("userGradeName <>", value, "usergradename");
            return (Criteria) this;
        }

        public Criteria andUsergradenameGreaterThan(String value) {
            addCriterion("userGradeName >", value, "usergradename");
            return (Criteria) this;
        }

        public Criteria andUsergradenameGreaterThanOrEqualTo(String value) {
            addCriterion("userGradeName >=", value, "usergradename");
            return (Criteria) this;
        }

        public Criteria andUsergradenameLessThan(String value) {
            addCriterion("userGradeName <", value, "usergradename");
            return (Criteria) this;
        }

        public Criteria andUsergradenameLessThanOrEqualTo(String value) {
            addCriterion("userGradeName <=", value, "usergradename");
            return (Criteria) this;
        }

        public Criteria andUsergradenameLike(String value) {
            addCriterion("userGradeName like", value, "usergradename");
            return (Criteria) this;
        }

        public Criteria andUsergradenameNotLike(String value) {
            addCriterion("userGradeName not like", value, "usergradename");
            return (Criteria) this;
        }

        public Criteria andUsergradenameIn(List<String> values) {
            addCriterion("userGradeName in", values, "usergradename");
            return (Criteria) this;
        }

        public Criteria andUsergradenameNotIn(List<String> values) {
            addCriterion("userGradeName not in", values, "usergradename");
            return (Criteria) this;
        }

        public Criteria andUsergradenameBetween(String value1, String value2) {
            addCriterion("userGradeName between", value1, value2, "usergradename");
            return (Criteria) this;
        }

        public Criteria andUsergradenameNotBetween(String value1, String value2) {
            addCriterion("userGradeName not between", value1, value2, "usergradename");
            return (Criteria) this;
        }

        public Criteria andUsergradescoreIsNull() {
            addCriterion("userGradeScore is null");
            return (Criteria) this;
        }

        public Criteria andUsergradescoreIsNotNull() {
            addCriterion("userGradeScore is not null");
            return (Criteria) this;
        }

        public Criteria andUsergradescoreEqualTo(Integer value) {
            addCriterion("userGradeScore =", value, "usergradescore");
            return (Criteria) this;
        }

        public Criteria andUsergradescoreNotEqualTo(Integer value) {
            addCriterion("userGradeScore <>", value, "usergradescore");
            return (Criteria) this;
        }

        public Criteria andUsergradescoreGreaterThan(Integer value) {
            addCriterion("userGradeScore >", value, "usergradescore");
            return (Criteria) this;
        }

        public Criteria andUsergradescoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("userGradeScore >=", value, "usergradescore");
            return (Criteria) this;
        }

        public Criteria andUsergradescoreLessThan(Integer value) {
            addCriterion("userGradeScore <", value, "usergradescore");
            return (Criteria) this;
        }

        public Criteria andUsergradescoreLessThanOrEqualTo(Integer value) {
            addCriterion("userGradeScore <=", value, "usergradescore");
            return (Criteria) this;
        }

        public Criteria andUsergradescoreIn(List<Integer> values) {
            addCriterion("userGradeScore in", values, "usergradescore");
            return (Criteria) this;
        }

        public Criteria andUsergradescoreNotIn(List<Integer> values) {
            addCriterion("userGradeScore not in", values, "usergradescore");
            return (Criteria) this;
        }

        public Criteria andUsergradescoreBetween(Integer value1, Integer value2) {
            addCriterion("userGradeScore between", value1, value2, "usergradescore");
            return (Criteria) this;
        }

        public Criteria andUsergradescoreNotBetween(Integer value1, Integer value2) {
            addCriterion("userGradeScore not between", value1, value2, "usergradescore");
            return (Criteria) this;
        }

        public Criteria andGradediscountIsNull() {
            addCriterion("gradeDiscount is null");
            return (Criteria) this;
        }

        public Criteria andGradediscountIsNotNull() {
            addCriterion("gradeDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andGradediscountEqualTo(BigDecimal value) {
            addCriterion("gradeDiscount =", value, "gradediscount");
            return (Criteria) this;
        }

        public Criteria andGradediscountNotEqualTo(BigDecimal value) {
            addCriterion("gradeDiscount <>", value, "gradediscount");
            return (Criteria) this;
        }

        public Criteria andGradediscountGreaterThan(BigDecimal value) {
            addCriterion("gradeDiscount >", value, "gradediscount");
            return (Criteria) this;
        }

        public Criteria andGradediscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gradeDiscount >=", value, "gradediscount");
            return (Criteria) this;
        }

        public Criteria andGradediscountLessThan(BigDecimal value) {
            addCriterion("gradeDiscount <", value, "gradediscount");
            return (Criteria) this;
        }

        public Criteria andGradediscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gradeDiscount <=", value, "gradediscount");
            return (Criteria) this;
        }

        public Criteria andGradediscountIn(List<BigDecimal> values) {
            addCriterion("gradeDiscount in", values, "gradediscount");
            return (Criteria) this;
        }

        public Criteria andGradediscountNotIn(List<BigDecimal> values) {
            addCriterion("gradeDiscount not in", values, "gradediscount");
            return (Criteria) this;
        }

        public Criteria andGradediscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gradeDiscount between", value1, value2, "gradediscount");
            return (Criteria) this;
        }

        public Criteria andGradediscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gradeDiscount not between", value1, value2, "gradediscount");
            return (Criteria) this;
        }

        public Criteria andUsergradeimgIsNull() {
            addCriterion("userGradeImg is null");
            return (Criteria) this;
        }

        public Criteria andUsergradeimgIsNotNull() {
            addCriterion("userGradeImg is not null");
            return (Criteria) this;
        }

        public Criteria andUsergradeimgEqualTo(String value) {
            addCriterion("userGradeImg =", value, "usergradeimg");
            return (Criteria) this;
        }

        public Criteria andUsergradeimgNotEqualTo(String value) {
            addCriterion("userGradeImg <>", value, "usergradeimg");
            return (Criteria) this;
        }

        public Criteria andUsergradeimgGreaterThan(String value) {
            addCriterion("userGradeImg >", value, "usergradeimg");
            return (Criteria) this;
        }

        public Criteria andUsergradeimgGreaterThanOrEqualTo(String value) {
            addCriterion("userGradeImg >=", value, "usergradeimg");
            return (Criteria) this;
        }

        public Criteria andUsergradeimgLessThan(String value) {
            addCriterion("userGradeImg <", value, "usergradeimg");
            return (Criteria) this;
        }

        public Criteria andUsergradeimgLessThanOrEqualTo(String value) {
            addCriterion("userGradeImg <=", value, "usergradeimg");
            return (Criteria) this;
        }

        public Criteria andUsergradeimgLike(String value) {
            addCriterion("userGradeImg like", value, "usergradeimg");
            return (Criteria) this;
        }

        public Criteria andUsergradeimgNotLike(String value) {
            addCriterion("userGradeImg not like", value, "usergradeimg");
            return (Criteria) this;
        }

        public Criteria andUsergradeimgIn(List<String> values) {
            addCriterion("userGradeImg in", values, "usergradeimg");
            return (Criteria) this;
        }

        public Criteria andUsergradeimgNotIn(List<String> values) {
            addCriterion("userGradeImg not in", values, "usergradeimg");
            return (Criteria) this;
        }

        public Criteria andUsergradeimgBetween(String value1, String value2) {
            addCriterion("userGradeImg between", value1, value2, "usergradeimg");
            return (Criteria) this;
        }

        public Criteria andUsergradeimgNotBetween(String value1, String value2) {
            addCriterion("userGradeImg not between", value1, value2, "usergradeimg");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BTC_sys_userGrade
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
     * This class corresponds to the database table BTC_sys_userGrade
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