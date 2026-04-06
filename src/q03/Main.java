int[][] a = new int[n][n];

int top = 0, bottom = n - 1;
int left = 0, right = n - 1;
int num = 1;

// Spiral fill
while (top <= bottom && left <= right) {

    for (int i = left; i <= right; i++)
        a[top][i] = num++;
    top++;

    for (int i = top; i <= bottom; i++)
        a[i][right] = num++;
    right--;

    if (top <= bottom) {
        for (int i = right; i >= left; i--)
            a[bottom][i] = num++;
        bottom--;
    }

    if (left <= right) {
        for (int i = bottom; i >= top; i--)
            a[i][left] = num++;
        left++;
    }
}

// Print matrix
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.print(a[i][j]);
        if (j < n - 1) System.out.print(" ");
    }
    System.out.println();
}

// Diagonal sum
int sum = 0;

for (int i = 0; i < n; i++) {
    sum += a[i][i];           // primary diagonal
    sum += a[i][n - i - 1];   // secondary diagonal
}

// center element double add ho raha hota hai (odd n me)
if (n % 2 == 1) {
    sum -= a[n/2][n/2];
}

System.out.println("Diagonal: " + sum);
