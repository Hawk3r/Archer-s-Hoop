import acm.graphics.GCompound;

import acm.graphics.GRect;
import acm.graphics.GImage;
import java.awt.*;
import acm.graphics.GLabel;


public class Menu extends GCompound{
    public Menu ( int lives, int score, int power){
        GImage pic = new GImage( "assets/hoop.png");
        add(pic, 550, 115);

        GRect element = new GRect(300,30);
        element.setFilled(true);
        element.setColor(Color.GRAY);
        add(element);

        GLabel shots = new GLabel("Shots left: "+ lives + "         Score: "+ score);
        shots.setFont("Comic Sans-20");
        shots.setColor(Color.GREEN);
        add(shots, 20,20);

        GRect pow = new GRect(30,200);
        pow.setFilled(true);
        pow.setColor(Color.GRAY);
        add(pow, 10,100);

        GRect pow2 = new GRect(30,0+power);
        pow2.setFilled(true);
        pow2.setColor(Color.ORANGE);
        add(pow2);
        pow2.setLocation(10, 300-power);

        GRect rect = new GRect(50,10);
        rect.setColor(Color.ORANGE);
        //add(rect, 550,200);
    }
}
