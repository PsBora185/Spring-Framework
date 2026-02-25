package src;

import StrategyDesignPattern.loose.Pay;
import StrategyDesignPattern.loose.UpiPay;

public class test {
    public static void main(String[] args) {

        Pay pay = new UpiPay();

        // we can decide here which payment method we want to use, instead of deciding in service
        PaymentService paymentService = new PaymentService(pay);

        paymentService.payAmount(10);
    }
}
