package com.wez.user.svc.impl;

import com.wez.api.order.svc.OrderService;
import com.wez.api.order.svc.vo.OrderVO;
import com.wez.user.svc.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户接口实现
 * @Author wez
 * @Time 2021/3/6 16:25
 */
@Service
public class UserServiceImpl implements UserService {

    @DubboReference
    private OrderService orderService;

    /**
     * 查询用户订单
     * @param userId 用户ID
     * @return
     */
    @Override
    public List<OrderVO> listOrder(String userId) {
        System.out.println("查询"+userId+"订单开始。。。");

        System.out.println(userId+"订单：");
        List<OrderVO> orders = orderService.listUserOrder(userId);
        orders.forEach(order -> System.out.println(order));

        System.out.println("查询结束。");
        return orders;
    }

}
