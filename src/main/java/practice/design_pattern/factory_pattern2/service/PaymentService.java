package practice.design_pattern.factory_pattern2.service;

import java.util.Scanner;
import practice.design_pattern.factory_pattern2.enums.PaymentType;
import practice.design_pattern.factory_pattern2.paymentProcessor.PaymentProcessor;
import practice.design_pattern.factory_pattern2.paymentfactory.PaymentFactory;

public class PaymentService {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Choose your mode of Payment: 1.Credit Card 2.UPI 3. Net Banking");
    String type = scanner.nextLine();

    PaymentType paymentType = PaymentType.getType(type);

    PaymentFactory paymentFactory = new PaymentFactory();
    PaymentProcessor processor = paymentFactory.getPaymentProcessor(paymentType);
    System.out.println(processor.pay());
  }

}
