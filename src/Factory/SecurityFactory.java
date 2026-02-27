package Factory;

import SmartDevices.SmartDevice;
import SmartDevices.SmartLight;
import SmartDevices.SmartSecurity;

public class SecurityFactory extends DeviceFactory {
    public SmartDevice createDevice(){
        return new SmartSecurity();
    }
}
