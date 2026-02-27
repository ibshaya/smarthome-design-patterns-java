package SmartDevices;

public class SmartSecurity implements SmartDevice {
    private boolean isArmed = false; // "isOn" conceptually means "Armed" for security

    @Override
    public void turnOn() {
        this.isArmed = true;
        System.out.println("Security System is now ARMED.");
    }

    @Override
    public void turnOff() { // Corrected typo from 'turnOf'
        this.isArmed = false;
        System.out.println("Security System is now DISARMED.");
    }

    @Override
    public String getStatus() {
        // Changed to return String to match the interface
        return "Security System is " + (isArmed ? "ARMED" : "DISARMED");
    }

    // Note: We use the default 'do nothing' methods for record(), setBrightness(), etc.
    // because a Security System generally doesn't record video or change brightness itself.
}