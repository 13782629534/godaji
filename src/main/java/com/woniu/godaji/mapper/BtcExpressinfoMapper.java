package com.woniu.godaji.mapper;

import com.woniu.godaji.pojo.BtcExpressinfo;
import com.woniu.godaji.pojo.BtcExpressinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BtcExpressinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ExpressInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int countByExample(BtcExpressinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ExpressInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByExample(BtcExpressinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ExpressInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByPrimaryKey(Integer expressinfoid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ExpressInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insert(BtcExpressinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ExpressInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insertSelective(BtcExpressinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ExpressInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    List<BtcExpressinfo> selectByExample(BtcExpressinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ExpressInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    BtcExpressinfo selectByPrimaryKey(Integer expressinfoid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ExpressInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExampleSelective(@Param("record") BtcExpressinfo record, @Param("example") BtcExpressinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ExpressInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExample(@Param("record") BtcExpressinfo record, @Param("example") BtcExpressinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ExpressInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKeySelective(BtcExpressinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btc_ExpressInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKey(BtcExpressinfo record);
}