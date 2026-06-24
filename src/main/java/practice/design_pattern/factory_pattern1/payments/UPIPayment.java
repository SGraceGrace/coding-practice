package practice.design_pattern.factory_pattern1.payments;

public class UPIPayment implements PaymentInterface {

  @Override
  public String pay() {
    return "UPI PaymentProcessor Done Successfully";
  }
}
