package practice.design_pattern.factory_pattern2.paymentProcessor;

import practice.design_pattern.factory_pattern2.enums.PaymentType;

public class NetBankingPaymentProcessor implements PaymentProcessor {

  @Override
  public PaymentType getType() {
    return PaymentType.NET_BANKING;
  }

  @Override
  public String pay() {
    return "Net Banking PaymentProcessor Done Successfully";
  }
}
