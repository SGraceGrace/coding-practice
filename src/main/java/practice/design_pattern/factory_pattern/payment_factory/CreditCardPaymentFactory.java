package practice.design_pattern.factory_pattern.payment_factory;

import practice.design_pattern.factory_pattern.payments.CreditCardPayment;
import practice.design_pattern.factory_pattern.payments.PaymentInterface;

public class CreditCardPaymentFactory implements PaymentFactory{

  @Override
  public PaymentInterface createPayment() {
    return new CreditCardPayment();
  }
}
