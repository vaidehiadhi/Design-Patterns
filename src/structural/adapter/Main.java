package.structural.adapter
public class Main {
    public static void main(String[] args) {
        ThirdPartyPayment thirdPartyPayment = new ThirdPartyPayment();
        PaymentProcessor processor = new PaymentAdapter(thirdPartyPayment);
        processor.processPayment(100);
    }
}