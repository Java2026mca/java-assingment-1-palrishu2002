import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();

        if(type==1){
            double r = sc.nextDouble();
            System.out.println(Math.PI*r*r);
        }
        else if(type==2){
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            System.out.println(l*b);
        }
        else if(type==3){
            double b = sc.nextDouble();
            double h = sc.nextDouble();
            System.out.println(0.5*b*h);
        }
    }
}
