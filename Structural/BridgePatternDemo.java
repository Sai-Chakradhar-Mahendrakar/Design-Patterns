package JAVA.Structural;

// Implementor: Device
interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int volume);
    boolean isOn();
}

// ConcreteImplementor: TV
class TV implements Device {
    private boolean on = false;
    private int volume = 10;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV is now ON");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV is now OFF");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to " + this.volume);
    }

    @Override
    public boolean isOn() {
        return on;
    }
}

// ConcreteImplementor: Radio
class Radio implements Device {
    private boolean on = false;
    private int volume = 20;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Radio is now ON");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Radio is now OFF");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume set to " + this.volume);
    }

    @Override
    public boolean isOn() {
        return on;
    }
}

// Abstraction: Remote Control
abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}

// Refined Abstraction: Basic Remote
class BasicRemoteControl extends RemoteControl {

    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Basic Remote: Turning ON the device");
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Basic Remote: Turning OFF the device");
        device.turnOff();
    }
}

// Refined Abstraction: Advanced Remote with additional features
class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Advanced Remote: Turning ON the device");
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Advanced Remote: Turning OFF the device");
        device.turnOff();
    }

    public void mute() {
        System.out.println("Advanced Remote: Muting the device");
        device.setVolume(0);
    }
}

public class BridgePatternDemo {
    public static void main(String[] args) {
        // Create a TV device and control it with a basic remote
        Device tv = new TV();
        RemoteControl basicRemote = new BasicRemoteControl(tv);
        basicRemote.turnOn();
        basicRemote.turnOff();

        System.out.println();

        // Create a Radio device and control it with an advanced remote
        Device radio = new Radio();
        RemoteControl advancedRemote = new AdvancedRemoteControl(radio);
        advancedRemote.turnOn();
        ((AdvancedRemoteControl) advancedRemote).mute();
        advancedRemote.turnOff();
    }
}

