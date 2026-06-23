package practice.design_pattern.factory_pattern;

import practice.design_pattern.factory_pattern.payments.CreditCardPayment;
import practice.design_pattern.factory_pattern.payments.NetBankingPayment;
import practice.design_pattern.factory_pattern.payments.PaymentInterface;
import practice.design_pattern.factory_pattern.payments.UPIPayment;

public enum PaymentEnum {
  CREDIT_CARD_PAYMENT("Credit Card", CreditCardPayment.class),
  UPI_PAYMENT("UPI", UPIPayment.class),
  NET_BANKING_PAYMENT("Net Banking", NetBankingPayment.class);

  private String name;
  private Class type;

  PaymentEnum(String name, Class<? extends PaymentInterface> clazz) {
    this.name = name;
    this.type = clazz;
  }

  public String getName() {
    return name;
  }

  public Class getType() {
    return type;
  }
}
