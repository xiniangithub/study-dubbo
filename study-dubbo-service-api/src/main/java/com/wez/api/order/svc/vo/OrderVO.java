package com.wez.api.order.svc.vo;

import java.io.Serializable;

/**
 * 订单VO
 * @Author wez
 * @Time 2021/3/6 16:05
 */
public class OrderVO implements Serializable {

    private String id;

    private String userId;

    private String createTime;

    public OrderVO() {
    }

    public OrderVO(String id, String userId, String createTime) {
        this.id = id;
        this.userId = userId;
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
