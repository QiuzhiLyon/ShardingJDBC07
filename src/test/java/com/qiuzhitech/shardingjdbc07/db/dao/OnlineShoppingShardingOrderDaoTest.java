package com.qiuzhitech.shardingjdbc07.db.dao;

import com.qiuzhitech.shardingjdbc07.db.po.OnlineShoppingShardingOrder;
import com.qiuzhitech.shardingjdbc07.util.SnowFlakeIdWorker;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
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
        Long orderId = 101L;
        OnlineShoppingShardingOrder onlineShoppingShardingOrder1 = onlineShoppingOrderDao.queryOrder(123L,orderId);
        OnlineShoppingShardingOrder onlineShoppingShardingOrder2 = onlineShoppingOrderDao.queryOrder(123L,orderId + 1);
        log.info(onlineShoppingShardingOrder1.toString());
        log.info(onlineShoppingShardingOrder2.toString());
    }

    @Test
    void insertOrderSnowFlake() {
        SnowFlakeIdWorker worker = new SnowFlakeIdWorker(1,1);
        List<OnlineShoppingShardingOrder> orders = new ArrayList<>();
        for (int i=0;i<100;i++) {
            long orderId = worker.nextId();
            log.info(String.valueOf(orderId));
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
            orders.add(order);
        }
        for (OnlineShoppingShardingOrder order: orders) {
            onlineShoppingOrderDao.insertOrder(order);
        }
    }
}