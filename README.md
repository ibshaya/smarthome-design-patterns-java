# Smart Home Simulation

A Java-based simulation of a smart home system demonstrating several design patterns: **Facade**, **Factory**, and **Decorator**. The project structures a variety of smart devices and orchestrates them via a central facade, while allowing extensions through factories and decorators.

## Project Structure

```
src/
  Client.java
  Decorators/
    DimmerDecorator.java
    MotionSensorDecorator.java
    SmartDeviceDecorator.java
    VoiceControlDecorator.java
  Facade/
    SmartHomeFacade.java
  Factory/
    CameraFactory.java
    DeviceFactory.java
    LightFactory.java
    SecurityFactory.java
    ThermostatFactory.java
  SmartDevices/
    SmartCamera.java
    SmartDevice.java
    SmartLight.java
    SmartSecurity.java
    SmartThermostat.java
```

## Design Patterns Used

- **Facade Pattern**: `SmartHomeFacade` simplifies interaction with various devices by providing high-level routines like morning, night, and away modes.
- **Factory Pattern**: Device creation is abstracted through `DeviceFactory` subclasses (e.g., `LightFactory`, `CameraFactory`).
- **Decorator Pattern**: Additional behaviors are added dynamically to devices via decorators such as `DimmerDecorator`, `MotionSensorDecorator`, and `VoiceControlDecorator`.

## Running the Simulation

1. Ensure you have a Java development environment.
2. Compile the source files:
   ```bash
   javac src/**/*.java
   ```
3. Run the client:
   ```bash
   java -cp src Client
   ```

You should see console output simulating the smart home routines and device interactions.



## Author
Ibrahim Alshayea

