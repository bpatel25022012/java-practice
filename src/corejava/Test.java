package corejava;

public class Test {
int age = 30;
static String myName = "Chirag";

    public static void main(String[] args) {

        getMyage();
        Test object1= new Test();
        object1.getMyName();


    }



public void getMyName(){

    System.out.println(age);
    System.out.println(Test.myName);

}


public static void getMyage(){
    Test object = new Test();
    System.out.println(object.age);
    System.out.println(myName);

}

}
