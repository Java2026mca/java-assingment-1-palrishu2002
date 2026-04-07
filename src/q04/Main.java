import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Multiple test cases handle
        while (sc.hasNextInt()) {
            int n = sc.nextInt();

            // Check Prime
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

            // Check Perfect
            int sum = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            boolean isPerfect = (sum == n && n != 0);

            // FINAL OUTPUT (IMPORTANT)
            if (isPrime) {
                System.out.println("Prime");
            } else if (isPerfect) {
                System.out.println("Perfect");
            } else {
                System.out.println("Neither");
            }
        }
    }
}
