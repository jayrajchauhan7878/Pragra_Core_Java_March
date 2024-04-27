package april27.mediaplayer;

public class YoutubePremium extends Youtube implements AudioMediaPlayer,VideoMediaPlayer{

    @Override
    public boolean allFormatesSupported() {
        return super.allFormatesSupported();
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public boolean captionAreSupported() {
        return super.captionAreSupported();
    }

    boolean supportsBackgroundPlay(){

        System.out.println("Youtube Premium support background Play");
        return true;

    }
}
