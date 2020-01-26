public class test {

    public static void main(String[] args) {
        Turnstille turnstille = new Turnstille();
        Display display = new Display();

        //member
        Member member=new Member("steak","ice tea",514357,false,true,8888);
        //true qr code
        OnlinePaymentSystem qr= new OnlinePaymentSystem(8888);

        //menu
        Menu menu1=new Menu("steak","coke",20,5);
        Menu menu2=new Menu("burger","ice tea",15,3);

        //Testing place
        //turnstille entrence
        turnstille.enter();

        //space0
        System.out.println("\n");
        //space0


        //check screen
        display.CheckScreen(member.eat,member.drink,member.membershipNumber,member.payment);

        //space1
        System.out.println("\n");
        //space1 end

        //menu screen
        display.MenuScreen(menu1.food,menu1.drink,menu1.priceoffood,menu1.priceofdrink);
        display.MenuScreen(menu2.food,menu2.drink,menu2.priceoffood,menu2.priceofdrink);

        //space2
        System.out.println("\n");
        //space2 end

        //payment control
        if(member.isOnlinepayment()){
            if(member.qrCode==qr.qrCode) {
                System.out.println("Member paid online");
                turnstille.isQRreader();
                turnstille.open();
            }
            else System.out.println("This member not paid ");
            turnstille.close();
        }
        else if(member.isPayment()) {
            System.out.println("Payment recived ");
            turnstille.button=true;
            turnstille.isButton();
            turnstille.open();
        }
        else{
            System.out.println("Payment is not recived ");
            turnstille.isButton();
            turnstille.close();
        }
   }
}
