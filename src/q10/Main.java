import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Integer> st = new Stack<>();

        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                st.push(c-'0');
            } else {
                int b = st.pop();
                int a = st.pop();

                switch(c){
                    case '+': st.push(a+b); break;
                    case '-': st.push(a-b); break;
                    case '*': st.push(a*b); break;
                    case '/': st.push(a/b); break;
                }
            }
        }

        System.out.println(st.pop());
    }
}
