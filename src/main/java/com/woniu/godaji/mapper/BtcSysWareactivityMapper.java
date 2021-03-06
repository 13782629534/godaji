package com.woniu.godaji.mapper;

import com.woniu.godaji.pojo.BtcSysWareactivity;
import com.woniu.godaji.pojo.BtcSysWareactivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BtcSysWareactivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivity
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int countByExample(BtcSysWareactivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivity
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByExample(BtcSysWareactivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivity
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByPrimaryKey(Integer wareactivityid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivity
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insert(BtcSysWareactivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivity
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insertSelective(BtcSysWareactivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivity
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    List<BtcSysWareactivity> selectByExampleWithBLOBs(BtcSysWareactivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivity
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    List<BtcSysWareactivity> selectByExample(BtcSysWareactivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivity
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    BtcSysWareactivity selectByPrimaryKey(Integer wareactivityid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivity
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExampleSelective(@Param("record") BtcSysWareactivity record, @Param("example") BtcSysWareactivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivity
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") BtcSysWareactivity record, @Param("example") BtcSysWareactivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivity
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExample(@Param("record") BtcSysWareactivity record, @Param("example") BtcSysWareactivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivity
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKeySelective(BtcSysWareactivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivity
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(BtcSysWareactivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_sys_wareActivity
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKey(BtcSysWareactivity record);
}