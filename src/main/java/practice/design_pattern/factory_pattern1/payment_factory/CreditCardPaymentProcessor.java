package practice.design_pattern.factory_pattern1.payment_factory;

import practice.design_pattern.factory_pattern1.payments.CreditCardPayment;
import practice.design_pattern.factory_pattern1.payments.PaymentInterface;

public class CreditCardPaymentProcessor extends PaymentProcessor {

  @Override
  public PaymentInterface createPayment() {
    return new CreditCardPayment();
  }
}
