package src;

import StrategyDesignPattern.loose.Pay;

public class PaymentService {
    Pay pay;
    // by using interface we don't have to do many changes if we want to change the method of pay
    // in tight coupling we usually hardcode the object here , so in future we need to change code of this class as well

    public PaymentService(Pay pay){ // constructor DI
        this.pay = pay;
    }

    public void payAmount(double amt){
        pay.pay(amt);
    }
}
