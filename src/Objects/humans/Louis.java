package Objects.humans;

import Objects.things.*;

import static Objects.things.Room.peopleInRoom;


public class Louis extends Human {
    public Louis(String name){
        super(name);
    }

    public boolean doneLSD;

    public Feeling reflection() {
        var human = new Human(getName()) {
            public void doLSD() {
                System.out.printf("%s has taken LSD.%n", getName());
                setFeeling(Feeling.DISORIENTATION);
                setFeeling(Feeling.UNREALTY);
                doneLSD = true;
            }
        };
        human.doLSD();
        return human.getFeeling();
    }



    public void readAbout (Feeling feeling1, Feeling feeling2, Book book) {
        System.out.printf("%s read about %s and %s in %s.%n", getName(), feeling1, feeling2, book);
    }

    public void worry (Feeling feeling) {
        if ((doneLSD) && (peopleInRoom >= 5)) System.out.printf("%s has a feeling of %s.%n", getName(), feeling);
    }





}

