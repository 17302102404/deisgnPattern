package org.czx.strategypattern;

/**
 * 定义一个抽象定，所有的支付都必须继承这个方法，指定流程，支付过程
 *
 * Created by zhixuecai on 2018/11/4.
 */
public abstract class PayMain {

    public abstract void  pay(String oederId);

    public  void  toPay(String orderId,PayType payType){
        //反射调用PayType的pay方法


    }

}
