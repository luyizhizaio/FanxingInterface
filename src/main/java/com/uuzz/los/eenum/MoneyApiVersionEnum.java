package com.uuzz.los.eenum;

/**
 * Created by lichangyue on 2015/9/9.
 * 接口版本枚举
 */
public enum MoneyApiVersionEnum {

    V160_MONEY_CALU("v160","金额计算1.6.0版本"),

    V150_MONEY_CALU("v150","金额计算1.5.0版本");

    private String version;
    private String text;

    MoneyApiVersionEnum(String version, String text) {
        this.version = version;
        this.text = text;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
