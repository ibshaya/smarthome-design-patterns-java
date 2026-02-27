package Decorators;

import SmartDevices.SmartDevice;

public abstract class SmartDeviceDecorator implements SmartDevice {

    // Change to PROTECTED so children (like Dimmer) can access it if needed
    protected SmartDevice device;

    public SmartDeviceDecorator(SmartDevice device) {
        this.device = device;
    }

    // --- Core Methods: Delegate to the wrapped device ---

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() { // Fixed typo (was turnOf)
        device.turnOff();
    }

    @Override
    public String getStatus() { // You were missing this!
        return device.getStatus();
    }

    // --- Specific Methods: MUST Delegate these too! ---
    // If we don't delegate these, the wrapper "blocks" the signal
    // and the underlying device never receives the command.

    @Override
    public void record(int seconds) {
        device.record(seconds);
    }

    @Override
    public void setBrightness(int level) {
        device.setBrightness(level);
    }

    @Override
    public void setTemperature(double temp) {
        device.setTemperature(temp);
    }
}