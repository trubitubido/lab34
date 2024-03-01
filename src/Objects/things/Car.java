package Objects.things;
import Objects.humans.*;
import enums.Status;

public class Car extends Thing {
    public Car(String name) {
        super(name);
    }

    public void strike(Human human, String ocassion) {
        System.out.printf("The %s struck %s while %s %s.%n", getName(), human, human, ocassion);
        human.setStatus(Status.STRUCK);
    }

}
