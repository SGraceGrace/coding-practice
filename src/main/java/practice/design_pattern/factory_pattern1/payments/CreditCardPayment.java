package practice.design_pattern.factory_pattern1.payments;

public class CreditCardPayment implements PaymentInterface {

  @Override
  public String pay() {
    return "Credit Card PaymentProcessor Done Successfully";
  }
}
