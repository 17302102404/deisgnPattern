package org.czx.strategypattern.orderinfo;

/**
 * Created by zhixuecai on 2018/11/5.
 */
public class Order {
    private  String  orderid;
    private  String  goodsname; //商品价格
    private  double  price;    //钱
    private  long  userId;   //用户id
    private  String  status;  //交易状态

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
