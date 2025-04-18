import acm.graphics.GCompound;

import acm.graphics.GRect;
import acm.graphics.GImage;
import java.awt.*;
import acm.graphics.GLabel;

public class Endscreen extends GCompound{
    public Endscreen(){
        GRect aa = new GRect(500,200);
        aa.setFilled(true);
        aa.setColor(Color.GRAY);
        add(aa,100,150);
        GLabel shots = new GLabel("Thank you for playing!");
        shots.setFont("Comic Sans-30");
        shots.setColor(Color.GREEN);
        add(shots, 200,200);
        GLabel end2 = new GLabel("Please exit and reopen if you want to play again");
        end2.setFont("Comic Sans-20");
        end2.setColor(Color.GREEN);
        add(end2, 150,250);




        GLabel end3 = new GLabel("Made by Henson Lee and Caye Sim");
        end3.setFont("Comic Sans-20");
        end3.setColor(Color.GREEN);
        add(end3, 170,280);

    }

}
