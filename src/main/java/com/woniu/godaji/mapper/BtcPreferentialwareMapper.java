package com.woniu.godaji.mapper;

import com.woniu.godaji.pojo.BtcPreferentialware;
import com.woniu.godaji.pojo.BtcPreferentialwareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BtcPreferentialwareMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_PreferentialWare
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int countByExample(BtcPreferentialwareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_PreferentialWare
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByExample(BtcPreferentialwareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_PreferentialWare
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByPrimaryKey(Integer btcPreferentialwareid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_PreferentialWare
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insert(BtcPreferentialware record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_PreferentialWare
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insertSelective(BtcPreferentialware record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_PreferentialWare
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    List<BtcPreferentialware> selectByExample(BtcPreferentialwareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_PreferentialWare
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    BtcPreferentialware selectByPrimaryKey(Integer btcPreferentialwareid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_PreferentialWare
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExampleSelective(@Param("record") BtcPreferentialware record, @Param("example") BtcPreferentialwareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_PreferentialWare
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExample(@Param("record") BtcPreferentialware record, @Param("example") BtcPreferentialwareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_PreferentialWare
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKeySelective(BtcPreferentialware record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_PreferentialWare
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKey(BtcPreferentialware record);
}