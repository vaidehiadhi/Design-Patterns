package.structural.adapter
public class PaymentAdapter implements PaymentProcessor {
    private ThirdPartyPayment thirdPartyPayment;

    public PaymentAdapter(ThirdPartyPayment thirdPartyPayment) {
        this.thirdPartyPayment = thirdPartyPayment;
    }
    @Override
    public void processPayment(int amount) {
        thirdPartyPayment.makePayment(amount);
    }
}