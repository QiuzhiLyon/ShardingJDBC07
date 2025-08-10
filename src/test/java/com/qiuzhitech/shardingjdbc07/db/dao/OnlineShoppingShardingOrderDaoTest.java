package com.qiuzhitech.shardingjdbc07.db.dao;

import com.qiuzhitech.shardingjdbc07.db.po.OnlineShoppingShardingOrder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OnlineShoppingShardingOrderDaoTest {
    @Resource
    OnlineShoppingShardingOrderDao onlineShoppingOrderDao;

    @Test
    void insertOrder() {
        for (int i = 0; i < 10; i++) {
            long orderId = i + 100L;
            OnlineShoppingShardingOrder order = OnlineShoppingShardingOrder.builder()
                    .orderStatus(0)
                    .orderNo("123")
                    .orderId(orderId)
                    .orderAmount(123L)
                    .commodityId(123L)
                    .createTime(new Date())
                    .payTime(new Date())
                    .userId(123L)     // userId  123
                    .orderStatus(0)
                    .build();
            onlineShoppingOrderDao.insertOrder(order);
        }

    }

    @Test
    void queryOrder() {
    }
}