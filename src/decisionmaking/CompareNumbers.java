package decisionmaking;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CompareNumbers {

    public static void main(String[] args){

        int x = 70;
        int y = 50;
        int z = 30;

        if(x>y && x>z) {
            System.out.println("X is greater than all");
        } else if (y>z) {
            System.out.println("Y is greater than all");

        }else{
            System.out.println("Z is greater than all");
        }
    }
}
