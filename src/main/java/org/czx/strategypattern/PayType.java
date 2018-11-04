package org.czx.strategypattern;

/**
 * Created by zhixuecai on 2018/11/4.
 */
public enum PayType {
    AliPay(new Object()),WeChatPay(new Integer(1));

    private Object value;

    private  PayType(Object value){
        this.value=value;
    }

    public Object getValue() {
        return value;
    }

}
