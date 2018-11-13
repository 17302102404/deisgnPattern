package org.czx.strategypattern.wechatpay;

import org.czx.strategypattern.PayMain;

/**
 * Created by zhixuecai on 2018/11/5.
 */
public class WeChatPayOp  implements PayMain{
    @Override
    public void pay(String oederId) {
        System.out.println("微信支付");
    }
}
