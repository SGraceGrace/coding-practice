package practice.design_pattern.factory_pattern2.paymentProcessor;

import practice.design_pattern.factory_pattern2.enums.PaymentType;

public class UPIPaymentProcessor implements PaymentProcessor {

  @Override
  public PaymentType getType() {
    return PaymentType.UPI_PAYMENT;
  }

  @Override
  public String pay() {
    return "UPI PaymentProcessor Done Successfully";
  }
}
