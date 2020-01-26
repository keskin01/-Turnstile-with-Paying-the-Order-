public class Turnstille {
    boolean entopen,exopen,exclose;
    boolean button;
    boolean QRreader;

    public Turnstille(){
        this.exopen=false;
        this.exclose=false;
    }
//entrence
    public void enter(){
        System.out.println("Turnstille is open for enter");
        entopen = true;
    }


//open and close statements
    public void open(){
        System.out.println("Turnstille is open for exit");
        exopen = true;
    }
    public void close(){
        System.out.println("Turnstille is close for exit");
        exclose = true;
    }

//button part
    public boolean isButton() {
       this.button=button;
       if (button==true){
           System.out.println("Button is passed ");
           return exopen;
       }
       else {
           System.out.println("Button is not passed ");
           return exclose;}
    }
//qr reader
    public boolean isQRreader(){
        this.QRreader=QRreader;
        if (QRreader==true){
            System.out.println("QR code is valid ");
            return exopen;
        }
        else{
            System.out.println("QR code is not valid ");
            return exclose;
        }
    }

}
