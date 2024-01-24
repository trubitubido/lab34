import Objects.humans.*;
import Objects.things.*;

import static Objects.things.Room.isFilled;

public class Main {
    public static void main(String[] args) {

        Louis louis = new Louis("Louis");
        Room room = new Room("room");
        Door door = new Door("door");
        Book psychology_book = new Book("psychology textbook");
        LSD LSD = new LSD("LSD");
        DyingSibyl sibyl = new DyingSibyl("Sibyl", Status.DYING);
        Nurse nurse1 = new Nurse("Nurse");
        Nurse nurse2 = new Nurse("Nurse");
        Stretchers stretchers = new Stretchers("stretchers", "used for people with spinal or neck injuries");
        JoanCharlton joan = new JoanCharlton("Joan Charlton");
        Man man = new Man("young man");
        Car car = new Car("car");
        Joggers joggers = new Joggers("joggers", Action.RUNNING);
        SteveMasterton steve = new SteveMasterton("Steve Masterton");
        CampusSecurityCop cop1 = new CampusSecurityCop("Campus Security cop");
        CampusSecurityCop cop2 = new CampusSecurityCop("Campus Security cop");


        louis.setFeeling(louis.doLSDAndReflection(LSD, Dose.POWERFUL));
        louis.feel();
        louis.readAboutFeelingsAndLSD(LSD, psychology_book);
        room.fillWithPeople();
        louis.worry();

        System.out.println();
        louis.think("Like a play staged only for my benefit");
        room.removePeople();
        if (!isFilled) sibyl.sayTo("a few lines of oblique prophecy", louis);
        if (sibyl.getStatus() == Status.DEAD) room.fillWithPeople();

        System.out.println();
        room.addPeople(nurse1, nurse2);
        nurse1.carryWith(stretchers, stretchers.getDescription(), nurse2);
        room.addPeople(joan);
        joan.say("The campus police were on their way");
        car.strike(man, "was jogging");
        louis.thinkOfJoggers(joggers, "in front of his car", "that morning");

        System.out.println();
        room.addPeople(steve, cop1, cop2);
        steve.sayTo("the people who brought Pascow in are..", louis);
        System.out.printf("%s broke off. ", steve);
        steve.ask(louis,"are you all right?");

        louis.say("I’m okay");
        louis.feel(Feeling.FAINTNESS);
        louis.ask("What's his name?");
        cop1.say("Victor Pascow, according to the girl he was jogging with.");
    }
}