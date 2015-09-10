package com.uuzz.los.entity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lichangyue
 * Date: 15-6-16
 * Time: 下午3:32
 * To change this template use File | Settings | File Templates.
 */
public class MoneyCalculationForV150Request extends BaseMoneyCaluRequest{

    private String couponCode;   //优惠码
    private String orderId;      //订单号

 
    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
