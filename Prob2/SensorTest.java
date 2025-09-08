package L5.Prob2;

public class SensorTest {
    public static void main(String[] args) {
        Sensor[] sensors = new Sensor[5];

        sensors[0] = new TemparatureSensor("Living Room", 23.5);
        sensors[1] = new LightSensor("Garden", 80.0);
        sensors[2] = new SoundSensor("Bedroom", 65.0);
        sensors[3] = new TemparatureSensor("Kitchen", 32.0);
        sensors[4] = new LightSensor("Garage", 150.0);

        System.out.println("--- Status of each sensor---");
        for (Sensor sensor : sensors) {
            System.out.println(sensor.toString());
        }
    }
}
