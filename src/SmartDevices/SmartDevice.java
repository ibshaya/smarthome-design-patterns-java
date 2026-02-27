package SmartDevices;

public interface SmartDevice {
     void turnOn();
     void turnOff();
     String getStatus();
     default void record(int seconds) {
          System.out.println("This device does not support recording.");
     }

     default void setBrightness(int level) {
          // Do nothing by default
     }

     default void setTemperature(double temp) {
          // Do nothing by default
     }
}

