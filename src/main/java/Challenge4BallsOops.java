import processing.core.PApplet;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Challenge4BallsOops extends PApplet {

   // public static List<Ball> myChallengeBalls = new LinkedList<Ball>();
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int WHITE = 255;

    Ball firstBall = new Ball(0, HEIGHT/5, 10, 10, 1);
    Ball secondBall = new Ball(0,HEIGHT*(double)2/5,10,10,2);
    Ball thirdBall =new Ball(0,HEIGHT*(3/5.0),10,10,3);
    Ball fourthBall =new Ball(0,HEIGHT*(4/5.0),10,10,4);


    public static void main(String[] args) {

        PApplet.main("Challenge4BallsOops", args);





//        myChallengeBalls.add(firstBall);
//        myChallengeBalls.add(secondBall);
//        myChallengeBalls.add(thirdBall);
//        myChallengeBalls.add(fourthBall);


    }

    @Override

    public void settings() {

        size(640, 480);
    }



    @Override
    public void draw() {
        background(WHITE);

        ellipse((int)firstBall.x, (int)firstBall.y, firstBall.width,firstBall.height);
        firstBall.update();
        ellipse((int)secondBall.x, (int)secondBall.y, secondBall.width,secondBall.height);
        secondBall.update();
        ellipse((int)thirdBall.x, (int)thirdBall.y, thirdBall.width,thirdBall.height);
        thirdBall.update();
        ellipse((int)fourthBall.x, (int)fourthBall.y, fourthBall.width,fourthBall.height);
        fourthBall.update();








    }
}
