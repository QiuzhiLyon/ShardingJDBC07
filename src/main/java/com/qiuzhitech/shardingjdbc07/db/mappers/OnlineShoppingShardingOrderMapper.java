package com.qiuzhitech.shardingjdbc07.db.mappers;

import com.qiuzhitech.shardingjdbc07.db.po.OnlineShoppingShardingOrder;

public interface OnlineShoppingShardingOrderMapper {
    int insertOrder(OnlineShoppingShardingOrder record);
    OnlineShoppingShardingOrder queryOrder(Long orderId, Long userId);
}