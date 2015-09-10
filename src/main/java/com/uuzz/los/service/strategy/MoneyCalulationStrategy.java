package com.uuzz.los.service.strategy;

import com.uuzz.los.entity.ReturnResponse;

/**
 * Created by lichangyue on 2015/9/9.
 */
public interface MoneyCalulationStrategy<K,S> {


    /**
     *
     * @param k
     * @return
     */
    ReturnResponse<S> calculationOrderMoney(K k);


}
