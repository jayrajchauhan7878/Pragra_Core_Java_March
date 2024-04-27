package april27.mediaplayer;

public class Youtube implements AudioMediaPlayer , VideoMediaPlayer{

    @Override
    public boolean allFormatesSupported() {
        System.out.println("Youtube dont support all audio format");
        return false;
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean captionAreSupported() {

        System.out.println("Youtube supports Captions");
        return true;
    }
}
