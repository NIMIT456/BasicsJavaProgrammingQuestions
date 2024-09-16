import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), rev = 0;
        int temp = n;

        //Reverse a number
        while(n>0) {
            rev = (rev*10) + n%10;
            n /= 10;
        }

        System.out.println(rev);
        if(temp == rev) System.out.println(temp+" is a palindrome");
        else System.out.println(temp+" is not a palindrome");
    }

}
