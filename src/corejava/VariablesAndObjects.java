package corejava;

public class VariablesAndObjects {
    int a;
    int b = 10;
    String name = "Bhavesh";
    String name1 = "Patel";

    // static variables , global variables
    static int e = 500;
    static String f = "India";

    public static void main(String[] args) {

        //local variables
        int c = 20;
        String d = "Hello";

        // accessing static variables in static area
        System.out.println(e);
        System.out.println(f);

        // object creation, accessing instance variable in static area

        VariablesAndObjects abc = new VariablesAndObjects();
        System.out.println(abc.b);
        System.out.println(abc.name);
        System.out.println(abc.name1);

    }

    //
    public void instanceMethod() {

        // instance area
        System.out.println();
        System.out.println();

        //accessing static variable into instance area
        System.out.println(VariablesAndObjects.e);
        System.out.println(VariablesAndObjects.f);
    }

    //
    public static void staticMethod() {

        // static area
        VariablesAndObjects abc = new VariablesAndObjects();
        System.out.println(abc.name);

    }


}
