package L5.Prob2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TemparatureSensor implements Sensor{
    private String location;
    private double temperature;
    private LocalTime lastUpdated;

    public TemparatureSensor(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
        this.lastUpdated = LocalTime.now();
    }

    @Override
    public String getSensorType() {

        // We can use this.getClass().getSimpleName() for this, but the current class name is "TemparatureSensor", and I just want to return "Temparature" value. So, for this purpose, I return a simple string value as "Temparature";
        //return this.getClass().getSimpleName();
        return "Temperature";

    }

    @Override
    public double getReading() {
        return this.temperature;
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
        if (this.temperature > 30) {
            return "an alert to turn on the AC";
        } else if (this.temperature < 18) {
            return "an alert to turn on the Heater";
        } else {
            return "Temperature is in normal range";
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
