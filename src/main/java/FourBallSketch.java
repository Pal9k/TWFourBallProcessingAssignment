import processing.core.PApplet;

public class FourBallSketch extends PApplet {

    public static final int HEIGHT = 480;               // height of the screen
    public static final int WIDTH = 640;                // width of the screen
    public static int ellipseLeftMargin1 = 0;           // left margin of ellipse1
    public static int ellipseLeftMargin2 = 0;           // left margin of ellipse2
    public static int ellipseLeftMargin3 = 0;           // left margin of ellipse3
    public static int ellipseLeftMargin4 = 0;           // left margin of ellipse4

    public static void main(String[] args) {
        PApplet.main("FourBallSketch", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ellipse(0, HEIGHT/5, 10, 10);
        ellipse(0, 2*HEIGHT/5, 10, 10);
        ellipse(0, 3*HEIGHT/5, 10, 10);
        ellipse(0, 4*HEIGHT/5, 10, 10);
    }

    @Override
    public void draw() {
        ellipse(ellipseLeftMargin1, HEIGHT/5, 10,10);
        ellipseLeftMargin1 += 1;                                    // speed is been increased by 1 unit
        ellipse(ellipseLeftMargin2, 2*HEIGHT/5, 10,10);
        ellipseLeftMargin2 += 2;                                    // speed is been increased by 2 unit
        ellipse(ellipseLeftMargin3, 3*HEIGHT/5, 10,10);
        ellipseLeftMargin3 += 3;                                    // speed is been increased by 3 unit
        ellipse(ellipseLeftMargin4, 4*HEIGHT/5, 10,10);
        ellipseLeftMargin4 += 4;                                    // speed is been increased by 4 unit
    }
}
