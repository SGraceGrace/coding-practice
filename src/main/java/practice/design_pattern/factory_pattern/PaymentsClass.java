package practice.design_pattern.factory_pattern;

import practice.design_pattern.factory_pattern.payment_factory.PaymentFactory;
import practice.design_pattern.factory_pattern.payment_factory.UPIPaymentFactory;
import practice.design_pattern.factory_pattern.payments.PaymentInterface;

public class PaymentsClass {

  public static void main(String[] args) {
    PaymentFactory paymentFactory = new UPIPaymentFactory();
    PaymentInterface payment = paymentFactory.createPayment();
    System.out.println(payment.pay());
  }

}
