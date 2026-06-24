package practice.design_pattern.factory_pattern.payment_factory;

import practice.design_pattern.factory_pattern.payments.NetBankingPayment;
import practice.design_pattern.factory_pattern.payments.PaymentInterface;

public class NetBankingPaymentFactory extends PaymentFactory{

  @Override
  protected PaymentInterface createPayment() {
    return new NetBankingPayment();
  }
}
