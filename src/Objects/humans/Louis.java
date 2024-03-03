package objects.humans;

import objects.things.*;
import enums.Dose;
import enums.Feeling;
import enums.Look;
import exceptions.NotEmptyException;

import static objects.things.Room.isFilled;


public class Louis extends Human {

    public Louis(String name) {
        super(name);
    }


    public boolean doneLSD;

    public Feeling doLSDAndReflection(LSD LSD, Dose dose) {
        var human = new Human(getName()) {
            public void doLSD() {
                if (dose == Dose.POWERFUL) {
                    System.out.printf("%s has taken a %s dose of %s.%n", getName(), dose, LSD);
                    setFeeling(Feeling.ANXIETY);
                }
                if (dose == Dose.SMALL) {
                    System.out.printf("%s has taken %s dose of %s.%n", getName(), dose, LSD);
                    setFeeling(Feeling.DISORIENTATION);
                }
                doneLSD = true;
            }
        };
        human.doLSD();
        setLook(Look.TERRIBLE);
        return human.getFeeling();
    }



    @Override
    public void feel() {
        if (doneLSD) {
            if (getFeeling() == Feeling.ANXIETY) {
                System.out.printf("%s has feelings of %s and %s.%n", getName(), Feeling.DISORIENTATION, Feeling.UNREALITY);
            }
            else {
                System.out.printf("%s has a feeling of %s.%n", getName(), getFeeling());
            }
        }
    }


    public void readAboutFeelingsAndLSD(LSD LSD, Book book) {
        System.out.printf("%s read about %s and %s in %s.%n", getName(), Feeling.UNREALITY, Feeling.DISORIENTATION, book);
        System.out.printf("It is how a person feels shortly after taking a %s dose of %s.%n", Dose.POWERFUL, LSD);
    }

    public void worry() {
        try {
            if (doneLSD && isFilled) System.out.printf("%s is %s.%n", getName(), Feeling.FRIGHTENED);
            if (doneLSD && !isFilled) throw new NotEmptyException("The room is empty. Nothing to worry about.");
        }
        catch (NotEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    public void thinkOfJoggers(Human human, String detail, String time) {
        System.out.printf("%s thought of the %s %s %s %s.%n", getName(), human, human.getAction(), detail, time);
    }

    public void hearSmFrom(Human human, Room room) {
        System.out.printf("%s is hearing %s %s from the %s %s.%n", getName(), human, human.getAction(), room, room.getDescription());
    }


}

