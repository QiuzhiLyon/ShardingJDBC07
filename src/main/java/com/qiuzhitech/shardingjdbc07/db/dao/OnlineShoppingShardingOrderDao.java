package com.qiuzhitech.shardingjdbc07.db.dao;

import com.qiuzhitech.shardingjdbc07.db.po.OnlineShoppingShardingOrder;

public interface OnlineShoppingShardingOrderDao {
    int insertOrder(OnlineShoppingShardingOrder order);
    OnlineShoppingShardingOrder queryOrder(Long userId, Long orderId);
}