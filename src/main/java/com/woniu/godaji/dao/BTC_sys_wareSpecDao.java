package com.woniu.godaji.dao;

import com.woniu.godaji.mapper.BtcSysWarespecMapper;
import com.woniu.godaji.pojo.BtcSysWarespec;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class BTC_sys_wareSpecDao {
    @Resource
    private BtcSysWarespecMapper btcSysWarespecMapper;
    public BtcSysWarespec selectBtcSysWarespec(){
        return btcSysWarespecMapper.selectByPrimaryKey(1001);
    }
}
