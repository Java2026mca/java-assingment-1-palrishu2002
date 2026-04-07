import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         for (int i = 0; i < n; i++) {
    int x = sc.nextInt();

    // Check Prime
    boolean isPrime = true;
    if (x <= 1) isPrime = false;
    for (int j = 2; j * j <= x; j++) {
        if (x % j == 0) {
            isPrime = false;
            break;
        }
    }

    // Check Perfect
    int sum = 0;
    for (int j = 1; j <= x / 2; j++) {
        if (x % j == 0) {
            sum += j;
        }
    }
    boolean isPerfect = (sum == x && x != 0);

    // Output
    if (isPrime && isPerfect) {
        System.out.println("Both");
    } else if (isPrime) {
        System.out.println("Prime");
    } else if (isPerfect) {
        System.out.println("Perfect");
    } else {
        System.out.println("Neither");
    }
}
        // TODO: Read n integers. For each number print:
        //   "Prime"     if it is prime
        //   "Perfect"   if it is a perfect number (sum of proper divisors == itself, e.g. 6=1+2+3)
        //   "Both"      if it is both (there are none < 100, but handle it)
        //   "Neither"   otherwise
        //
        // Input:
        // 4
        // 6 13 8 28
        //
        // Output:
        // Perfect
        // Prime
        // Neither
        // Perfect

    }
}
