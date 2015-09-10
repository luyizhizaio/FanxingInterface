package com.uuzz.los.eenum;

/**
 * Created by meixiaofeng on 2014/12/1.
 */
public enum MoneyErrorCodeEnum {


    /** 处理成功 */
    SUCCESS("0", "SUCCESS", "成功"),
    /** 处理失败 */
    FAILURE("-1", "FAILURE", "失败"),
    /** 处理警告*//*
    WARNING("WARNING", "警告"),*/
    /** 系统错误 */
    SYSTEM_ERROR("-2", "SYSTEM_ERROR", "系统错误"),
    /**参数错误*/
    PARAM_ERROR("-3", "PARAM_ERROR", "参数错误"),
    FREIGHT_ERROR("-4", "FREIGHT_ERROR", "运费计算失败"),
    PRICE_ERROR("-5", "PRICE_ERROR", "获取价格出错"),
    PRICE_VENDERID_ERROR("-6", "PRICE_ERROR", "获取店铺ID出错"),
    PRICE_STOCKOWNER_ERROR("-7", "PRICE_ERROR", "获取库存归属出错"),
    /**商品价格低于起送金额*/
    PRICE_LOWER_STARTCHARGE("-8", "PRICE_LOWER_STARTCHARGE", "未达到起送金额，再去挑挑看吧"),

    /**优惠券不存在*/
    COUPON_NOTEXIST("1","COUPON_NOTEXIST","优惠码无效"),
    /**优惠券信息缺失*/
    COUPON_REQUERID("2","COUPON_REQUERID","优惠码不能为空"),
    /**优惠券无效*/
    COUPON_NOTBEGIN("3","COUPON_NOTBEGIN","优惠码未开始"),
    COUPON_ALSEND("4","COUPON_ALSEND","优惠码已过期"),
    /**订单金额不符合规则*/
    COUPON_MINMONEY("5","COUPON_MINMONEY","订单金额不符合优惠规则"),
    /**优惠券已用完*/
    COUPON_RUNOUT("6","COUPON_RUNOUT","优惠码已用完"),
    /**生成的优惠编码已超限*/
    COUPON_OUTOF_RANGE("7","COUPON_OUTOF_RANGE","优惠编码已超限，请联系管理员"),
    /**当天优惠码已消费完*/
    DAY_COUPON_RUNOUT("8","DAY_COUPON_RUNOUT","此优惠码超过一天最大使用次数"),
    /**优惠券不属于此商家*/
    COUPON_NOTVENDER("11","COUPON_NOTVENDER","优惠码不属于此商家"),
    COUPON_SUCCESS("9", "COUPON_SUCCESS", "恭喜，优惠码使用成功！"),
    COUPON_ERROR("10", "COUPON_ERROR", "优惠码使用失败！"),


    /**使用优惠券返回的错误编码*/
    USERCOUPON_INVALIDE("13","USERCONPON_INVALIDE","优惠券无效或已使用"),

    /**返回结果为空**/
    RETURN_NULL("14","RETURN_NULL","返回结果为空"),
    /**参数必须填写**/
    PARAM_REQUIRED("15","PARAM_REQUIRED","参数不能为空"),

    ORDER_NOT_NOTEXIST("16","ORDER_NOT_NOTEXIST","订单号不存在"),
    /** 优惠码不适用于此行业 */
    COUPON_NOT_INDUSTRY("17","COUPON_NOT_INDUSTRY","此优惠码不属于此商家所在行业"),
    /** 获取商家所在行业失败 */
    ORG_LACK_INDUSTRY("18","ORG_LACK_INDUSTRY","获取商家所在行业失败"),
    /**
     * 订单防重
     */
    ORDER_EXIST("19","ORDER_EXIST","订单已经存在"),

    /**
     * 获取优惠券类型失败
     */
    COUPON_VOUCHER_TYPE_FAIL("20","COUPON_VOUCHER_TYPE_FAIL","优惠券信息异常，请重新选择"),
    /**
     * 调用京豆余额接口失败
     */
    JING_BEAN_RPC_FAIL("21","JING_BEAN_RPC_FAIL","京豆信息异常，请稍后再试"),
    /**使用优惠券时，订单价格小于最小订单金额*/
    VOUCHER_GOOD_PRICE_LESS_THAN_MIN_AMOUNT("22","VOUCHER_GOOD_PRICE_LESS_THAN_MIN_AMOUNT","优惠券使用异常，请重新选择"),

    /**订单包含秒杀商品*/
    ORDER_CONTAIN_SEC_KILL_GOODS("23","ORDER_CONTAIN_SEC_KILL_GOODS","存在秒杀商品，无法提交订单");


    private String num;
    private String code;
    private String msg;

    MoneyErrorCodeEnum(String num, String code, String msg) {
        this.num = num;
        this.code = code;
        this.msg = msg;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
