

public class Ball  {


    public static final int WHITE = 255;
    public double   x;
    public  double y;
    public final int width;
    public final int height;
    private final int  speed;
    public final int xMAx=640;

    public Ball(double x, double y, int width, int height, int speed) {


        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }




    public void update() {
        this.x+=speed;


        if (this.x>=this.xMAx)this.x=0;
    }
}
