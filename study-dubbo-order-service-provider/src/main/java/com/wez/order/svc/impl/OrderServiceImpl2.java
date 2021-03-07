package com.wez.order.svc.impl;

import com.wez.api.order.svc.OrderService;
import com.wez.api.order.svc.vo.OrderVO;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.ArrayList;
import java.util.List;

/**
 * 订单接口实现 - 测试Dubbo多版本
 * @Author wez
 * @Time 2021/3/6 16:19
 */
@DubboService(version = "2.0.0", stub = "com.wez.api.order.svc.stub.OrderServiceStub") // 暴露服务
public class OrderServiceImpl2 implements OrderService {

    /**
     * 查询用户订单
     * @param userId 用户ID
     * @return
     */
    @Override
    public List<OrderVO> listUserOrder(String userId) {
        System.out.println("OrderServiceImpl2 start...");

        List<OrderVO> orders = new ArrayList<>();
        orders.add(new OrderVO("1", userId, "2021-03-06 00:00:00"));
        orders.add(new OrderVO("2", userId, "2021-03-05 00:00:00"));

        // 测试请求超时
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return orders;
    }

}
