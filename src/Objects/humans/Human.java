package objects.humans;
import enums.Action;
import enums.Feeling;
import enums.Look;
import enums.Status;
import exceptions.DeadException;
import interfaces.Feel;
import objects.things.*;


public class Human implements Feel {

    private final String name;
    private Status status;
    private Feeling feeling;
    private Action action;
    private Look look;


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

    public Look getLook() {
        return look;
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

    public void setAction(Action act) {
        action = act;
    }

    public void setLook(Look l) {
        look = l;
    }

    public void think(String minds) {
        System.out.printf("“%s”, %s thought.%n", minds, getName());
    }

    public void sayTo(String speech, Human human) {
        System.out.printf("“%s”, %s said to %s.%n", speech, getName(), human);
    }

    public void sayToAboutLook(Human human) {
        System.out.printf("“You look %s”, %s said to %s.%n", human.getLook(), getName(), human);
    }

    public void say(String speech) {
        System.out.printf("“%s”, %s said.%n", speech, getName());
    }

    public void scream(String screaming, int screams) {
        if (screams >= 3) System.out.printf("“%s” - %s is screaming over and over.%n", screaming, getName());
        else System.out.printf("“%s”, %s is screaming", screaming, getName());
    }

    public void ask(Human human, String question) {
        System.out.printf("“%s, %s?”, %s asked.%n", human, question, getName());
    }

    public void ask(String question) {
        System.out.printf("“%s?”, %s asked.%n", question, getName());
    }

    @Override
    public void feel (Feeling feeling) {
        System.out.printf("%s has a feeling of %s.%n", getName(), feeling);
    }

    @Override
    public void feel () {}

    public void die() throws DeadException {
        if (getStatus() == Status.DEAD) throw new DeadException(String.format("Person %s is already dead.%n", getName()));
        setStatus(Status.DEAD);
        System.out.printf("%s is %s.%n", getName(), getStatus());
    }

    public void act(String action) {
        System.out.printf("%s %s.%n", getName(), action);
    }

    public void actTo(String action, String purpose) {
        System.out.printf("%s %s to %s.%n", getName(), action, purpose);
    }

    public void runOutOf(Room room) {
        System.out.printf("%s ran out of the %s.%n", getName(), room);
    }

    public void lookAt(Thing thing, Human human) {
        if (thing.getBelonging() == human) System.out.printf("%s has looked at his/her %s.%n", getName(), thing);
        else System.out.printf("%s has looked at %s's %s.%n", getName(), thing.getBelonging(), thing);
    }

    public void vomitDown(Thing thing, Human human) {
        if (getFeeling() == Feeling.NAUSEOUS) {
            System.out.printf("%s feels %s.%n", getName(), getFeeling());
            if (thing.getBelonging() == human) System.out.printf("%s is vomiting down his/her %s.%n", getName(), thing);
            if (thing.getBelonging() != human) System.out.printf("%s is vomiting down %s's %s.%n", getName(), thing.getBelonging(), thing);
        }
    }

    @Override
    public String toString() {
        return name;
    }




}
