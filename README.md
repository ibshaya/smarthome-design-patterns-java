# Smart Home Simulation

A Java-based simulation of a smart home system demonstrating several design patterns: **Facade**, **Factory**, and **Decorator**. The project structures a variety of smart devices and orchestrates them via a central facade, while allowing extensions through factories and decorators.

## 🏠 Project Structure

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

## 📌 Design Patterns Used

- **Facade Pattern**: `SmartHomeFacade` simplifies interaction with various devices by providing high-level routines like morning, night, and away modes.
- **Factory Pattern**: Device creation is abstracted through `DeviceFactory` subclasses (e.g., `LightFactory`, `CameraFactory`).
- **Decorator Pattern**: Additional behaviors are added dynamically to devices via decorators such as `DimmerDecorator`, `MotionSensorDecorator`, and `VoiceControlDecorator`.

## 🚀 Running the Simulation

1. Ensure you have a Java development environment (JDK 8+).
2. Compile the source files:
   ```bash
   javac src/**/*.java
   ```
3. Run the client:
   ```bash
   java -cp src Client
   ```

You should see console output simulating the smart home routines and device interactions.

## 🔧 Extending the System

- Add new device types by implementing `SmartDevice` and creating a corresponding factory.
- Apply additional decorators to devices to extend behavior (e.g., logging, voice control, etc.).
- Enhance the `SmartHomeFacade` with more routines or configuration options.

## 📁 Suggested GitHub Repository Name

Consider creating a repository named:

```
smarthome-design-patterns-java
```

This name reflects the project's focus and makes it easier for others to discover.

## 📌 License

Feel free to use and modify this project for educational purposes. No specific license is included.

---

Happy coding! ✨