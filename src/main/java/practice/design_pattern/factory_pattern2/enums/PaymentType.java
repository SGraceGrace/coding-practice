package practice.design_pattern.factory_pattern2.enums;

import java.util.HashMap;
import java.util.Map;
import practice.design_pattern.factory_pattern2.paymentProcessor.CreditCardPaymentProcessor;
import practice.design_pattern.factory_pattern2.paymentProcessor.NetBankingPaymentProcessor;
import practice.design_pattern.factory_pattern2.paymentProcessor.PaymentProcessor;
import practice.design_pattern.factory_pattern2.paymentProcessor.UPIPaymentProcessor;

public enum PaymentType {
  UPI_PAYMENT("UPI", UPIPaymentProcessor.class),
  CREDIT_CARD("Credit Card", CreditCardPaymentProcessor.class),
  NET_BANKING("Net Banking", NetBankingPaymentProcessor.class);

  private String displayName;
  private Class<? extends PaymentProcessor> clazz;
  private static final Map<String, PaymentType> typeMap = new HashMap<>();

  PaymentType(String displayName, Class<? extends PaymentProcessor> clazz) {
    this.displayName = displayName;
    this.clazz = clazz;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Class<? extends PaymentProcessor> getClazz() {
    return clazz;
  }

  static {
    for (PaymentType type : PaymentType.values()) {
      typeMap.put(type.getDisplayName(), type);
    }
  }

  public static PaymentType getType(String type) {
    return typeMap.get(type);
  }
}
