package com.uuzz.los.service.context;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.uuzz.los.eenum.MoneyErrorCodeEnum;
import com.uuzz.los.entity.BaseMoneyCaluRequest;
import com.uuzz.los.entity.ReturnResponse;
import com.uuzz.los.service.strategy.MoneyCalulationStrategy;

/**
 * Created by lichangyue on 2015/9/9.
 */
@Service
public class MoneyCalculationContextImpl<R extends BaseMoneyCaluRequest,OrderMoney> implements MoneyCalculationContext<R,OrderMoney> {


    @Resource(name="moneyCaluExecutorMap")
    private Map moneyCaluExecutorMap;

    /**
     * 金额计算接口
     */
    @Override
    public ReturnResponse<OrderMoney> calculationOrderMoney(String version ,R r) {
        try{
            //获取版本对应实例
            MoneyCalulationStrategy<R,OrderMoney> strategy = (MoneyCalulationStrategy<R,OrderMoney>)moneyCaluExecutorMap.get(version);
            ReturnResponse<OrderMoney> returnResponse = strategy.calculationOrderMoney(r);
            return returnResponse;
        }catch (Exception e) {
            System.out.println(e);
        	ReturnResponse<OrderMoney> returnResponse =new ReturnResponse<OrderMoney>();
            returnResponse.setSuccess(false);
            returnResponse.setErrorCodeAndErrorInfos(MoneyErrorCodeEnum.SYSTEM_ERROR.getNum(), MoneyErrorCodeEnum.SYSTEM_ERROR.getMsg());
            
            return returnResponse;
        }
    }

	

}
