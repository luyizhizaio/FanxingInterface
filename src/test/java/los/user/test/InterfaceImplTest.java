// Copyright (C) 2012-2013 UUZZ All rights reserved
package los.user.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.uuzz.los.eenum.MoneyApiVersionEnum;
import com.uuzz.los.entity.BaseMoneyCaluRequest;
import com.uuzz.los.entity.MoneyCalculationForV150Request;
import com.uuzz.los.entity.OrderMoney;
import com.uuzz.los.entity.ReturnResponse;
import com.uuzz.los.entity.MoneCaluV160Request;
import com.uuzz.los.service.context.MoneyCalculationContext;



/** 
 * 类 名: UserInfoImplTest<br/>
 * 描 述: IAccountUserService接口测试类<br/>
 * 作 者: 李长跃<br/>
 * 创 建： 2013-6-21<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class InterfaceImplTest extends BaseTest {
	
	@Autowired
    private MoneyCalculationContext<MoneyCalculationForV150Request,OrderMoney> moneyCalculationContextV150;
	@Autowired
	private MoneyCalculationContext<MoneCaluV160Request,OrderMoney> moneyCalculationContextV160;


    @Test
    public void caluTest(){
		
		 MoneyCalculationForV150Request moneyCalculationRequest = new MoneyCalculationForV150Request();
	     ReturnResponse<OrderMoney> returnResponse = moneyCalculationContextV150.calculationOrderMoney(MoneyApiVersionEnum.V150_MONEY_CALU.getVersion(), moneyCalculationRequest);
	     System.out.println(returnResponse.getData().getCouponCode());
	     
	     
	     
	     MoneCaluV160Request userInfo = new MoneCaluV160Request();
	     returnResponse = moneyCalculationContextV160.calculationOrderMoney(MoneyApiVersionEnum.V160_MONEY_CALU.getVersion(), userInfo);
	     System.out.println(returnResponse.getData().getCouponCode());

	}
	
	
	
}
