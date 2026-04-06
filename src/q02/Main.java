public class Main {
    public static void main(String[] args) {

        int[] tests = {1, 3, 5, 6};

        for (int n : tests) {

            for (int i = 0; i < n; i++) {
                int num = 1;

                for (int j = 0; j <= i; j++) {
                    System.out.print(num);

                    if (j < i) {
                        System.out.print(" ");
                    }

                    num = num * (i - j) / (j + 1);
                }

                System.out.println();
            }
        }
    }
}
