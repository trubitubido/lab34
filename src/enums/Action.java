package enums;

public enum Action {
    RUNNING("running"),
    SOBBING("sobbing");

    private final String action;

    Action(String action) {
        this.action = action;
    }

    @Override
    public String toString(){
        return this.action;
    }

}
