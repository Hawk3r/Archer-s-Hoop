import acm.graphics.GCompound;

import acm.graphics.GRect;
import acm.graphics.GImage;
import java.awt.*;
import acm.graphics.GLabel;

public class Title extends GCompound{
    public Title(int i, int i1) {
        GImage pic = new GImage( "assets/Ballin.png");
        pic.setSize(750,450);
        add(pic);
        GRect card = new GRect(370,130);
        card.setFilled(true);
        card.setColor(Color.WHITE);
        add(card, 5,315);

        GImage pic2 = new GImage( "assets/logo.png");
        pic2.setSize(100,100);
        add(pic2,650,0);


        GLabel title = new GLabel("Archers' Hoop");
        title.setFont("Comic Sans-40");
        title.setColor(Color.GREEN);
        add(title,400,40);

        String rules0 = ("Rules:");
        String rules = ("1. Use the A and D keys to move");
        String rules2 = "2. Use the W and S keys to set power level";
        String rules3= "3. Press enter to shoot";
        String rules4= "4. screen resets after each shot, you have 5 shots";

        GLabel text0 = new GLabel(rules0);
        text0.setFont("Comic Sans-15");
        add(text0,5,330);


        GLabel text = new GLabel(rules);
        text.setFont("Comic Sans-15");
        add(text,5,350);

        GLabel text2 = new GLabel(rules2);
        text2.setFont("Comic Sans-15");
        add(text2,5,370);

        GLabel text3 = new GLabel(rules3);
        text3.setFont("Comic Sans-15");
        add(text3,5,390);

        GLabel text4 = new GLabel(rules4);
        text4.setFont("Comic Sans-15");
        add(text4,5,410);

        String rules5= "PRESS SPACE TO START";
        GLabel text5 = new GLabel(rules5);
        text5.setFont("Comic Sans-20");
        add(text5,5,440);
    }


}
