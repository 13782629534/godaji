package com.woniu.godaji.mapper;

import com.woniu.godaji.pojo.BtcDlfcsout;
import com.woniu.godaji.pojo.BtcDlfcsoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BtcDlfcsoutMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_DLFCSOUT
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int countByExample(BtcDlfcsoutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_DLFCSOUT
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByExample(BtcDlfcsoutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_DLFCSOUT
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByPrimaryKey(String clientid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_DLFCSOUT
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insert(BtcDlfcsout record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_DLFCSOUT
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insertSelective(BtcDlfcsout record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_DLFCSOUT
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    List<BtcDlfcsout> selectByExample(BtcDlfcsoutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_DLFCSOUT
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    BtcDlfcsout selectByPrimaryKey(String clientid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_DLFCSOUT
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExampleSelective(@Param("record") BtcDlfcsout record, @Param("example") BtcDlfcsoutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_DLFCSOUT
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExample(@Param("record") BtcDlfcsout record, @Param("example") BtcDlfcsoutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_DLFCSOUT
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKeySelective(BtcDlfcsout record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_DLFCSOUT
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKey(BtcDlfcsout record);
}