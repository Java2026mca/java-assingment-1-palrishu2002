import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

int top = 0, bottom = n - 1;
int left = 0, right = n - 1;
int num = 1;

// Fill spiral
while (top <= bottom && left <= right) {

    // left → right
    for (int i = left; i <= right; i++) {
        arr[top][i] = num++;
    }
    top++;

    // top → bottom
    for (int i = top; i <= bottom; i++) {
        arr[i][right] = num++;
    }
    right--;

    // right → left
    if (top <= bottom) {
        for (int i = right; i >= left; i--) {
            arr[bottom][i] = num++;
        }
        bottom--;
    }

    // bottom → top
    if (left <= right) {
        for (int i = bottom; i >= top; i--) {
            arr[i][left] = num++;
        }
        left++;
    }
}

// Print matrix
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.print(arr[i][j]);
        if (j < n - 1) System.out.print(" ");
    }
    System.out.println();
}

// Diagonal sum
int sum = 0;
for (int i = 0; i < n; i++) {
    sum += arr[i][i];
}

System.out.println("Diagonal: " + sum);
        // TODO: Fill an N×N matrix in clockwise spiral order starting from 1
        //       Print each row with values separated by single space
        //       Then print: "Diagonal: X" where X = sum of primary diagonal (top-left to bottom-right)
        //
        // Input: 3
        // Output:
        // 1 2 3
        // 8 9 4
        // 7 6 5
        // Diagonal: 15

    }
}
