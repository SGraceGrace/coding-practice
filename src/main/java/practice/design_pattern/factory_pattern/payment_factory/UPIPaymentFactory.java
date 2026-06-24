package practice.design_pattern.factory_pattern.payment_factory;

import practice.design_pattern.factory_pattern.payments.PaymentInterface;
import practice.design_pattern.factory_pattern.payments.UPIPayment;

public class UPIPaymentFactory extends PaymentFactory{

  @Override
  protected PaymentInterface createPayment() {
    return new UPIPayment();
  }
}
