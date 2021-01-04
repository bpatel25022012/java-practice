package corejava;

import java.util.Scanner;

public class Methods {

    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int a;
        int b;
        System.out.println("Enter the value of first number");
        a = scan.nextInt();
        System.out.println("Enter the value of second number");
        b = scan.nextInt();

        Methods cal = new Methods();
        cal.addition(a,b);
        substration(a,b);
        cal.multiplication(a,b);
        devision(a,b);


    }

    public void addition(int a , int b){
        int result = a+b;
        System.out.println(result);
    }
    public static void substration(int a , int b){
        int result = a-b;
        System.out.println(result);
    }
    public void multiplication(int a , int b) {
        int result = a * b;
        System.out.println(result);
    }
    public static void devision(int a , int b) {
        int result = a/b;
        System.out.println(result);
    }
}

