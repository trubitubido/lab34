package Objects.humans;

public enum Action {
    RUNNING("running");

    private final String action;

    Action(String action) {
        this.action = action;
    }

    @Override
    public String toString(){
        return this.action;
    }

}
