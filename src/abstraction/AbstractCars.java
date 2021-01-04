package abstraction;

public abstract class AbstractCars {

    private int privateSpeed;

    public void setPrivateSpeed(int speed){
        this.privateSpeed = speed;

    }

    public void engineStart(){
        System.out.println("Engine Started");
    }
    public abstract void abc(int a);
    public abstract void engineStart(String keyType, int numOfCy1);

}
