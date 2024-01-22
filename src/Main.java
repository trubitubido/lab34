import Objects.humans.*;
import Objects.things.*;

//import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Louis Louis = new Louis("Louis");


        Room room = new Room("room");
        Door door = new Door("door");
        Book psychology_book = new Book("psychology textbook");
        LSD LSD = new LSD("LSD");
        Stretcher stretchers = new Stretcher("stretchers");
//        Man man = new Man("man");
        Human human1 = new Human("human1");
        Human human2 = new Human("human2");
        Human human3 = new Human("human3");
        Human human4 = new Human("human4");
//        Human human5 = new Human("human5");

        Louis.reflection();
        Louis.readAbout(Feeling.UNREALTY, Feeling.DISORIENTATION, psychology_book);


        room.addPeople(Louis, human1, human2, human3, human4);
        Louis.worry(Feeling.FEAR);
        Louis.think("It was the way a person would feel shortly after someone had slipped a powerful dose of LSD into his drink");
        Louis.think("Like a play staged only for my benefit", "The room is first conveniently cleared so the dying Sibyl can speak " +
                "a few lines of oblique prophecy to me and me alone, and as soon as he’s dead, everyone comes back.");




    }
}