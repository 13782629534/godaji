package com.woniu.godaji.dao;

import com.woniu.godaji.mapper.B2cServicestatioinWareMapper;
import com.woniu.godaji.mapper.BtcSysWarespecMapper;
import com.woniu.godaji.pojo.B2cServicestatioinWare;
import com.woniu.godaji.pojo.BtcSysWarespec;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class BTC_sys_wareSpecDao {
    @Resource
    private BtcSysWarespecMapper btcSysWarespecMapper;
    @Resource
    private B2cServicestatioinWareMapper b2cServicestatioinWareMapper;
    public BtcSysWarespec selectBtcSysWarespec(){
        b2cServicestatioinWareMapper.selectAll();
        return btcSysWarespecMapper.selectByPrimaryKey(1001);

    }
}
