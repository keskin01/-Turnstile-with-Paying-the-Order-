public class PaymentCheck extends OnlinePaymentSystem {
    boolean payment;

    public PaymentCheck(int qrCode) {
        super(qrCode);
    }

    public boolean isPayment(){
        return payment;
    }

}
