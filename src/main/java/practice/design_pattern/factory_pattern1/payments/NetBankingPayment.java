package practice.design_pattern.factory_pattern1.payments;

public class NetBankingPayment implements PaymentInterface {

  @Override
  public String pay() {
    return "Net Banking PaymentProcessor Done Successfully";
  }
}
