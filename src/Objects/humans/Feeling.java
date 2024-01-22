package Objects.humans;

public enum Feeling {
    UNREALTY("unreality"),
    DISORIENTATION("disorientation"),
    DESPAIR("despair"),
    FEAR("fear");


    private final String feeling;

    Feeling(String feeling){
        this.feeling = feeling;
    }

    @Override
    public String toString(){
        return this.feeling;
    }

}
