package SmartDevices;

public class SmartThermostat implements SmartDevice {
    private boolean isOn = false;
    private double temperature = 20.0; // Default start temp

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("SmartThermostat is now ON.");
    }

    @Override
    public void turnOff() { // Corrected typo from 'turnOf'
        this.isOn = false;
        System.out.println("SmartThermostat is now OFF.");
    }

    // --- Key Implementation: Overriding the specific method ---
    // We renamed 'setTemp' to 'setTemperature' to match the SmartDevice interface
    @Override
    public void setTemperature(double temp) {
        this.temperature = temp;
        System.out.println("Thermostat target temperature set to " + this.temperature + "°C.");
    }

    @Override
    public String getStatus() {
        // Changed to return String to match the interface
        return "Thermostat is " + (isOn ? "ON (" + temperature + "°C)" : "OFF");
    }

    // Note: We use the default 'do nothing' methods for record() and setBrightness()
}