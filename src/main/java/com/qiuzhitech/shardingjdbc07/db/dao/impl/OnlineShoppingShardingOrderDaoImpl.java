package com.qiuzhitech.shardingjdbc07.db.dao.impl;

import com.qiuzhitech.shardingjdbc07.db.dao.OnlineShoppingShardingOrderDao;
import com.qiuzhitech.shardingjdbc07.db.mappers.OnlineShoppingShardingOrderMapper;
import com.qiuzhitech.shardingjdbc07.db.po.OnlineShoppingShardingOrder;

import javax.annotation.Resource;

public class OnlineShoppingShardingOrderDaoImpl implements OnlineShoppingShardingOrderDao {
    @Resource
    OnlineShoppingShardingOrderMapper onlineShoppingOrderMapper;

    @Override
    public int insertOrder(OnlineShoppingShardingOrder order) {
        return onlineShoppingOrderMapper.insertOrder(order);
    }

    @Override
    public OnlineShoppingShardingOrder queryOrder(Long userId, Long orderId) {
        return onlineShoppingOrderMapper.queryOrder(orderId, userId);
    }
}
