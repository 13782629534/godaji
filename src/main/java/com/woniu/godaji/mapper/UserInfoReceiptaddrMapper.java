package com.woniu.godaji.mapper;

import com.woniu.godaji.pojo.UserInfoReceiptaddr;
import com.woniu.godaji.pojo.UserInfoReceiptaddrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoReceiptaddrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_receiptAddr
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int countByExample(UserInfoReceiptaddrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_receiptAddr
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByExample(UserInfoReceiptaddrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_receiptAddr
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByPrimaryKey(Integer receiptaddrid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_receiptAddr
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insert(UserInfoReceiptaddr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_receiptAddr
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insertSelective(UserInfoReceiptaddr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_receiptAddr
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    List<UserInfoReceiptaddr> selectByExample(UserInfoReceiptaddrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_receiptAddr
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    UserInfoReceiptaddr selectByPrimaryKey(Integer receiptaddrid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_receiptAddr
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExampleSelective(@Param("record") UserInfoReceiptaddr record, @Param("example") UserInfoReceiptaddrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_receiptAddr
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExample(@Param("record") UserInfoReceiptaddr record, @Param("example") UserInfoReceiptaddrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_receiptAddr
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKeySelective(UserInfoReceiptaddr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_receiptAddr
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKey(UserInfoReceiptaddr record);
}