package practice.design_pattern.factory_pattern2.paymentfactory;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import practice.design_pattern.factory_pattern2.enums.PaymentType;
import practice.design_pattern.factory_pattern2.paymentProcessor.PaymentProcessor;

public class PaymentFactory {

  private final Map<PaymentType, PaymentProcessor> paymentTypePaymentProcessorMap;

  public PaymentFactory(List<PaymentProcessor> paymentProcessors) {
    this.paymentTypePaymentProcessorMap = paymentProcessors.stream().collect(Collectors.toMap(
        PaymentProcessor::getType, Function.identity()));
  }
}
