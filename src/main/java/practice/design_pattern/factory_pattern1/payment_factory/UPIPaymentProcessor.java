package practice.design_pattern.factory_pattern1.payment_factory;

import practice.design_pattern.factory_pattern1.payments.PaymentInterface;
import practice.design_pattern.factory_pattern1.payments.UPIPayment;

public class UPIPaymentProcessor extends PaymentProcessor {

  @Override
  public PaymentInterface createPayment() {
    return new UPIPayment();
  }
}
