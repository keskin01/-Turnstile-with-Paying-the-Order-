public class Display {
   public String costumerfood,costumerdrink,menufood,menudrink;
   public int costumernumber,foodprice,drinkprice;
   public boolean recive;

   //Checkscreen part
    public void CheckScreen(String costumerfood,String costumerdrink,int costumernumber,boolean recive) {
        this.costumerfood=costumerfood;
        this.costumerdrink=costumerdrink;
        this.costumernumber=costumernumber;
        this.recive=recive;

        System.out.println("---Check Screen---");
        System.out.println("Costumer eats: "+costumerfood);
        System.out.println("Costumer drink: "+costumerdrink);
        System.out.println("Costumer number: "+costumernumber);
        System.out.println("Payment recive: "+recive);
        System.out.println("------------------");
    }
    //Menu screen
    public void MenuScreen(String menufood,String menudrink,int foodprice,int drinkprice){
        this.menufood=menufood;
        this.menudrink=menudrink;
        this.foodprice=foodprice;
        this.drinkprice=drinkprice;

        System.out.println("-----Menu Screen-----");
        System.out.println(menufood+" "+foodprice);
        System.out.println(menudrink+" "+drinkprice);
        System.out.println("--------------------");
    }






}
