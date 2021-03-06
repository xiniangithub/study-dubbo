package com.wez.api.order.svc;

import com.wez.api.order.svc.vo.OrderVO;

import java.util.List;

/**
 * 订单接口
 * @Author wez
 * @Time 2021/3/6 16:04
 */
public interface OrderService {

    /**
     * 查询用户订单
     * @param userId 用户ID
     * @return
     */
    List<OrderVO> listUserOrder(String userId);

}
