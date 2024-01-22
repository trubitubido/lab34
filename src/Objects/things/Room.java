package Objects.things;
import Objects.humans.*;
import java.util.ArrayList;

public class Room extends Thing {
    public Room(String name) {
        super(name);
    }

    private final ArrayList<Human> inRoom = new ArrayList<>();
    public static int peopleInRoom;

    public void addPeople(Human... humans) {
        for (Human human: humans) {
            inRoom.add(human);
        };
        System.out.printf("%s people have entered the %s.%n", inRoom.size(), getName());
        peopleInRoom = inRoom.size();
    }

    public void removePeople(Human h, Human... humans) {
        for (Human human: humans) {
            inRoom.clear();
        };
        inRoom.add(h);
        System.out.printf("The %s has cleared.%n", getName());
    }
}
