package com.woniu.godaji.mapper;

import com.woniu.godaji.pojo.BtcSysWareactivitytype;
import com.woniu.godaji.pojo.BtcSysWareactivitytypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BtcSysWareactivitytypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivityType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int countByExample(BtcSysWareactivitytypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivityType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByExample(BtcSysWareactivitytypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivityType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByPrimaryKey(Integer wareactivitytypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivityType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insert(BtcSysWareactivitytype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivityType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insertSelective(BtcSysWareactivitytype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivityType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    List<BtcSysWareactivitytype> selectByExample(BtcSysWareactivitytypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivityType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    BtcSysWareactivitytype selectByPrimaryKey(Integer wareactivitytypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivityType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExampleSelective(@Param("record") BtcSysWareactivitytype record, @Param("example") BtcSysWareactivitytypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivityType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExample(@Param("record") BtcSysWareactivitytype record, @Param("example") BtcSysWareactivitytypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivityType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKeySelective(BtcSysWareactivitytype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivityType
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKey(BtcSysWareactivitytype record);
}