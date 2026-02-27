package Decorators;

import SmartDevices.SmartDevice;

public class VoiceControlDecorator extends SmartDeviceDecorator {

    private boolean voiceEnabled = true;

    public VoiceControlDecorator(SmartDevice device) {
        super(device);
    }

    // 1. Fix Typo: Must match interface 'turnOff'
    @Override
    public void turnOff() {
        super.turnOff();
    }

    // 2. Fix: Return String to match interface (chained with parent)
    @Override
    public String getStatus() {
        return super.getStatus() + " [Voice Control: " + (voiceEnabled ? "ON" : "OFF") + "]";
    }

    // 3. New Feature: The specific behavior for this Decorator
    // This allows you to control the device via string commands
    public void speakCommand(String command) {
        if (!voiceEnabled) {
            System.out.println("Voice control is currently disabled.");
            return;
        }

        System.out.println(">>> Voice Command Received: \"" + command + "\"");

        // Simple command parsing logic
        if (command.equalsIgnoreCase("turn on")) {
            super.turnOn();
        } else if (command.equalsIgnoreCase("turn off")) {
            super.turnOff();
        } else {
            System.out.println("Sorry, I didn't understand that command.");
        }
    }
}