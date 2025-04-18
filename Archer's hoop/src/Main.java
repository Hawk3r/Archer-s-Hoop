//Lee, Henson Adrian T.- 12112267
//Sim, Caye Isabelle S.- 12122777
//Submitted to: Prof. Lawrence Materum
//In the course: LBYCPEI
//Section: EQ1

import acm.graphics.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import acm.program.*;
import java.awt.*;

public class Main extends GraphicsProgram{
    public static int n = 0;
    public static int titleremover = 0;
    public int pow= 0;
    public int enter = 5;

    public static void main(String[] args) {(new Main()).start(args);}

    public void run(){
        setSize(765,520);
        addKeyListeners(new MyKeyListener());
        //for the title page
        Title title = new Title(0,0);
        add(title);
        while (true){
            if (titleremover == 1){
                remove(title);
                break;}
            pause(30);}

        //declaration for the ball and player
        GImage ball = new GImage("assets/basketball.png");
        ball.setSize(40,40);
        GImage player = new GImage("assets/shooter.png");
        GRect circle2 = new GRect(1,1);
        add(circle2);

        int score = 0;
        int lives = 5;
        enter = 5;


        while (lives > 0){
            Menu menu = new Menu(lives,score, pow);
            add(menu);
            add(ball);
            add(player);

            ball.setLocation(265+n,210);
            player.setLocation(200+ n, 220);
            circle2.setLocation(284+n,229);


            if (enter < lives){
                remove(ball);
                score = score + shoot(circle2.getX(),circle2.getY(),(pow/4),0 );
                lives --;
                }
            pause(10);}
        Menu menu = new Menu(lives,score, pow);
        add(menu);
        Endscreen end = new Endscreen();
        add(end);
    }

    public int shoot(double x, double y, int pow, double t ){
        GImage ball = new GImage("assets/basketball.png");
        ball.setSize(40,40);
        add(ball);
        GRect circle2 = new GRect(1,1);
        circle2.setColor(Color.BLACK);

        add(circle2);
        int a = 0;

        double xf = x;
        double yf = y;
        double degrees = 60.0;
        double radians = Math.toRadians(degrees);
        double sin = Math.sin(radians);
        while ((yf<600) ){
            xf = x+ (pow*sin*t);
            yf = y- (2*pow-(9.8*t))*t;
            ball.setLocation(xf-19,yf-19);
            circle2.setLocation(xf,yf);
            t = t+0.1;
            if((xf>= 550) && (xf<=600)){
                System.out.println(yf);
                if ((yf >= 200) && (yf <= 220) ) {
                    System.out.println("SCORE");
                    a = 1;
                    break;}
            }
            pause(10);
        }
        remove(ball);
        if (a ==1) return 1;
        else return 0;}

    private class MyKeyListener implements KeyListener {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch(e.getKeyCode()){
                case (KeyEvent.VK_SPACE):
                    titleremover ++ ;
                    break;

                case (KeyEvent.VK_A):
                    if (n+ 200>50)n--;
                    break;

                case (KeyEvent.VK_D):
                    if (n+ 200<450)n++;
                    break;

                case (KeyEvent.VK_W):
                    if (pow<200)pow++;
                    break;

                case (KeyEvent.VK_S):
                    if (pow>0)pow--;
                    break;

                case (KeyEvent.VK_ENTER):
                    enter--;
                    System.out.println("Key 'ENTER' has been pressed! "+enter);
                    break;
            }
        }
        @Override
        public void keyReleased(KeyEvent e) { /* Empty body */ }

        @Override
        public void keyTyped(KeyEvent e) { /* Empty body */ }
    }
}