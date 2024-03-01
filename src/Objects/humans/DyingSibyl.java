package Objects.humans;


import enums.Status;

public class DyingSibyl extends Human {
    public DyingSibyl(String name, Status status) {
        super(name, status);
    }

    @Override
    public void sayTo (String speech, Human human) {
        System.out.printf("%s %s is speaking %s to %s.%n", getStatus(),getName(), speech, human);
    }



}
