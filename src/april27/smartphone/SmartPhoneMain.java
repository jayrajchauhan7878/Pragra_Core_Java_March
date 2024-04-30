package april27.smartphone;

public class SmartPhoneMain {


    public static void main(String[] args) {


        Iphone ip10 = new Iphone();

        System.out.println("Smartphone have touchscreen ? "+ip10.touchScreen());

        System.out.println("iPhone 10 has HomeButton ? "+ip10.homeButton());

        ip10.multiTasking();
    }


}
