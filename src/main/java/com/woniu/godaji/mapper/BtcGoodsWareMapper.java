package com.woniu.godaji.mapper;

import com.woniu.godaji.pojo.BtcGoodsWare;
import com.woniu.godaji.pojo.BtcGoodsWareExample;
import com.woniu.godaji.pojo.BtcGoodsWareWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BtcGoodsWareMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_goods_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int countByExample(BtcGoodsWareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_goods_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByExample(BtcGoodsWareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_goods_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int deleteByPrimaryKey(Integer wareid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_goods_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insert(BtcGoodsWareWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_goods_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int insertSelective(BtcGoodsWareWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_goods_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    List<BtcGoodsWareWithBLOBs> selectByExampleWithBLOBs(BtcGoodsWareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_goods_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    List<BtcGoodsWare> selectByExample(BtcGoodsWareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_goods_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    BtcGoodsWareWithBLOBs selectByPrimaryKey(Integer wareid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_goods_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExampleSelective(@Param("record") BtcGoodsWareWithBLOBs record, @Param("example") BtcGoodsWareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_goods_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") BtcGoodsWareWithBLOBs record, @Param("example") BtcGoodsWareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_goods_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByExample(@Param("record") BtcGoodsWare record, @Param("example") BtcGoodsWareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_goods_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKeySelective(BtcGoodsWareWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_goods_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(BtcGoodsWareWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BTC_goods_ware
     *
     * @mbggenerated Tue Feb 18 00:31:41 CST 2020
     */
    int updateByPrimaryKey(BtcGoodsWare record);
}