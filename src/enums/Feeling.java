package enums;

public enum Feeling {
    UNREALITY("unreality"),
    DISORIENTATION("disorientation"),
    ANXIETY("anxiety"),
    FRIGHTENED("frightened"),
    FAINTNESS("faintness"),
    NAUSEOUS("nauseous");

    private final String feeling;

    Feeling(String feeling){
        this.feeling = feeling;
    }

    @Override
    public String toString(){
        return this.feeling;
    }

}
