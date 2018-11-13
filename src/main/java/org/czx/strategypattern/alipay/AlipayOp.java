package org.czx.strategypattern.alipay;

import org.czx.strategypattern.PayMain;
import org.jcp.xml.dsig.internal.SignerOutputStream;

/**
 * Created by zhixuecai on 2018/11/5.
 */
public class AlipayOp implements PayMain {

    /**
     * 创建预付单然后支付
     * @param oederId
     */
    @Override
    public void pay(String oederId) {

        System.out.println("通过orderId，查询到order信息");
        System.out.println("订单号和金额生成支付宝的预付单");
        System.out.println("回调接口设置//url");
        System.out.println("后端请求支付宝生成预付单接口得到预付单");
        System.out.println("返回前端支付宝预付单号，然后根据预付单号，前端调用支付服务端");
        System.out.println("支付宝服务端收到钱，支付宝服务端回调后端之前的设置的回调端口");
    }

    //暴露一个restful回调接口让支付宝请求，这里用一个方法代替，主要说明回调接口注意事项
    public void callback(){
        //订单金额校验
        //支付状态的回写
        //订单的配送
    }


}
