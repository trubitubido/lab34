package Objects.things;
import Objects.humans.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Room extends Thing {
    public Room(String name) {
        super(name);
    }

    public Room(String name, String description) {
        super(name, description);
    }

    private final ArrayList<Human> inRoom = new ArrayList<>();
    public static int peopleInRoom;
    public static boolean isFilled;
//    private int i = 0;


    public void fillWithPeople() {
        isFilled = true;
        System.out.println("The room has filled up with people.");
    }

    public void removePeople() {
        isFilled = false;
        System.out.println("The room has cleared.");
    }


    public void addPeople(Human... humans) {
        for (Human human : humans) {
            inRoom.add(human);
        }
        peopleInRoom = inRoom.size();
        System.out.printf("%s entered the %s.%n", Arrays.toString(humans), getName());
    }





}
