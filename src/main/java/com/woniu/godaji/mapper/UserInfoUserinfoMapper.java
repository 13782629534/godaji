package com.woniu.godaji.mapper;

import com.woniu.godaji.pojo.UserInfoUserinfo;
import com.woniu.godaji.pojo.UserInfoUserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoUserinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_userInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int countByExample(UserInfoUserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_userInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByExample(UserInfoUserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_userInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_userInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insert(UserInfoUserinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_userInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insertSelective(UserInfoUserinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_userInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    List<UserInfoUserinfo> selectByExample(UserInfoUserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_userInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    UserInfoUserinfo selectByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_userInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExampleSelective(@Param("record") UserInfoUserinfo record, @Param("example") UserInfoUserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_userInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExample(@Param("record") UserInfoUserinfo record, @Param("example") UserInfoUserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_userInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKeySelective(UserInfoUserinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_userInfo
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKey(UserInfoUserinfo record);
}