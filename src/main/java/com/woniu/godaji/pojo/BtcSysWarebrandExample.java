package com.woniu.godaji.pojo;

import java.util.ArrayList;
import java.util.List;

public class BtcSysWarebrandExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BTC_sys_wareBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BTC_sys_wareBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BTC_sys_wareBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public BtcSysWarebrandExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareBrand
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
     * This method corresponds to the database table BTC_sys_wareBrand
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
     * This method corresponds to the database table BTC_sys_wareBrand
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareBrand
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
     * This class corresponds to the database table BTC_sys_wareBrand
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

        public Criteria andWarebrandcodeIsNull() {
            addCriterion("wareBrandCode is null");
            return (Criteria) this;
        }

        public Criteria andWarebrandcodeIsNotNull() {
            addCriterion("wareBrandCode is not null");
            return (Criteria) this;
        }

        public Criteria andWarebrandcodeEqualTo(String value) {
            addCriterion("wareBrandCode =", value, "warebrandcode");
            return (Criteria) this;
        }

        public Criteria andWarebrandcodeNotEqualTo(String value) {
            addCriterion("wareBrandCode <>", value, "warebrandcode");
            return (Criteria) this;
        }

        public Criteria andWarebrandcodeGreaterThan(String value) {
            addCriterion("wareBrandCode >", value, "warebrandcode");
            return (Criteria) this;
        }

        public Criteria andWarebrandcodeGreaterThanOrEqualTo(String value) {
            addCriterion("wareBrandCode >=", value, "warebrandcode");
            return (Criteria) this;
        }

        public Criteria andWarebrandcodeLessThan(String value) {
            addCriterion("wareBrandCode <", value, "warebrandcode");
            return (Criteria) this;
        }

        public Criteria andWarebrandcodeLessThanOrEqualTo(String value) {
            addCriterion("wareBrandCode <=", value, "warebrandcode");
            return (Criteria) this;
        }

        public Criteria andWarebrandcodeLike(String value) {
            addCriterion("wareBrandCode like", value, "warebrandcode");
            return (Criteria) this;
        }

        public Criteria andWarebrandcodeNotLike(String value) {
            addCriterion("wareBrandCode not like", value, "warebrandcode");
            return (Criteria) this;
        }

        public Criteria andWarebrandcodeIn(List<String> values) {
            addCriterion("wareBrandCode in", values, "warebrandcode");
            return (Criteria) this;
        }

        public Criteria andWarebrandcodeNotIn(List<String> values) {
            addCriterion("wareBrandCode not in", values, "warebrandcode");
            return (Criteria) this;
        }

        public Criteria andWarebrandcodeBetween(String value1, String value2) {
            addCriterion("wareBrandCode between", value1, value2, "warebrandcode");
            return (Criteria) this;
        }

        public Criteria andWarebrandcodeNotBetween(String value1, String value2) {
            addCriterion("wareBrandCode not between", value1, value2, "warebrandcode");
            return (Criteria) this;
        }

        public Criteria andWarebrandzhnameIsNull() {
            addCriterion("wareBrandZHName is null");
            return (Criteria) this;
        }

        public Criteria andWarebrandzhnameIsNotNull() {
            addCriterion("wareBrandZHName is not null");
            return (Criteria) this;
        }

        public Criteria andWarebrandzhnameEqualTo(String value) {
            addCriterion("wareBrandZHName =", value, "warebrandzhname");
            return (Criteria) this;
        }

        public Criteria andWarebrandzhnameNotEqualTo(String value) {
            addCriterion("wareBrandZHName <>", value, "warebrandzhname");
            return (Criteria) this;
        }

        public Criteria andWarebrandzhnameGreaterThan(String value) {
            addCriterion("wareBrandZHName >", value, "warebrandzhname");
            return (Criteria) this;
        }

        public Criteria andWarebrandzhnameGreaterThanOrEqualTo(String value) {
            addCriterion("wareBrandZHName >=", value, "warebrandzhname");
            return (Criteria) this;
        }

        public Criteria andWarebrandzhnameLessThan(String value) {
            addCriterion("wareBrandZHName <", value, "warebrandzhname");
            return (Criteria) this;
        }

        public Criteria andWarebrandzhnameLessThanOrEqualTo(String value) {
            addCriterion("wareBrandZHName <=", value, "warebrandzhname");
            return (Criteria) this;
        }

        public Criteria andWarebrandzhnameLike(String value) {
            addCriterion("wareBrandZHName like", value, "warebrandzhname");
            return (Criteria) this;
        }

        public Criteria andWarebrandzhnameNotLike(String value) {
            addCriterion("wareBrandZHName not like", value, "warebrandzhname");
            return (Criteria) this;
        }

        public Criteria andWarebrandzhnameIn(List<String> values) {
            addCriterion("wareBrandZHName in", values, "warebrandzhname");
            return (Criteria) this;
        }

        public Criteria andWarebrandzhnameNotIn(List<String> values) {
            addCriterion("wareBrandZHName not in", values, "warebrandzhname");
            return (Criteria) this;
        }

        public Criteria andWarebrandzhnameBetween(String value1, String value2) {
            addCriterion("wareBrandZHName between", value1, value2, "warebrandzhname");
            return (Criteria) this;
        }

        public Criteria andWarebrandzhnameNotBetween(String value1, String value2) {
            addCriterion("wareBrandZHName not between", value1, value2, "warebrandzhname");
            return (Criteria) this;
        }

        public Criteria andWarebrandennameIsNull() {
            addCriterion("wareBrandENName is null");
            return (Criteria) this;
        }

        public Criteria andWarebrandennameIsNotNull() {
            addCriterion("wareBrandENName is not null");
            return (Criteria) this;
        }

        public Criteria andWarebrandennameEqualTo(String value) {
            addCriterion("wareBrandENName =", value, "warebrandenname");
            return (Criteria) this;
        }

        public Criteria andWarebrandennameNotEqualTo(String value) {
            addCriterion("wareBrandENName <>", value, "warebrandenname");
            return (Criteria) this;
        }

        public Criteria andWarebrandennameGreaterThan(String value) {
            addCriterion("wareBrandENName >", value, "warebrandenname");
            return (Criteria) this;
        }

        public Criteria andWarebrandennameGreaterThanOrEqualTo(String value) {
            addCriterion("wareBrandENName >=", value, "warebrandenname");
            return (Criteria) this;
        }

        public Criteria andWarebrandennameLessThan(String value) {
            addCriterion("wareBrandENName <", value, "warebrandenname");
            return (Criteria) this;
        }

        public Criteria andWarebrandennameLessThanOrEqualTo(String value) {
            addCriterion("wareBrandENName <=", value, "warebrandenname");
            return (Criteria) this;
        }

        public Criteria andWarebrandennameLike(String value) {
            addCriterion("wareBrandENName like", value, "warebrandenname");
            return (Criteria) this;
        }

        public Criteria andWarebrandennameNotLike(String value) {
            addCriterion("wareBrandENName not like", value, "warebrandenname");
            return (Criteria) this;
        }

        public Criteria andWarebrandennameIn(List<String> values) {
            addCriterion("wareBrandENName in", values, "warebrandenname");
            return (Criteria) this;
        }

        public Criteria andWarebrandennameNotIn(List<String> values) {
            addCriterion("wareBrandENName not in", values, "warebrandenname");
            return (Criteria) this;
        }

        public Criteria andWarebrandennameBetween(String value1, String value2) {
            addCriterion("wareBrandENName between", value1, value2, "warebrandenname");
            return (Criteria) this;
        }

        public Criteria andWarebrandennameNotBetween(String value1, String value2) {
            addCriterion("wareBrandENName not between", value1, value2, "warebrandenname");
            return (Criteria) this;
        }

        public Criteria andWarebrandwebaddIsNull() {
            addCriterion("wareBrandWebAdd is null");
            return (Criteria) this;
        }

        public Criteria andWarebrandwebaddIsNotNull() {
            addCriterion("wareBrandWebAdd is not null");
            return (Criteria) this;
        }

        public Criteria andWarebrandwebaddEqualTo(String value) {
            addCriterion("wareBrandWebAdd =", value, "warebrandwebadd");
            return (Criteria) this;
        }

        public Criteria andWarebrandwebaddNotEqualTo(String value) {
            addCriterion("wareBrandWebAdd <>", value, "warebrandwebadd");
            return (Criteria) this;
        }

        public Criteria andWarebrandwebaddGreaterThan(String value) {
            addCriterion("wareBrandWebAdd >", value, "warebrandwebadd");
            return (Criteria) this;
        }

        public Criteria andWarebrandwebaddGreaterThanOrEqualTo(String value) {
            addCriterion("wareBrandWebAdd >=", value, "warebrandwebadd");
            return (Criteria) this;
        }

        public Criteria andWarebrandwebaddLessThan(String value) {
            addCriterion("wareBrandWebAdd <", value, "warebrandwebadd");
            return (Criteria) this;
        }

        public Criteria andWarebrandwebaddLessThanOrEqualTo(String value) {
            addCriterion("wareBrandWebAdd <=", value, "warebrandwebadd");
            return (Criteria) this;
        }

        public Criteria andWarebrandwebaddLike(String value) {
            addCriterion("wareBrandWebAdd like", value, "warebrandwebadd");
            return (Criteria) this;
        }

        public Criteria andWarebrandwebaddNotLike(String value) {
            addCriterion("wareBrandWebAdd not like", value, "warebrandwebadd");
            return (Criteria) this;
        }

        public Criteria andWarebrandwebaddIn(List<String> values) {
            addCriterion("wareBrandWebAdd in", values, "warebrandwebadd");
            return (Criteria) this;
        }

        public Criteria andWarebrandwebaddNotIn(List<String> values) {
            addCriterion("wareBrandWebAdd not in", values, "warebrandwebadd");
            return (Criteria) this;
        }

        public Criteria andWarebrandwebaddBetween(String value1, String value2) {
            addCriterion("wareBrandWebAdd between", value1, value2, "warebrandwebadd");
            return (Criteria) this;
        }

        public Criteria andWarebrandwebaddNotBetween(String value1, String value2) {
            addCriterion("wareBrandWebAdd not between", value1, value2, "warebrandwebadd");
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
     * This class corresponds to the database table BTC_sys_wareBrand
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
     * This class corresponds to the database table BTC_sys_wareBrand
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