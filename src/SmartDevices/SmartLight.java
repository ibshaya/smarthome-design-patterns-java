package SmartDevices;

public class SmartLight implements SmartDevice {
    private boolean isOn = false;
    private int brightness = 100; // Default brightness

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("SmartLight is now ON at " + brightness + "% brightness.");
    }

    @Override
    public void turnOff() { // Corrected typo from 'turnOf'
        this.isOn = false;
        System.out.println("SmartLight is now OFF.");
    }

    // --- Key Implementation: Overriding only what applies to Light ---

    @Override
    public void setBrightness(int level) {
        if (level < 0 || level > 100) {
            System.out.println("Error: Brightness must be between 0 and 100.");
        } else {
            this.brightness = level;
            System.out.println("SmartLight brightness set to " + brightness + "%.");
        }
    }

    // Note: We DO NOT override record() or setTemperature().
    // We let them use the 'default' (do nothing) implementation from the interface.

    @Override
    public String getStatus() {
        // Changed to return String to match the interface
        return "Light is " + (isOn ? "ON (" + brightness + "%)" : "OFF");
    }
}