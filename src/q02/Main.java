for (int i = 0; i < n; i++) {
    int num = 1;

    for (int j = 0; j <= i; j++) {
        System.out.print(num);

        // space only between numbers
        if (j < i) {
            System.out.print(" ");
        }

        num = num * (i - j) / (j + 1);
    }

    // new line (every row)
    if (i < n - 1) {
        System.out.println();
    }
}
