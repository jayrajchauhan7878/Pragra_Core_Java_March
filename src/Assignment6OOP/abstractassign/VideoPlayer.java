package Assignment6OOP.abstractassign;

public class VideoPlayer extends MediaDevice implements Playable{


    private String title;
    private double duration;

    public VideoPlayer(String name, String title, double duration) {
        super(name);
        this.title = title;
        this.duration = duration;
    }



    @Override
    public void displayDetails() {

        System.out.println("Video Player: "+name);
        System.out.println("Video Title: " + title);
        System.out.println("Duration: " + duration);


    }

    @Override
    public void play() {
        System.out.println("Playing Video : "+ title);
    }
}
