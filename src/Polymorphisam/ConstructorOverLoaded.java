package Polymorphisam;

public class ConstructorOverLoaded {

       public ConstructorOverLoaded(){
           System.out.println("No parameterised cons");

    }

       public ConstructorOverLoaded(int a){
           System.out.println("One parameterised cons");
    }

      public  ConstructorOverLoaded(int a, int b){
          System.out.println("Two parameterised cons");

    }

       public ConstructorOverLoaded( String name){
           System.out.println("One parameterised cons");
       }

    public static void main(String[] args) {
        ConstructorOverLoaded obj =new ConstructorOverLoaded("Prime");

        ConstructorOverLoaded obj1 = new ConstructorOverLoaded(10,20);

        ConstructorOverLoaded obj2 = new ConstructorOverLoaded(10);

        ConstructorOverLoaded obj3 = new ConstructorOverLoaded();






    }

}







