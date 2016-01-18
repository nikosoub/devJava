import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
        int [] coordsX=new int[surfaceN];
        int [] coordsY=new int[surfaceN];
        for (int i = 0; i < surfaceN; i++) {
            int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
            int landY = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
            coordsX[i]=landX;
            coordsY[i]=landY;
        }
        int startX=0;
        int endX=0;
        int altitudeArrivee=0;
        for (int i=0;i<coordsY.length-1;i++){
            if (coordsY[i]==coordsY[i+1]){
                startX=coordsX[i];
                endX=coordsX[i+1];
                altitudeArrivee= coordsY[i];
            }
        }
        System.err.println(startX);
        System.err.println(endX);
        System.err.println(altitudeArrivee);
        // game loop
        while (true) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
            int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
            int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
            int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
            int power = in.nextInt(); // the thrust power (0 to 4).

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            System.err.println(Y);
            System.err.println(vSpeed);
            System.err.println(fuel);

            if (X<startX-1000){
                System.out.println("-10 4");
            }
            else{
                if (X>endX+1000){
                    System.out.println("10 4");
                }else{
                    
                
            int vitesse=0;
            int angle=0;
            
            if (vSpeed<=-30){
                vitesse=4;
            }
            if ((vSpeed>-30)&&(vSpeed<=-20)){
                vitesse=3;
            }
            if ((vSpeed>-20)&&(vSpeed<=-10)){
                vitesse=2;
            }
            if ((vSpeed>-10)&&(vSpeed<=-5)){
                vitesse=1;
            }
            if ((vSpeed>-5)&&(vSpeed<=5)){
                vitesse=0;
            }
           
            if (hSpeed<=-30){
                angle=-45;
                vitesse=4;
            }
            if ((hSpeed>-30)&&(hSpeed<=-20)){
                angle=-30;
            }
            if ((hSpeed>-20)&&(hSpeed<=-10)){
                angle=-15;
            }
            if ((hSpeed>-10)&&(hSpeed<=15)){
                if (X<startX){
                    angle=-15;
                }else{
                    if (X>endX){
                        angle=15;
                        }
                        else{
                            angle=0;
                        }
                }
            }
            if ((hSpeed>15)&&(hSpeed<=20)){
                angle=15;
            }
            if ((hSpeed>20)&&(hSpeed<=30)){
                angle=30;
            }
            
            if ((hSpeed>30)&&(hSpeed<=40)){
                angle=45;
            }
           /* if ((hSpeed>40)&&(hSpeed<=60)){
                angle=70;
            }*/
            if (hSpeed>40){
                angle=70;
            }
            
            if (Y<altitudeArrivee+50){
                angle=0;
                vitesse=4;
            }
            
            
            System.out.println(angle+" "+vitesse); // rotate power. rotate is the desired rotation angle. power is the desired thrust power.
        }
            }
        }
    }
}