package Objects.humans;

public enum Look {
    TERRIBLE("terrible");

    private final String look;

    Look (String look) {
        this.look = look;
    }

    @Override
    public String toString() {
        return look;
    }
}
