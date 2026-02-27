package Decorators;

import SmartDevices.SmartDevice;
// Removed unused import: java.util.Timer

public class MotionSensorDecorator extends SmartDeviceDecorator {

    public MotionSensorDecorator(SmartDevice device) {
        super(device);
    }

    // 1. Fix Typo: Must match interface 'turnOff'
    @Override
    public void turnOff() {
        super.turnOff(); // Turn off the actual device
        System.out.println("Motion Sensor deactivated.");
    }

    @Override
    public void turnOn() {
        super.turnOn(); // Turn on the actual device
        System.out.println("Motion Sensor activated.");
    }

    // 2. Fix: Return String to match interface (chained with parent)
    @Override
    public String getStatus() {
        return super.getStatus() + " + [Motion Sensor Armed]";
    }

    // 3. New Feature: This is the specific behavior this decorator adds!
    public void detectMotion() {
        System.out.println(">>> MOTION DETECTED!");
        // Logic: If motion is detected, ensure the device is ON
        super.turnOn();
    }
}