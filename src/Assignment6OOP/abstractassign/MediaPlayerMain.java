package Assignment6OOP.abstractassign;

public class MediaPlayerMain {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer("Audio Device","Beautiful","Pretty Girl");
        audioPlayer.displayDetails();
        audioPlayer.play();

        System.out.println("------------");
        System.out.println("Video Media Player--");

        VideoPlayer videoPlayer = new VideoPlayer("Video Media Device","Mr beast in 24 Hour Jail Video",2.5);
        videoPlayer.displayDetails();
        videoPlayer.play();

        System.out.println("------------");
        System.out.println("Image Player--");

        ImageDisplay imageDisplay = new ImageDisplay("Image Device","Vaction Trip Paris 011.jpg",1080);
        imageDisplay.displayDetails();
        imageDisplay.play();



    }
}
