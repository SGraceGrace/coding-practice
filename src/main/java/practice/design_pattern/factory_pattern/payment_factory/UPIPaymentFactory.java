package practice.design_pattern.factory_pattern.payment_factory;

import practice.design_pattern.factory_pattern.payments.PaymentInterface;
import practice.design_pattern.factory_pattern.payments.UPIPayment;

public class UPIPaymentFactory implements PaymentFactory{

  @Override
  public PaymentInterface createPayment() {
    return new UPIPayment();
  }
}
