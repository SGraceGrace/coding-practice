package practice.design_pattern.factory_pattern1;

import practice.design_pattern.factory_pattern1.payment_factory.PaymentFactory;
import practice.design_pattern.factory_pattern1.payment_factory.UPIPaymentFactory;

public class PaymentsClass {

  public static void main(String[] args) {
    PaymentFactory paymentFactory = new UPIPaymentFactory();
    System.out.println(paymentFactory.payment());
  }

}
