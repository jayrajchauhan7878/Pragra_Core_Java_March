package Assignment6OOP.abstractassign;

import java.sql.SQLOutput;

public class AudioPlayer extends MediaDevice implements Playable{


    public AudioPlayer(String name, String songName, String artist) {
        super(name);
        this.songName = songName;
        this.artist = artist;
    }

    private String songName;
    private String artist;



    @Override
    public void displayDetails() {

        System.out.println("This is Audio Player "+name);
        System.out.println("Current Song "+songName);
        System.out.println("Artist for this song "+artist);



    }

    @Override
    public void play() {
        System.out.println("Playing audio"+ songName + "by" + artist);
    }
}
