package practice.design_pattern.factory_pattern.payment_factory;

import practice.design_pattern.factory_pattern.payments.CreditCardPayment;
import practice.design_pattern.factory_pattern.payments.PaymentInterface;

public class CreditCardPaymentFactory extends PaymentFactory{

  @Override
  protected PaymentInterface createPayment() {
    return new CreditCardPayment();
  }
}
