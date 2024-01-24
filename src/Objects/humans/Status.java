package Objects.humans;

public enum Status {
    ALIVE("alive"),
    DYING("dying"),
    DEAD("dead"),
    STRUCK("struck");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return this.status;
    }

}
