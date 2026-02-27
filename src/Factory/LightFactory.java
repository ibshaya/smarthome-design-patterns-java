package Factory;

import SmartDevices.SmartDevice;
import SmartDevices.SmartLight;

public class LightFactory extends DeviceFactory {
    public SmartDevice createDevice(){
        System.out.println("Creating a light device");
        return new SmartLight();
    }
}
