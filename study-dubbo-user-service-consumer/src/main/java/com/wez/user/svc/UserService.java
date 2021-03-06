package com.wez.user.svc;

/**
 * 用户接口
 * @Author wez
 * @Time 2021/3/6 16:25
 */
public interface UserService {

    /**
     * 查询用户订单
     * @param userId 用户ID
     */
    void listOrder(String userId);

}
