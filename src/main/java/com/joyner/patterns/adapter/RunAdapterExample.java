package com.joyner.patterns.adapter;

import com.joyner.patterns.adapter.payd.PayD;
import com.joyner.patterns.adapter.site.XpayToPayDAdapter;
import com.joyner.patterns.adapter.xpay.*;

public class RunAdapterExample {

    public static void main(String[] args) {
        // Object for Xpay
        //就是说这个Xpay已经在代码的很多地方被使用
        //也就是之前是xpay的地方我只需要通过适配器，就可以改成payD，这样对于原来的代码修改就很少或者不改动（不改动的情况就是支持两种支付）
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Max Warner");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short)235);
        xpay.setAmount(2565.23);



        PayD payD = new XpayToPayDAdapter(xpay);
        testPayD(payD);
    }

    private static void testPayD(PayD payD){
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }
}
