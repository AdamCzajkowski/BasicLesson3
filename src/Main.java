import java.util.Scanner;

public class Main {
    // Author: Adam Czajkowski
    // Date: November 2018

    public static int submitInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Submit number: ");
        int a = scanner.nextInt();
        return a;
    }
    ////////////////////////////////////////////////////////////////
    // exercise 1 - sroting 3 numbers without using sort method/////
    ////////////////////////////////////////////////////////////////

    public static void threeNumbers(int a, int b, int c){
        if(a > b){
            if(a > c) {
                if (c > b) {
                    System.out.println(a + " " + c + " " + b);
                } else {
                    System.out.println(a + " " + b + " " + c);
                }
            } else {
                System.out.println(c + " " + a + " " + b);
                }
        } else {
            if(b > c){
                if(a > c){
                    System.out.println(b + " " + a + " " + c);
                } else {
                    System.out.println(b + " " + c + " " + a);
                    }
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // exercise 2 - Program will check if is possibility to make triagle with lengths submitted by user////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    public static boolean triagle(int a, int b, int c) {
        if (a+b > c && b+c > a && a+c > b){
            return true;
        } else {
            return false;
        }

}
    public static void main(String[] args) {
        System.out.println(triagle(submitInt(), submitInt(), submitInt()));

    }

}


