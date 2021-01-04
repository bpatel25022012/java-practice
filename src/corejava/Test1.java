package corejava;

public class Test1 {

    public static void main(String[] args) {

        Test1 t = new Test1();
        t.myFirstMethod();
        t.mySecondMethod(5, 6);
        int value = myThirdMethod();
        System.out.println(5+myThirdMethod());
        String z = t.myForthMethod("Prime", "Testing", 10,20);

    }

    // with no return  with no parameters

    public void myFirstMethod() {

        int a = 100;
        int b = 200;
        int result = a + b;


        //  System.out.println(result);

    }
    // with no return  with parameters

    private void mySecondMethod(int c, int d) { // intialise the variable but not value

        int result = c + d;
        System.out.println(result);


    }

    // with return type with no paramters

    protected static int myThirdMethod() {
        int e = 1;
        int f = 2;
        int result = e + f;

        return result;



    }

    // with return type with parameters

String myForthMethod(String firstName, String secondName, int g, int h)  {

        firstName = "Prime";
        secondName = "Testing";

        String fullName = firstName+secondName;
        int result = g+h;
        return fullName;







    }


}





