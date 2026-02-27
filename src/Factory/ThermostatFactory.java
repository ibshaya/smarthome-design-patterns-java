package Factory;

import SmartDevices.SmartDevice;
import SmartDevices.SmartThermostat;

public class ThermostatFactory extends DeviceFactory{
    public SmartDevice createDevice(){
        System.out.println("Creating a thermostat object");
        return new SmartThermostat();
    }
}
