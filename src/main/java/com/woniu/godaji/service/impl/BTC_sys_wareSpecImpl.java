package com.woniu.godaji.service.impl;
import com.woniu.godaji.mapper.BtcSysWarespecMapper;
import com.woniu.godaji.pojo.BtcSysWarespec;
import com.woniu.godaji.service.IBTC_sys_wareSpec;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BTC_sys_wareSpecImpl implements IBTC_sys_wareSpec {

    @Resource
    private BtcSysWarespecMapper btcSysWarespecMapper;

    @Override
    public List<BtcSysWarespec> selectBtcSysWarespec() {
        return btcSysWarespecMapper.selectAll();
    }
}
