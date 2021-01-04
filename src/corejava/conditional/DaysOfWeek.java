package corejava.conditional;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the nuber of day :");
        int day = scan.nextInt();


        if (day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");

        }else if (day==3) {
            System.out.println("Wednesday");
        }else if (day==4){
                System.out.println("Thursday");
            }else if (day==5){
            System.out.println("Friday");
        }

            else{
            System.out.println("The day is not valid");
        }

    }
}
