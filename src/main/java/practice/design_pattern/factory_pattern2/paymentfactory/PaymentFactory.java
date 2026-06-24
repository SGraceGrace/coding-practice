package practice.design_pattern.factory_pattern2.paymentfactory;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import practice.design_pattern.factory_pattern2.enums.PaymentType;
import practice.design_pattern.factory_pattern2.paymentProcessor.CreditCardPaymentProcessor;
import practice.design_pattern.factory_pattern2.paymentProcessor.NetBankingPaymentProcessor;
import practice.design_pattern.factory_pattern2.paymentProcessor.PaymentProcessor;
import practice.design_pattern.factory_pattern2.paymentProcessor.UPIPaymentProcessor;

public class PaymentFactory {

  private static final Map<PaymentType, PaymentProcessor> paymentTypePaymentProcessorMap;

  private static List<PaymentProcessor> paymentProcessorList = List.of(
      new CreditCardPaymentProcessor(),
      new UPIPaymentProcessor(),
      new NetBankingPaymentProcessor()
  );

  static {
    paymentTypePaymentProcessorMap = paymentProcessorList.stream().collect(Collectors.toMap(
        PaymentProcessor::getType, Function.identity()));
  }

  public PaymentProcessor getPaymentProcessor(PaymentType type) {
    return paymentTypePaymentProcessorMap.get(type);
  }

}
