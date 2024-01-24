package Objects.things;

public abstract class Thing {
    private final String name;
    private int quantity;
    private String description;

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

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
