package practice.design_pattern.factory_pattern.payment_factory;

import practice.design_pattern.factory_pattern.payments.PaymentInterface;

public abstract class PaymentFactory {

  protected abstract PaymentInterface createPayment();

  public String payment() {
    PaymentInterface paymentInterface = createPayment();

    return paymentInterface.pay();
  }
}
