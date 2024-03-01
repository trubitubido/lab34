package enums;

public enum Dose {
    SMALL("small"),
    POWERFUL("powerful");

    private final String name;

    Dose(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
