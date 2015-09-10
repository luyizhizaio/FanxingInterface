package com.uuzz.los.service.context;

import com.uuzz.los.entity.ReturnResponse;


/**
 * Created by lichangyue on 2015/9/9.
 */
public interface MoneyCalculationContext<R,Z> {

    /**
     * 金额计算接口
     * @param version
     * @param r
     * @return
     */
    public ReturnResponse<Z> calculationOrderMoney(String version ,R r);

}
