package Objects.humans;

public class SteveMasterton extends Human {
    public SteveMasterton(String name) {
        super(name);
    }

    @Override
    public void sayTo(String speech, Human human) {
        System.out.printf("%s, %s.%n", human, speech);
    }

}
