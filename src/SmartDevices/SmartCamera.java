package SmartDevices;

public class SmartCamera implements SmartDevice {
    private boolean isOn = false;

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("SmartCamera is now ON.");
    }

    @Override
    public void turnOff() { // Corrected typo from 'turnOf'
        this.isOn = false;
        System.out.println("SmartCamera is now OFF.");
    }

    // --- Key Implementation: Overriding the specific method ---
    @Override
    public void record(int seconds) {
        if (isOn) {
            if(seconds == -1){
                System.out.println("Recording continuously");
            }
            else {
            System.out.println("Recording video for " + seconds + " seconds...");
            }
        } else {
            System.out.println("Error: Cannot record. Camera is currently OFF.");
        }
    }

    @Override
    public String getStatus() {
        // Changed to return String to match the interface signature
        return "Camera is " + (isOn ? "ON" : "OFF");
    }
}