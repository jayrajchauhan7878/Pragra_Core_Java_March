package april27.interfaces;

public class IndianChineseFood implements IndianFood , ChineseFood{

    @Override
    public void eatWithSpoons() {
        System.out.println("Which food its calling ?");
    }
}
