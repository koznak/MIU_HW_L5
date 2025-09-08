package L5.Prob2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LightSensor  implements Sensor {
    private String location;
    private double lavel;
    private LocalTime lastUpdated;

    public LightSensor(String location, double lightLevel) {
        this.location = location;
        this.lavel = lightLevel;
        this.lastUpdated = LocalTime.now();
    }

    public String getSensorType() {
        return "Light";
    }

    @Override
    public double getReading() {
        return lavel;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getLastUpdated() {
        lastUpdated = LocalTime.now();
        return lastUpdated.format(DateTimeFormatter.ofPattern("hh:mm a"));
    }

    @Override
    public String performAction() {
        if (this.lavel < 100) {
            return "an alert to turn on the light";
        } else {
            return "Light is sufficient";
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
