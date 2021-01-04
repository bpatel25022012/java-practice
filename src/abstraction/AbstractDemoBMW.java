package abstraction;

public class AbstractDemoBMW extends AbstractCars {


    @Override
    public void abc(int a) {

    }

    @Override
    public void engineStart(String keyType, int numofCy1) {

    }

    public static void main(String[] args) {

        AbstractDemoBMW ab = new AbstractDemoBMW();
        ab.setPrivateSpeed(10);
        ab.engineStart("keyless", 4);

    }
}

