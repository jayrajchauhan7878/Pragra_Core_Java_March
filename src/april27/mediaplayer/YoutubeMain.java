package april27.mediaplayer;

public class YoutubeMain {

    public static void main(String[] args) {


        YoutubePremium withSub = new YoutubePremium();

        withSub.allFormatesSupported();
        withSub.captionAreSupported();
        withSub.supportsBackgroundPlay();

        Youtube withOutSub = new Youtube();
        withOutSub.allFormatesSupported();


    }
}
