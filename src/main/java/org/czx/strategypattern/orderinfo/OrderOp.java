package org.czx.strategypattern.orderinfo;

import org.czx.strategypattern.PayType;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 创建订单，订单选择性支付（策略模式）
 * Created by zhixuecai on 2018/11/5.
 */
public class OrderOp {

    public  String orderNumber() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmm");
        Date date = new Date();
        String key = format.format(date);
        Random random = new Random();
        int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数
        key = key + rannum;
        return key;
    }

    public Order createOrder(){
        Order order = new Order();
        order.setOrderid(orderNumber());
        order.setPrice(10.0);
        order.setGoodsname("蔬菜");
        order.setStatus("待支付");
        order.setUserId(1);
        //创建完成，数据入库不演示了
        return order;
    }


    //策略模式的设计
    public void pay(String orderId,PayType payType){
        payType.get().pay(orderId);
    }

}
