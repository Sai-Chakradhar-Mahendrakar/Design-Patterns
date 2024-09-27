# Null Object Design Pattern - Logging System

## Problem Statement

You are tasked with designing a **logging system** that handles the absence of a logger without requiring null checks. In many cases, a system component might need to log messages to a logging target such as a console, file, or database. However, in some cases, no logging may be required. Instead of returning `null` when no logger is available, you must implement a **null object** that can be used seamlessly in place of a real logger.

The **Null Object Design Pattern** should be used to avoid null checks throughout the code by providing a default "do-nothing" logger when no actual logger is needed.

## Requirements

1. **Logger Interface**:
   - Define a `Logger` interface that declares a method `log(String message)` for logging messages.
   
2. **Concrete Logger Classes**:
   - Implement a **real logger** (`ConsoleLogger`) that logs messages to the console.
   
3. **Null Object Logger**:
   - Implement a **null object class** (`NullLogger`) that does nothing when the `log()` method is called, simulating the absence of a logger.

4. **Context Class**:
   - Create a **context class** (`Application`) that uses the `Logger` interface to log messages. The system should not perform explicit `null` checks and should seamlessly work with either a real or null logger.

5. **Test Cases**:
   - Implement test cases where:
     - A real logger logs messages to the console.
     - A null logger is used, and no logs are printed, but the system should not throw errors or behave unexpectedly.

## Optional Features

1. **Multiple Log Targets**:
   - Add more logging targets such as `FileLogger` or `DatabaseLogger`, and ensure that the system can dynamically switch between them.

2. **Logger Factory**:
   - Implement a `LoggerFactory` that returns either a real logger or a `NullLogger` based on the application's configuration or logging needs.

3. **Behavior Customization**:
   - Allow customization of the `NullLogger`, such as counting how many log messages were ignored for debugging purposes.

## Deliverables

1. **Logger Interface**: A `Logger` interface with the `log(String message)` method.
2. **Concrete Logger**: A `ConsoleLogger` class that logs messages to the console.
3. **Null Logger**: A `NullLogger` class that implements the `Logger` interface but performs no actions.
4. **Context Class**: An `Application` class that uses the `Logger` interface without null checks.
5. **Test Cases**: Example scenarios where both `ConsoleLogger` and `NullLogger` are used.

