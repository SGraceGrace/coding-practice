package practice.design_pattern.factory_pattern.payment_factory;

import practice.design_pattern.factory_pattern.payments.PaymentInterface;

public interface PaymentFactory {

  public PaymentInterface createPayment();
}
