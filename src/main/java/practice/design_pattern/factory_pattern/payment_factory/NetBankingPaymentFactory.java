package practice.design_pattern.factory_pattern.payment_factory;

import practice.design_pattern.factory_pattern.payments.NetBankingPayment;
import practice.design_pattern.factory_pattern.payments.PaymentInterface;

public class NetBankingPaymentFactory implements PaymentFactory{

  @Override
  public PaymentInterface createPayment() {
    return new NetBankingPayment();
  }
}
