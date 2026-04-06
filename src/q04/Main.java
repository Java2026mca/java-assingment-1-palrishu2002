import java.util.*;

public class Main {
    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    static boolean isPerfect(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0) sum+=i;
        }
        return sum==n;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPrime(n));
        System.out.println(isPerfect(n));
    }
}
