package april27.smartphone;

public class SmartPhone implements Calculator, Camera , Computer , MusicPlayer {

    @Override
    public void calculate() {

    }

    @Override
    public void itCapturePhotos() {

    }

    @Override
    public void multiTasking() {

        System.out.println("Smartphone Can do multitasking like Computer");

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    public boolean touchScreen(){

        return true;
    }
}
