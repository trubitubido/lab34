package Objects.things;

public abstract class Thing {
    private final String name;
    public Thing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
