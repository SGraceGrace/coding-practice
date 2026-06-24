package practice.design_pattern.factory_pattern1.payment_factory;

import practice.design_pattern.factory_pattern1.payments.NetBankingPayment;
import practice.design_pattern.factory_pattern1.payments.PaymentInterface;

public class NetBankingPaymentProcessor extends PaymentProcessor {

  @Override
  protected PaymentInterface createPayment() {
    return new NetBankingPayment();
  }
}
