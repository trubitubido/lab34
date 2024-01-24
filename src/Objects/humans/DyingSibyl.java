package Objects.humans;


public class DyingSibyl extends Human {
    public DyingSibyl(String name, Status status) {
        super(name, status);
    }

    @Override
    public void sayTo (String smth, Human human) {
        System.out.printf("%s %s is speaking %s to %s.%n", getStatus(),getName(), smth, human);
//        saidProphecy = true;
        setStatus(Status.DEAD);
        System.out.printf("%s is %s.%n", getName(), getStatus());
    }

}
