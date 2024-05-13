package Assignment6OOP.abstractassign;

import Assignment3.Print100;

public class ImageDisplay extends MediaDevice implements Playable{

    private String imgName;
    private double resolution;


    public ImageDisplay(String name, String imgName, double resolution) {
        super(name);
        this.imgName = imgName;
        this.resolution = resolution;
    }



    @Override
    public void displayDetails() {
        System.out.println("Image player: "+name);
        System.out.println("Image : "+imgName);
        System.out.println("Image Resolution "+resolution);

    }

    @Override
    public void play() {
        System.out.println("Playing Image:"+imgName);
    }
}
