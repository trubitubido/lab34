package Objects.humans;
import interfaces.Feel;
import Objects.things.*;

import java.util.ArrayList;

abstract public class Human implements Feel {

    private final String name;
    private Status status;
    private Feeling feeling;
    private Feeling feeling1;
    private Feeling feeling2;
    private Action action;

    protected final ArrayList<Feeling> feelings = new ArrayList<>();


    public Human(String name) {
        this.name = name;
    }

    public Human(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public Human(String name, Action action) {
        this.name = name;
        this.action = action;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public Action getAction() {
        return action;
    }

    public void setFeeling(Feeling f) {
        feeling = f;
    }

    public Feeling getFeeling() {
        return feeling;
    }

    public void setStatus(Status stat) {
        status = stat;
    }

    public void setAction(Action action) {
        action = action;
    }

    public void think(String minds) {
        System.out.printf("%s, %s thought.%n", minds, getName());
    }

//    public void thinkOf(Human human, String detail, String time) {
//        System.out.printf("%s thought of the %s %s %s %s.%n", getName(), human, human.getAction(), detail, time);
//    }

//    public void think(String minds1, String minds2) {
//        System.out.printf("%s, %s thought.%n%s.%n", minds1, getName(), minds2);
//    }

    public void sayTo(String speech, Human human) {}

    public void say(String speech) {
        System.out.printf("“%s”, %s said.%n", speech, getName());
    }

    public void ask(Human human, String speech) {
        System.out.printf("“%s, %s”, %s asked.%n", human, speech, getName());
    }

    public void ask(String speech) {
        System.out.printf("“%s”, %s asked.%n", speech, getName());
    }

    @Override
    public void feel (Feeling feeling) {
        System.out.printf("%s has a feeling of %s.%n", getName(), feeling);
    }

    @Override
    public void feel (Feeling feeling1, Feeling feeling2) {
        System.out.printf("%s has feelings of %s and %s", getName(), feeling1, feeling2);
    }

    @Override
    public void feel () {}

    @Override
    public String toString() {
        return name;
    }




}
