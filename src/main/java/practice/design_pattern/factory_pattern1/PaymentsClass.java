package practice.design_pattern.factory_pattern1;

import practice.design_pattern.factory_pattern1.payment_factory.PaymentProcessor;
import practice.design_pattern.factory_pattern1.payment_factory.UPIPaymentProcessor;
import practice.design_pattern.factory_pattern1.payments.PaymentInterface;

public class PaymentsClass {

  public static void main(String[] args) {
    PaymentProcessor paymentProcessor = new UPIPaymentProcessor();
    PaymentInterface paymentInterface = paymentProcessor.createPayment();
    System.out.println(paymentInterface.pay());
  }

}
