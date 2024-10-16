import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //Using Loops
//        while(number>0) {
//            fact = number*fact;
//            number--;
//        }
//        System.out.println(fact);
        printFactorial(number,1);



    }

    //using recursion
    static void printFactorial(int number,int fact){
        if(number==1) {
            System.out.println(fact);
            return;
        }
        fact = fact*number;
        printFactorial(number-1,fact);
    }

}
