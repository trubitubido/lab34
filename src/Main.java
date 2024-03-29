import objects.humans.*;
import objects.things.*;
import enums.Action;
import enums.Dose;
import enums.Feeling;
import enums.Status;

import static objects.things.Room.isFilled;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Louis louis = new Louis("Louis");
        Room room = new Room("room");
        Book psychology_book = new Book("psychology textbook");
        LSD LSD = new LSD("LSD");
        DyingSibyl sibyl = new DyingSibyl("Sibyl", Status.DYING);
        Nurse nurse1 = new Nurse("Nurse");
        Nurse nurse2 = (Nurse) nurse1.clone();
        Thing pinafore = new Thing("pinafore", nurse1);
        Stretchers stretchers = new Stretchers("stretchers", "used for people with spinal or neck injuries");
        Stretchers.End endOfStretchers = new Stretchers.End("end of the stretchers");
        Human joan = new Human("Joan Charlton");
        Human man = new Human("young man");
        Car car = new Car("car");
        Joggers joggers = new Joggers("joggers", Action.RUNNING);
        Human steve = new Human("Steve Masterton");
        Human cop1 = new Human("Campus Security cop");
        Human cop2 = (Human) cop1.clone();
        Thing watch = new Thing("watch", louis);
        Human mary = new Human("Mary", Action.SOBBING);
        Phone phone = new Phone("phone");
        Room room1 = new Room("room", "where Masterton had sequestered the people who had brought Pascow in");

        louis.setFeeling(louis.doLSDAndReflection(LSD, Dose.POWERFUL));
        louis.feel();
        louis.readAboutFeelingsAndLSD(LSD, psychology_book);
        room.fillWithPeople();
        louis.worry();

        louis.think("Like a play staged only for my benefit");
        room.removePeople();
        if (!isFilled) sibyl.sayTo("a few lines of oblique prophecy", louis);
        sibyl.die();
        room.fillWithPeople();

        room.addPeople(nurse1, nurse2);
        nurse1.carryWith(stretchers, stretchers.getDescription(), nurse2);
        room.addPeople(joan);
        joan.say("The campus police is on their way");
        car.strike(man, "was jogging");
        louis.thinkOfJoggers(joggers, "in front of his car", "that morning");

        room.addPeople(steve, cop1, cop2);
        steve.sayTo("The people who brought Pascow in are..", louis);
        System.out.printf("%s broke off. ", steve);
        steve.ask(louis,"are you all right");

        louis.say("I’m okay");
        louis.feel(Feeling.FAINTNESS);
        louis.ask("What's his name");
        cop1.say("Victor Pascow, according to the girl he was jogging with.");

        louis.lookAt(watch, louis);
        louis.act("subtracted two minutes");

        louis.hearSmFrom(mary, room1);
        louis.think("Welcome back to school. Have a nice semester");
        louis.say("Mr. Pascow died at 10:09 A. M.");

        cop1.act("wiped the back of his hand across his mouth");

        steve.ask(louis, "are you really okay");
        steve.sayToAboutLook(louis);
        louis.actTo("opened his mouth", "answer");
        nurse1.drop(endOfStretchers);
        nurse1.setFeeling(Feeling.NAUSEOUS);
        nurse1.runOutOf(room);
        nurse1.vomitDown(pinafore, nurse1);

        phone.ring();
        mary.act("began to scream the dead man’s name");
        mary.scream("Vic! Vic! Vic!", 3);
        cop1.ask(joan, "can we have a blanket to cover him up");
        joan.say("I don't know if I have the authority to requisition one");
        louis.think("Let the wild rumpus start!");

    }

}