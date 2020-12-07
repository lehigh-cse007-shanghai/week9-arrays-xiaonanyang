package lehigh;

import processing.core.PApplet;

import java.util.ArrayList;

import static javax.swing.plaf.basic.BasicGraphicsUtils.drawString;

public class Ball extends PApplet {
    class Balls{
        int x;
        int y;
        int speedX;
        int speedY;
        float [] color;
        Balls(){
            x=(int)random(50,450);
            y=(int)(random(50,450));
            speedX=(int)(random(1,5));
            speedY=(int)(random(1,5));
            color=new float[]{random(1.0f),random(1.0f),random(1.0f)};
        }
    }

    ArrayList<Balls> ball=new ArrayList();




    public void settings(){
        size(500, 500);
    ball=new ArrayList<>();
    for (int i=0;i<10;i++){
        ball.add(new Balls());
    }
    }

    public void draw() {
        background(255);
        fill(255);

        for(int i=0;i<ball.size();i++){
        ellipse(ball.get(i).x,ball.get(i).y ,20,20);

        ball.get(i).x=ball.get(i).x+ball.get(i).speedX;
        ball.get(i).y=ball.get(i).y+ball.get(i).speedY;
        }

        for (int j=0;j<ball.size();j++){
            if (ball.get(j).x<40||ball.get(j).x>460){
                ball.get(j).speedX*=-1;
            }
            if(ball.get(j).y<40||ball.get(j).y>460){
                ball.get(j).speedY*=-1;
            }
            if(mousePressed){
                if(Math.abs(mouseX-ball.get(j).x)<10&&Math.abs(mouseY-ball.get(j).y)<10){
                    ball.remove(j);
                }
            }
        }

    }




    public static void main(String[] args){
        String[] processingArgs = {"MovingBalls"};
        Ball Ball = new Ball();
        PApplet.runSketch(processingArgs, Ball);
    }
}
