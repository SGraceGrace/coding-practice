package practice.design_pattern.factory_pattern1.payment_factory;

import practice.design_pattern.factory_pattern1.payments.PaymentInterface;

public abstract class PaymentProcessor {

  protected abstract PaymentInterface createPayment();

  public String payment() {
    PaymentInterface paymentInterface = createPayment();

    return paymentInterface.pay();
  }
}
