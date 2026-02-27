import Facade.SmartHomeFacade;

public class Client {
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("    SMART HOME SIMULATION (Facade Pattern)  ");
        System.out.println("============================================");

        // 1. Initialize the System
        // Behind the scenes, this calls the Factories and applies the Decorators (Dimmer)
        SmartHomeFacade homeSystem = new SmartHomeFacade();

        // 2. Execute Morning Routine
        // Requirement: Lights on (70%), disarm security, thermostat 22°C, stop camera.
        homeSystem.morningRoutine();

        System.out.println("\n--------------------------------------------");

        // 3. Execute Night Routine
        // Requirement: Lights on (20%), arm security, thermostat 20°C, start camera for 1 min.
        homeSystem.nightRoutine();

        System.out.println("\n--------------------------------------------");

        // 4. Execute Away Mode
        // Requirement: Lights off, arm security, thermostat 18°C, camera records continuously.
        homeSystem.awayMode();

        System.out.println("\n============================================");
        System.out.println("       SIMULATION COMPLETE");
        System.out.println("============================================");
    }
}