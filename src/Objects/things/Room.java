package Objects.things;
import Objects.humans.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Room extends Thing {
    public Room(String name) {
        super(name);
    }

    private final ArrayList<Human> inRoom = new ArrayList<>();
    public static int peopleInRoom;
    public static boolean isFilled;
//    private int i = 0;


    public void fillWithPeople() {
        isFilled = true;
        System.out.println("The room has filled up with people.");
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void removePeople() {
        isFilled = false;
        System.out.println("The room has cleared.");
    }

//    public void addPeople(Human... humans) {
//        for (Human human : humans) {
//            inRoom.add(human);
//        }
//        if (i == 0) peopleInRoom = inRoom.size();
//        if (i == 1) peopleInRoom = inRoom.size() - 2;
//        if (i == 2) peopleInRoom = inRoom.size() - 6;
//
//        if (i == 2) System.out.printf("%s %ss entered the %s.%n", peopleInRoom, Arrays.toString(humans), getName());
//        else System.out.printf("%s people have entered the %s.%n", peopleInRoom, getName());
//        i += 1;
//        System.out.println(i);
//    }

    public void addPeople(Human... humans) {
        for (Human human : humans) {
            inRoom.add(human);
        }
        peopleInRoom = inRoom.size();
        System.out.printf("%s entered the %s.%n", Arrays.toString(humans), getName());
    }


//    public void removePeople(Human human1, Human human2, Human... humans) {
//        for (Human human : humans) {
//            inRoom.remove(human);
//        }
//        inRoom.add(human1);
//        inRoom.add(human2);
//        peopleInRoom = inRoom.size();
//        System.out.printf("The %s has cleared. %s and %s remained.%n", getName(), human1, human2);
//    }

}
