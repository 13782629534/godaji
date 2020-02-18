package com.woniu.godaji.service.impl;

import com.woniu.godaji.dao.BTC_sys_wareSpecDao;
import com.woniu.godaji.pojo.BtcSysWarespec;
import com.woniu.godaji.service.IBTC_sys_wareSpec;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BTC_sys_wareSpecImpl implements IBTC_sys_wareSpec {

    @Resource
    private BTC_sys_wareSpecDao btc_sys_wareSpecDao;

    @Override
    public BtcSysWarespec selectBtcSysWarespec() {
        return btc_sys_wareSpecDao.selectBtcSysWarespec();
    }
}
