package Decorators;

import SmartDevices.SmartDevice;
import SmartDevices.SmartLight;

public class DimmerDecorator extends SmartDeviceDecorator {

    // 1. Constructor: Correctly restricts usage to only SmartLights
    public DimmerDecorator(SmartLight device) {
        super(device);
    }

    // 2. Override the INTERFACE method (not a new name like setIntensity)
    //    so this works with: SmartDevice d = new DimmerDecorator(...);
    @Override
    public void setBrightness(int level) {
        // Add the "Decoration": Logging or extra logic
        System.out.println(">>> Dimmer is adjusting brightness...");

        // Pass it to the actual light so it saves the value
        // (The parent SmartDeviceDecorator delegates this for us)
        super.setBrightness(level);
    }

    // 3. Fix: Return String and combine with parent status
    @Override
    public String getStatus() {
        // Get the light's status and add a tag showing the dimmer is attached
        return super.getStatus() + " (Dimmer Active)";
    }
}