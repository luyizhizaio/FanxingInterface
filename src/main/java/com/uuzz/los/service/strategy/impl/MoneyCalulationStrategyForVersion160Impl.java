package com.uuzz.los.service.strategy.impl;

import org.springframework.stereotype.Service;

import com.uuzz.los.entity.MoneCaluV160Request;
import com.uuzz.los.entity.MoneyCalculationForV150Request;
import com.uuzz.los.entity.OrderMoney;
import com.uuzz.los.entity.ReturnResponse;
import com.uuzz.los.service.strategy.MoneyCalulationStrategy;

/**
 * Created by lichangyue on 2015/9/9.
 * 金额计算1.4.0版本实现
 */
@Service("moneyCalulationStrategyForVersion160")
public class MoneyCalulationStrategyForVersion160Impl extends AbstractMoneyCalulationStrategy implements MoneyCalulationStrategy<MoneCaluV160Request,OrderMoney> {


    @Override
    public ReturnResponse<OrderMoney> calculationOrderMoney(MoneCaluV160Request moneyCalculationRequest) {

        OrderMoney orderMoney = new OrderMoney();
        ReturnResponse returnResponse =new ReturnResponse();
        orderMoney.setCouponCode("V160");
        returnResponse.setData(orderMoney);
        return returnResponse;
    }


}
