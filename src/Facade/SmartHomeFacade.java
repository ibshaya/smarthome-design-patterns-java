package Facade;

import SmartDevices.*;
import Decorators.*;
import Factory.*;

public class SmartHomeFacade {
    // The Facade holds references to the devices via the Interface
    private SmartDevice light;
    private SmartDevice thermostat;
    private SmartDevice camera;
    private SmartDevice security;

    public SmartHomeFacade() {
        // --- 1. Instantiate Factories ---
        DeviceFactory lightFactory = new LightFactory();
        DeviceFactory thermostatFactory = new ThermostatFactory();
        DeviceFactory cameraFactory = new CameraFactory();
        DeviceFactory securityFactory = new SecurityFactory();

        // --- 2. Create Devices via Factory ---
        // Note: We use the factories to create the "base" devices.

        // Special Case: Light needs to be cast to SmartLight to be wrapped by DimmerDecorator
        // (This aligns with your logic that Dimmer only wraps Lights)
        SmartLight rawLight = (SmartLight) lightFactory.createDevice();

        // --- 3. Apply Decorators (Composition) ---
        // We wrap the light in a DimmerDecorator so the system supports dimming by default
        this.light = new DimmerDecorator(rawLight);

        // We can create the others normally
        this.thermostat = thermostatFactory.createDevice();
        this.camera = cameraFactory.createDevice(); // We could wrap this in MotionSensor if desired
        this.security = securityFactory.createDevice();

        System.out.println("--- Smart Home System Initialized ---");
    }

    // --- 4. Define the Routines (The Simplification) ---

    // Requirement: Lights on (70%), disarm security, thermostat 22°C, stop camera.
    public void morningRoutine() {
        System.out.println("\nExecuting Morning Routine...");

        light.turnOn();
        light.setBrightness(70); // Works because of our Interface/Decorator setup

        security.turnOff(); // Disarm

        thermostat.setTemperature(22.0);

        camera.turnOff();
    }

    // Requirement: Lights on (20%), arm security, thermostat 20°C, start camera for 1 min. [cite: 67]
    public void nightRoutine() {
        System.out.println("\nExecuting Night Routine...");

        light.turnOn();
        light.setBrightness(20);

        security.turnOn(); // Arm

        thermostat.setTemperature(20.0);

        camera.turnOn();
        camera.record(60); // Record for 1 minute
    }

    // Requirement: Lights off, arm security, thermostat 18°C, camera records continuously. [cite: 68]
    public void awayMode() {
        System.out.println("\nExecuting Away Mode...");

        light.turnOff();

        security.turnOn(); // Arm

        thermostat.setTemperature(18.0);

        camera.turnOn();
        camera.record(-1); // Using 0 or -1 to represent "Continuous" logic if you prefer
    }
}