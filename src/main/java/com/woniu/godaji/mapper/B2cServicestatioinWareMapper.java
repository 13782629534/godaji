package com.woniu.godaji.mapper;

import com.woniu.godaji.pojo.B2cServicestatioinWare;
import com.woniu.godaji.pojo.B2cServicestatioinWareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B2cServicestatioinWareMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B2C_serviceStatioin_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int countByExample(B2cServicestatioinWareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B2C_serviceStatioin_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByExample(B2cServicestatioinWareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B2C_serviceStatioin_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByPrimaryKey(Integer warepriceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B2C_serviceStatioin_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insert(B2cServicestatioinWare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B2C_serviceStatioin_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insertSelective(B2cServicestatioinWare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B2C_serviceStatioin_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    List<B2cServicestatioinWare> selectByExample(B2cServicestatioinWareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B2C_serviceStatioin_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    B2cServicestatioinWare selectByPrimaryKey(Integer warepriceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B2C_serviceStatioin_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExampleSelective(@Param("record") B2cServicestatioinWare record, @Param("example") B2cServicestatioinWareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B2C_serviceStatioin_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExample(@Param("record") B2cServicestatioinWare record, @Param("example") B2cServicestatioinWareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B2C_serviceStatioin_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKeySelective(B2cServicestatioinWare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B2C_serviceStatioin_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKey(B2cServicestatioinWare record);
}