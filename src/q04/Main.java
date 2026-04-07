import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String shape = sc.next();

        if (shape.equalsIgnoreCase("circle")) {
            double r = sc.nextDouble();
            double area = Math.PI * r * r;
            System.out.printf("%.2f\n", area);
        } 
        else if (shape.equalsIgnoreCase("rectangle")) {
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            double area = l * b;
            System.out.printf("%.2f\n", area);
        } 
        else if (shape.equalsIgnoreCase("triangle")) {
            double base = sc.nextDouble();
            double height = sc.nextDouble();
            double area = 0.5 * base * height;
            System.out.printf("%.2f\n", area);
        }
    }
}
