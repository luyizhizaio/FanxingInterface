package com.uuzz.los.entity;

import java.util.List;

/**
 * 金额传输对象
 * User: meixiaofeng
 * Date: 14-11-17
 * Time: 下午15:37
 * To change this template use File | Settings | File Templates.
 */
public class OrderMoney implements java.io.Serializable{

    private Long pay;

    private Long goodsPrice;

    private Long freight;

    private Long discountAmount;

    private String couponCode;

    private Integer couponType;

    private Long startCharge; //起送价， add by lcy 20150616

    private Integer couponVoucherType; //优惠券类型

    private Long jingBeanDiscount; //京豆优惠金额addbylcy20150804

    private Long jingBeanBalance; //用户京豆余额


    private Long usableBeanNum; //订单可用京豆数量

    private Long manJianManZheDiscount; //满减满折优惠金额

    private Long couponDiscount; //优惠券/优惠码的优惠金额

    private Long manJianManZhePayMoney;//满减满折后支付金额

    public Long getPay() {
        return pay;
    }

    public void setPay(Long pay) {
        this.pay = pay;
    }

    public Long getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Long goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Long getFreight() {
        return freight;
    }

    public void setFreight(Long freight) {
        this.freight = freight;
    }

    public Long getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Long discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Long getStartCharge() {
        return startCharge;
    }

    public void setStartCharge(Long startCharge) {
        this.startCharge = startCharge;
    }

    public Integer getCouponVoucherType() {
        return couponVoucherType;
    }

    public void setCouponVoucherType(Integer couponVoucherType) {
        this.couponVoucherType = couponVoucherType;
    }

    public Long getJingBeanDiscount() {
        return jingBeanDiscount;
    }

    public void setJingBeanDiscount(Long jingBeanDiscount) {
        this.jingBeanDiscount = jingBeanDiscount;
    }

    public Long getJingBeanBalance() {
        return jingBeanBalance;
    }

    public void setJingBeanBalance(Long jingBeanBalance) {
        this.jingBeanBalance = jingBeanBalance;
    }

    public Long getUsableBeanNum() {
        return usableBeanNum;
    }

    public void setUsableBeanNum(Long usableBeanNum) {
        this.usableBeanNum = usableBeanNum;
    }

    public Long getManJianManZheDiscount() {
        return manJianManZheDiscount;
    }

    public void setManJianManZheDiscount(Long manJianManZheDiscount) {
        this.manJianManZheDiscount = manJianManZheDiscount;
    }

    public Long getCouponDiscount() {
        return couponDiscount;
    }

    public void setCouponDiscount(Long couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public Long getManJianManZhePayMoney() {
        return manJianManZhePayMoney;
    }

    public void setManJianManZhePayMoney(Long manJianManZhePayMoney) {
        this.manJianManZhePayMoney = manJianManZhePayMoney;
    }
}
