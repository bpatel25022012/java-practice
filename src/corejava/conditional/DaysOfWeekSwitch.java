package corejava.conditional;

import java.util.Scanner;

public class DaysOfWeekSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The Day");
        int day = scan.nextInt();

switch (day){
    case 1 :
        System.out.println("Monday");
        break;
    case 2 :
        System.out.println("Tuesday");
        break;
    case 3 :
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Input is not valid");

}
    }
}
