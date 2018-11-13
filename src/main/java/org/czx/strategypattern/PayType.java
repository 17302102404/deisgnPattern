package org.czx.strategypattern;

import org.czx.strategypattern.alipay.AlipayOp;
import org.czx.strategypattern.wechatpay.WeChatPayOp;

/**
 *
 * 策略模式的使用使得整个支付流程的扩拓展性变得十分的简单，代码逻辑结构也清晰
 *
 * 增加一个支付渠道，支付要扩展独立的支付渠道代码，然后再PayType里面注册一下就行，
 * 前端调用不需要任务的改变
 * Created by zhixuecai on 2018/11/4.
 */
public enum PayType {
    AliPay(new AlipayOp()),WechatPay(new WeChatPayOp());

    private PayMain payMain;

    private  PayType(PayMain payMain){
        this.payMain=payMain;
    }

    public PayMain get() {
        return this.payMain;
    }

}
