package Objects.humans;

import Objects.things.*;
import static Objects.things.Room.isFilled;


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
        return human.getFeeling();
    }

//


    @Override
    public void feel () {
        if (doneLSD) {
            if (getFeeling() == Feeling.ANXIETY) {
                System.out.printf("%s has feelings of %s and %s.%n", getName(), Feeling.DISORIENTATION, Feeling.UNREALTY);
            }
            else {
                System.out.printf("%s has a feeling of %s.%n", getName(), getFeeling());
            }
        }
    }


    public void readAboutFeelingsAndLSD(LSD LSD, Book book) {
        System.out.printf("%s read about %s and %s in %s.%n", getName(), Feeling.UNREALTY, Feeling.DISORIENTATION, book);
        System.out.printf("It is how a person feels shortly after taking a %s dose of %s.%n", Dose.POWERFUL, LSD);
    }


    public void worry () {
        if ((doneLSD) && (isFilled)) System.out.printf("%s is %s.%n", getName(), Feeling.FRIGHTENED);
    }

    public void thinkOfJoggers(Human human, String detail, String time) {
        System.out.printf("%s thought of the %s %s %s %s.%n", getName(), human, human.getAction(), detail, time);
    }




}

