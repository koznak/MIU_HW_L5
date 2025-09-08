package L5.Prob2;

import java.time.LocalDate;
import java.time.LocalTime;

public interface Sensor {
    String getSensorType();
    double getReading();
    String getLocation();
    String getLastUpdated();
    String performAction();
}
