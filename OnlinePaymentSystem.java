public class OnlinePaymentSystem {
    int qrCode;
    boolean onlinepayment;

    public boolean isOnlinepayment(){
        return onlinepayment;
    }
    public OnlinePaymentSystem(int qrCode){
        this.qrCode=qrCode;
    }
}
