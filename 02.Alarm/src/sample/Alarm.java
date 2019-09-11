package sample;

import java.util.List;

public class Alarm {

    private String name;
    private String time;
    private List<String> days;
    private boolean repetition;
    private int volume;

    public Alarm(String name, String time, List<String> days, boolean repetition, int volume) {
        this.name = name;
        this.time = time;
        this.days = days;
        this.repetition = repetition;
        this.volume = volume;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        // name
        output.append(name).append("\n");
        // days
        for(int i = 0; i < days.size(); i++) {
            output.append(days.get(i));
            if(i != days.size()-1) output.append(", ");
            else output.append(": ");
        }
        // time
        output.append(time).append(", ");
        // repetition
        if(repetition) output.append("powtarzaj, ");
        // volume
        output.append("gł: ").append(volume).append("%");

        return output.toString();
    }
}
