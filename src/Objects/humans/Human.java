package Objects.humans;
import interfaces.Feel;
import Objects.things.*;

public class Human implements Feel {

    private final String name;
//    private Condition condition = Condition.HYPERSENSITIVITY;
    private Feeling feeling;
//    private String minds;


    public Human(String name) {
        this.name = name;
    }

//    public Status getStatus() {
//        return status;
//    }

    public String getName() {
        return name;
    }

    public void setFeeling(Feeling f) {
        feeling = f;
    }

    public Feeling getFeeling() {
        return feeling;
    }

//    public void setCondition(Condition condition) {
//        this.condition = condition;
//    }

    public void vomit() {}

    public void think(String minds) {
        System.out.printf("%s, %s thought.%n", minds, getName());
    }

    public void think(String minds1, String minds2) {
        System.out.printf("%s, %s thought.%n%s.%n", minds1, getName(), minds2);
    }

    public void sayTo(String speech, Human human) {}

    public String ask(Human human) {
        return "is asking " + human;
    }

//    public void read(Book book) {}

    public void feel (Feeling feeling) {
        System.out.printf("%s has a feeling of %s.%n", getName(), feeling);
    }

//    public void doLSD(LSD LSD, Feeling feeling1, Feeling feeling2) {
//        System.out.printf("%s has taken %s. %s has feelings of %s and %s.%n", getName(), LSD, getName(), feeling1, feeling2);;
//    }


    

    @Override
    public String toString() {
        return name;
    }




}
