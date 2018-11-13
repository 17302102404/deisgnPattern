package org.czx.strategypattern.test;

import org.czx.strategypattern.PayType;
import org.czx.strategypattern.orderinfo.Order;
import org.czx.strategypattern.orderinfo.OrderOp;

/**
 * Created by zhixuecai on 2018/11/5.
 */
public class paytest {

    public static void main(String[] args) {
        OrderOp orderop = new OrderOp();
        Order order =orderop.createOrder();
        System.out.println("订单号:"+order.getOrderid());
        orderop.pay(order.getOrderid(), PayType.AliPay);
    }

}
