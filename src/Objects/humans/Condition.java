package Objects.humans;

public enum Condition {
    HYPERSENSITIVITY("hypersensitivity");

    private String condition;

    Condition (String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return condition;
    }


}
