package Objects.humans;

import Objects.things.LSD;

import java.util.StringTokenizer;

public class Man extends Human {
    public Man (String name){
        super(name);
    }

    private String condition;

    public void doLSD() {
        setCondition(Condition.HYPERSENSITIVITY);

    }

}
