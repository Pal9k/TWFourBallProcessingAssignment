import processing.core.PApplet;

public class OOPFourBallSketch extends PApplet {

    public static final int WIDTH = 640;                // width of the screen
    public static final int HEIGHT = 480;               // height of the screen
    public static final int numberOfBalls = 4;          // just change this variable and everything will adjust
    Ball[] balls = new Ball[numberOfBalls];

    public static void main(String[] args) {
        PApplet.main("OOPFourBallSketch", args);
    }

    @Override
    public void settings() {
        super.settings();
        settingScreenSize();
    }

    private void settingScreenSize() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        initializeBalls();
    }

    private void initializeBalls() {
        for (int ballNumber = 0; ballNumber < numberOfBalls ; ballNumber++) {
            balls[ballNumber] = new Ball(ballNumber+1);
        }
    }

    @Override
    public void draw() {
        updatingBalls();
    }

    private void updatingBalls() {
        for (int ballNumber = 0; ballNumber < numberOfBalls ; ballNumber++) {
            balls[ballNumber].updateBall();
        }
    }

    class Ball{
        int leftMargin = 0;
        int topMargin;
        int diameter = 10;
        int number;

        public Ball(int no) {
            topMargin = no * HEIGHT / (numberOfBalls + 1);
            number = no;
        }

        public void updateBall(){
            ellipse(leftMargin, topMargin, diameter, diameter);
            leftMargin += number;               // increasing speed of the balls
        }

    }

}


