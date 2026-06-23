package practice.design_pattern.factory_pattern.payments;

public class CreditCardPayment implements PaymentInterface {

  @Override
  public String pay() {
    return "Credit Card Payment Done Successfully";
  }
}
