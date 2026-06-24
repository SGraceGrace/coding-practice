package practice.design_pattern.factory_pattern2.paymentProcessor;

import practice.design_pattern.factory_pattern2.enums.PaymentType;

public class CreditCardPaymentProcessor implements PaymentProcessor {

  @Override
  public PaymentType getType() {
    return PaymentType.CREDIT_CARD;
  }

  @Override
  public String pay() {
    return "Credit Card PaymentProcessor Done Successfully";
  }
}
