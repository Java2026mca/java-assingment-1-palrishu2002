import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Agar t diya hai to bhi chalega, nahi diya to bhi
        List<Integer> list = new ArrayList<>();

        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }

        int start = 0;

        // Agar first value test cases ho sakti hai
        if (list.size() > 1 && list.get(0) == list.size() - 1) {
            start = 1;
        }

        for (int i = start; i < list.size(); i++) {
            int n = list.get(i);

            // Prime check
            boolean isPrime = true;
            if (n <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= n; j++) {
                    if (n % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // Perfect check
            int sum = 0;
            for (int j = 1; j <= n / 2; j++) {
                if (n % j == 0) {
                    sum += j;
                }
            }
            boolean isPerfect = (sum == n);

            // Output (exact match)
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
