import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();

            // Prime check
            boolean isPrime = true;
            if (n <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i * i <= n; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // Perfect check
            int sum = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            boolean isPerfect = (sum == n);

            // FINAL OUTPUT
            if (isPerfect) {
                System.out.println("Perfect");
            } else if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Neither");
            }
        }
    }
}
