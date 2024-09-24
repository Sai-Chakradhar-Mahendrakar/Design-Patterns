// package JAVA.Creational;

// Abstract Products
interface Button {
    void render();
}

interface Checkbox {
    void render();
}

// Concrete Products for Windows
class WindowsButton implements Button {
    public void render() {
        System.out.println("Render Windows Button");
    }
}

class WindowsCheckbox implements Checkbox {
    public void render() {
        System.out.println("Render Windows Checkbox");
    }
}

// Concrete Products for Mac
class MacButton implements Button {
    public void render() {
        System.out.println("Render Mac Button");
    }
}

class MacCheckbox implements Checkbox {
    public void render() {
        System.out.println("Render Mac Checkbox");
    }
}

// Abstract Factory
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Concrete Factories
class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

// Client
class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }
}

public class AbstractMet {
    public static void main(String[] args) {
        System.out.println("Client: Testing with WindowsFactory:");
        GUIFactory windowsFactory = new WindowsFactory();
        Application app1 = new Application(windowsFactory);
        app1.render();

        System.out.println("Client: Testing with MacFactory:");
        GUIFactory macFactory = new MacFactory();
        Application app2 = new Application(macFactory);
        app2.render();
    }
}
