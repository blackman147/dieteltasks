package ChapterSix;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static double distanceOfPointAToPointB(double horizontal1,double vertical1,double horizontal2,double vertical2){
        return (vertical2-vertical1)/(horizontal2-horizontal1);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double distance=0;
        int counter;
        for (counter=0;counter<2;counter++){
            System.out.println("Enter Your horizontal value for point A");
            double h1=scanner.nextDouble();
            System.out.println("Enter Your vertical value for point A");
            double v1=scanner.nextDouble();
            System.out.println("Enter Your horizontal value for point B");
            double h2=scanner.nextDouble();
            System.out.println("Enter Your vertical value for point B");
            double v2=scanner.nextDouble();
            distance=distanceOfPointAToPointB(h1,v1,h2,v2);
            System.out.println(distance+"m");
        }

    }
}
