package Objects.humans;
import Objects.things.*;

public class Nurse extends Human {
    public Nurse(String name) {
        super(name);
    }

    public void carryWith(Thing thing, String description, Human human) {
        System.out.printf("%s is carrying the %s %s with %s.%n", getName(), thing, description, human);
    }


}
