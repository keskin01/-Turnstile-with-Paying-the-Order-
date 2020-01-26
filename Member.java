public class Member extends MembershipCard  {
    String eat,drink;

    public Member (String eat,String drink,int membershipNumber,boolean payment,boolean onlinepayment,int qrCode){
        super(qrCode);
        this.eat=eat;
        this.drink=drink;
        this.membershipNumber=membershipNumber;
        this.payment=payment;
        this.onlinepayment=onlinepayment;
        this.qrCode=qrCode;

    }
}
