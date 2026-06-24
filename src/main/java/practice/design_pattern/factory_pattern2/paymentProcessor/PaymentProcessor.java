package practice.design_pattern.factory_pattern2.paymentProcessor;

import practice.design_pattern.factory_pattern2.enums.PaymentType;

public interface PaymentProcessor {
  PaymentType getType();
  public String pay();
}
