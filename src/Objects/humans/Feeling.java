package Objects.humans;

public enum Feeling {
    UNREALTY("unreality"),
    DISORIENTATION("disorientation"),
    DESPAIR("despair"),
    FEAR("fear"),
    ANXIETY("anxiety"),
    FRIGHTENED("frightened"),
    FAINTNESS("faintness");

    private final String feeling;

    Feeling(String feeling){
        this.feeling = feeling;
    }

    @Override
    public String toString(){
        return this.feeling;
    }

}
