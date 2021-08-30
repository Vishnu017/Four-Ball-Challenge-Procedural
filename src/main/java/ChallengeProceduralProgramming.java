import processing.core.PApplet;


public class ChallengeProceduralProgramming extends PApplet {


    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int WHITE = 255;
    public static final int BALLWIDTH = 10;
    public static final int BALLHEIGHT = 10;
    private int x2=0;
    private int x1=0;
    private int x3=0;
    private int x4=0;


    public static void main(String[] args) {

        PApplet.main("ChallengeProceduralProgramming", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {
        background(WHITE);
        drawFirstBall();
        drawSecondBall();
        drawThirdBall();
        drawFourthBall();

    }

    private void drawFourthBall() {
        ellipse(x4, (int) (HEIGHT*(4/5.0)), BALLWIDTH, BALLHEIGHT);
        x4+=4;
        if (x4>=WIDTH)x4=0;
    }

    private void drawThirdBall() {
        ellipse(x3, (int) (HEIGHT*(3/5.0)),BALLWIDTH,BALLHEIGHT);
        x3+=3;
        if (x3>=WIDTH)x3=0;

    }

    private void drawSecondBall() {
        ellipse(x2, (int) (HEIGHT*(2/5.0)),BALLWIDTH,BALLHEIGHT);
        x2+=2;
        if (x2>=WIDTH)x2=0;

    }

    private void drawFirstBall() {

        ellipse(x1,HEIGHT/5,BALLWIDTH,BALLHEIGHT);
        x1+=1;
        if (x1>=WIDTH)x1=0;

    }



}
