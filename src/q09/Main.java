import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        int[][] A = new int[r1][c1];

        for(int i=0;i<r1;i++)
            for(int j=0;j<c1;j++)
                A[i][j] = sc.nextInt();

        int r2 = sc.nextInt(), c2 = sc.nextInt();
        int[][] B = new int[r2][c2];

        for(int i=0;i<r2;i++)
            for(int j=0;j<c2;j++)
                B[i][j] = sc.nextInt();

        int[][] C = new int[r1][c2];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    C[i][j] += A[i][k]*B[k][j];
                }
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
