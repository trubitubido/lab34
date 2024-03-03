package objects.things;
import objects.humans.Human;

public class Thing {
    private final String name;
    private int quantity;
    private String description;
    private Human belonging;


    public Thing(String name) {
        this.name = name;
    }

    public Thing(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Thing(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Thing(String name, Human human) {
        this.name = name;
        this.belonging = human;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Human getBelonging() {
       return belonging;
    }

    @Override
    public String toString() {
        return name;
    }

}
