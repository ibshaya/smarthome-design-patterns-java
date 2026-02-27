package Factory;

import SmartDevices.SmartCamera;
import SmartDevices.SmartDevice;
import SmartDevices.SmartLight;

public class CameraFactory extends DeviceFactory{
    public SmartDevice createDevice(){
        System.out.println("Creating a camera object");
        return new SmartCamera();
    }

}
