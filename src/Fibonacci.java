import java.util.*;

public class Fibonacci {

    static int firstTerm = 0,secondTerm = 1,sumValue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nthTerm = sc.nextInt();
        System.out.print(firstTerm+" "+secondTerm);

//        int firstTerm = 0, secondTerm = 1, sumValue;

          //Using Loops or without recursion
//        for(int i=2; i<nthTerm; i++){
//            sumValue = firstTerm + secondTerm;
//            System.out.print(" "+sumValue);
//            firstTerm = secondTerm;
//            secondTerm = sumValue;
//        }

        //Using Recursion
        printFibonacci(nthTerm-2);



    }

    static void printFibonacci(int nthTerm){
        if(nthTerm>0){
            sumValue = firstTerm + secondTerm;
            System.out.print(" " + sumValue);

            firstTerm = secondTerm;
            secondTerm = sumValue;
            printFibonacci(nthTerm-1);
        }

    }


}
