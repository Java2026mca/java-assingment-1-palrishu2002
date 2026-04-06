import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stack = new int[n];
        int top = -1;

        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            stack[++top] = val;
        }

        while(top>=0){
            System.out.print(stack[top--]+" ");
        }
    }
}
