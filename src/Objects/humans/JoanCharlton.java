package Objects.humans;

public class JoanCharlton extends Human {
    public JoanCharlton(String name) {
        super(name);
    }

    @Override
    public void say(String speech) {
        System.out.printf("%s, %s is saying.%n", speech, getName());
    }

}
