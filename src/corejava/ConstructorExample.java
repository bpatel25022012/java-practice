package corejava;

public class ConstructorExample {// class

    // user define zero arg constructor
    public ConstructorExample(){
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }

    // user degined parameterize constructor

    public ConstructorExample(int a, int b){

        System.out.println(a + b);

    }

    public static void main(String[] args) {
        ConstructorExample ce = new ConstructorExample();
        ConstructorExample df = new ConstructorExample(30 , 50 );
        System.out.println("This is main method");
    }




}




