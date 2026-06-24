package practice.design_pattern.factory_pattern2.enums;

import practice.design_pattern.factory_pattern2.paymentProcessor.CreditCardPaymentProcessor;
import practice.design_pattern.factory_pattern2.paymentProcessor.NetBankingPaymentProcessor;
import practice.design_pattern.factory_pattern2.paymentProcessor.PaymentProcessor;
import practice.design_pattern.factory_pattern2.paymentProcessor.UPIPaymentProcessor;

public enum PaymentType {
  UPI_PAYMENT("UPI", UPIPaymentProcessor.class),
  CREDIT_CARD("Credit Card", CreditCardPaymentProcessor.class),
  NET_BANKING("Net Banking", NetBankingPaymentProcessor.class);

  private String name;
  private Class<? extends PaymentProcessor> clazz;

  PaymentType(String name, Class<? extends PaymentProcessor> clazz) {
    this.name = name;
    this.clazz = clazz;
  }

  static
}
