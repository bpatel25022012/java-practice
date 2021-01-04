package inheretance;

public class Dog extends Animal {
    private int tail = 1;

    public static void main(String[] args) {
        Dog obj = new Dog(); // child class object

        obj.name= "Tommy";
        System.out.println(obj.name);
        obj.eat();// parents class method
        obj.move();// parents class method
        obj.barking();// child class method
    }
    public void barking(){
        System.out.println("Dog is barking");
    }
}
