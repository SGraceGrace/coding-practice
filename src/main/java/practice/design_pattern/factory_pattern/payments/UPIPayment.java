package practice.design_pattern.factory_pattern.payments;

public class UPIPayment implements PaymentInterface {

  @Override
  public String pay() {
    return "UPI Payment Done Successfully";
  }
}
