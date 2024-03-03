package objects.things;

public class Phone extends Thing {
    public Phone(String name) {
        super(name);
    }

    public void ring() {
        System.out.printf("The %s is ringing.%n", getName());
    }

}
