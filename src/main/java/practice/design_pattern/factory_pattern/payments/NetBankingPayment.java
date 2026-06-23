package practice.design_pattern.factory_pattern.payments;

public class NetBankingPayment implements PaymentInterface {

  @Override
  public String pay() {
    return "Net Banking Payment Done Successfully";
  }
}
