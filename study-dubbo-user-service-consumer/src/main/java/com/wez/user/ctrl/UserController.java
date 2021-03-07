package com.wez.user.ctrl;

import com.wez.api.order.svc.vo.OrderVO;
import com.wez.api.user.svc.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController
 *
 * @Author wez
 * @Time 2021/3/7 10:23
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询用户订单
     * @param userId 用户ID
     * @return
     */
    @GetMapping(value = "/list_user_order")
    public List<OrderVO> listUserOrder(String userId) {
        return userService.listOrder(userId);
    }

}
