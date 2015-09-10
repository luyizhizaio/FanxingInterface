package com.uuzz.los.service.strategy.impl;

import org.springframework.stereotype.Service;

import com.uuzz.los.entity.MoneyCalculationForV150Request;
import com.uuzz.los.entity.OrderMoney;
import com.uuzz.los.entity.ReturnResponse;
import com.uuzz.los.service.strategy.MoneyCalulationStrategy;

/**
 * Created by lichangyue on 2015/9/9.
 * 金额计算1.4.0版本实现
 */
@Service("moneyCalulationStrategyForVersion150")
public class MoneyCalulationStrategyForVersion150Impl extends AbstractMoneyCalulationStrategy<MoneyCalculationForV150Request, OrderMoney> implements MoneyCalulationStrategy<MoneyCalculationForV150Request,OrderMoney> {


    @Override
    public ReturnResponse<OrderMoney> calculationOrderMoney(MoneyCalculationForV150Request moneyCalculationRequest) {

        OrderMoney orderMoney = new OrderMoney();
        ReturnResponse returnResponse =new ReturnResponse();
        orderMoney.setCouponCode("V150");
        returnResponse.setData(orderMoney);
        return returnResponse;
    }


}
