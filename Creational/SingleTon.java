public class Single {
    // Volatile ensures that the instance is visible to all threads
    private static volatile Single instance;

    // Private constructor to prevent instantiation
    private Single() {}

    // Static method to access the single instance (Thread-safe with double-checked locking)
    public static Single getInstance() {
        if (instance == null) {  // First check (no locking)
            synchronized (Single.class) {
                if (instance == null) {  // Second check (after locking)
                    instance = new Single();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton Instance Address: " + this);
    }
}

// Client code
public class SingleTon {
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        s1.showMessage();

        Single s2 = Single.getInstance();
        s2.showMessage();
    }
}
