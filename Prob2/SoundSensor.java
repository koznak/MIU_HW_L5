package L5.Prob2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor  implements Sensor{
    private String location;
    private double level;
    private LocalTime lastUpdated;

    public SoundSensor(String location, double soundLevel) {
        this.location = location;
        this.level = soundLevel;
        this.lastUpdated = LocalTime.now();
    }
    @Override
    public String getSensorType() {
        return "Sound";
    }

    @Override
    public double getReading() {
        return this.level;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public String getLastUpdated() {
        lastUpdated = LocalTime.now();
        return lastUpdated.format(DateTimeFormatter.ofPattern("hh:mm a"));
    }

    @Override
    public String performAction() {
        if (this.level > 70) {
            return "an alert to turn on noise cancellation";
        } else {
            return "Sound is within normal range";
        }
    }

    @Override
    public String toString() {
        return "Sensor Type: " + getSensorType() + "\n" +
                "Reading: " + String.format("%.1f", getReading()) + "\n" +
                "Location: " + getLocation() + "\n" +
                "Last Updated: " + getLastUpdated() + "\n" +
                "Action: " + performAction();
    }
}
