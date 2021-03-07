package com.wez.api.order.svc.stub;

import com.wez.api.order.svc.OrderService;
import com.wez.api.order.svc.vo.OrderVO;

import java.util.ArrayList;
import java.util.List;

/**
 * OrderServiceStub - 本地存根
 * @Author wez
 * @Time 2021/3/7 16:30
 */
public class OrderServiceStub implements OrderService {

    private final OrderService orderService;

    // 构造函数传入真正的代理对象
    public OrderServiceStub(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public List<OrderVO> listUserOrder(String userId) {
        System.out.println("本地存根");

        // 消费者在调用真正的服务代理对象前，可先执行一些代码逻辑，例如参数校验等
        if (userId == null || userId.isEmpty()) {
            return new ArrayList<>();
        }

        return orderService.listUserOrder(userId);
    }
}
