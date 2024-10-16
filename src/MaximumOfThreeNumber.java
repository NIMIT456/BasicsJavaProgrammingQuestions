import java.util.*;

public class MaximumOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt(),max;

        //Using if-else approach
        if(num1 > num2 && num1 > num3) System.out.println(num1);
        else if(num2 > num1 && num2 > num3) System.out.println(num2);
        else System.out.println(num3);

        //Using ternary Operator
//        max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
//        System.out.println(max);

        //Using Math.max() method(best approach)
//        max = Math.max(Math.max(num1,num2),num3);
//        System.out.println(max);


    }
}
