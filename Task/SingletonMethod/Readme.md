# Logger System using Singleton Design Pattern

## Objective:
Design a global logger class using the **Singleton Design Pattern** that ensures only one instance of the logger exists throughout the application. The logger will be responsible for writing log messages to a file or the console and should be thread-safe.

---

## Requirements:

1. **Single Instance:**
   - Ensure that only one instance of the logger class exists and can be accessed globally by all parts of the application.

2. **Logging Functionality:**
   - The logger should provide methods to log messages with different levels such as `INFO`, `ERROR`, `WARNING`, etc.
   - Each log entry should include a timestamp.

3. **Thread Safety:**
   - Ensure that the Singleton implementation is thread-safe, so it can handle logging from multiple threads concurrently.

4. **Output Destination:**
   - The logger should be able to output log messages to either the console or a file based on a configuration option.

5. **Log Levels:**
   - Allow the logger to be configurable for log levels. For example, only `ERROR` or `WARNING` level logs should be recorded.

6. **Preventing Multiple Instances:**
   - Ensure the Singleton instance cannot be bypassed using reflection, cloning, or serialization.

7. **Serialization Safe:**
   - Make sure that the Singleton’s behavior is preserved even if the object is serialized and deserialized.

---

## Implementation Steps:

### 1. Define the Logger Class:
   - Create a class `Logger` with private constructors to prevent instantiation from outside.
   - Provide a static method `getInstance()` to return the single instance of the logger.

### 2. Implement Thread-Safety:
   - Use a thread-safe Singleton implementation (e.g., double-checked locking or synchronized blocks).

### 3. Implement Logging Methods:
   - Create methods like `logInfo()`, `logError()`, and `logWarning()` to log messages at different levels.
   - Ensure that each log entry is timestamped.

### 4. Log Output Configuration:
   - Add functionality to configure whether log messages are written to the console or to a file.

### 5. Handle Reflection and Cloning Attacks:
   - Override methods to prevent the creation of multiple instances via reflection or cloning.

### 6. Serialization-Safe Singleton:
   - Implement serialization-safe logic to preserve the Singleton behavior when the object is serialized and deserialized.

---

## Example:

```java
Logger logger = Logger.getInstance();
logger.logInfo("This is an informational message.");
logger.setLogToFile(true);  // Switch to file logging
logger.logError("This is an error message.");
