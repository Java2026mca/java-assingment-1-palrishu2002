import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String shape = sc.next();

        if (shape.equalsIgnoreCase("circle")) {
            double r = sc.nextDouble();
            double area = Math.PI * r * r;
            System.out.printf("Area: %.2f\n", area);
        } 
        else if (shape.equalsIgnoreCase("rectangle")) {
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            double area = l * b;
            System.out.printf("Area: %.2f\n", area);
        } 
        else if (shape.equalsIgnoreCase("triangle")) {
            // 3 sides diye ja rahe hain (Heron's Formula)
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.printf("Area: %.2f\n", area);
        }
    }
}
