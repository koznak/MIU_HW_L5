package L5.Prob4;

public class ApplianceTest {
    public static void main(String[] args) {
        Appliance[] col = {
                new WashingMachine(7),
                new Refrigerator(4),
                new Microwave(800)
        };

        System.out.println("--- Performing functions using polymorphism ---");

        for (Appliance a : col) {
            System.out.println(a.getClass().getSimpleName());
            a.performFunction();
        }
    }
}
