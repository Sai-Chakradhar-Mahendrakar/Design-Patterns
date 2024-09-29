# Problem Statement: Text Editor with Undo Functionality

## Objective
Design and implement a **Text Editor** that allows users to type text and undo changes using the **Memento Design Pattern**. The application should be able to save the state of the text editor (as a checkpoint) and allow restoring the text to previous states, enabling undo functionality.

## Functional Requirements

1. **Text Editor**:
   - The user can type text into the editor.
   - The user can save the current state of the text (as a checkpoint).
   - The user can undo changes by restoring the text editor to the last saved state.

2. **Undo Feature**:
   - The user should be able to undo multiple times (to go back to previous checkpoints).
   - Each saved state should represent a snapshot of the editor’s current text.

3. **Memento Pattern Components**:
   - **Originator**: The Text Editor that can create and restore its state.
   - **Memento**: The representation of the saved state of the Text Editor.
   - **Caretaker**: Manages the saved states (checkpoints) and handles undo requests.

## Non-Functional Requirements:
- **Maintainability**: The system should allow adding new functionality (e.g., redo) with minimal changes.
- **Encapsulation**: The internal state of the text should be hidden, and the client should interact only with the exposed methods (save, undo).

## Example Scenario:

1. The user types `"Hello"` and saves the state.
   - Output: `State saved: "Hello"`
   
2. The user types `" World"` and saves the state.
   - Output: `State saved: "Hello World"`
   
3. The user types `"!"` without saving the state.
   - Output: `Current text: "Hello World!"`
   
4. The user presses **Undo**, restoring the text to the last saved state.
   - Output: `Undo performed. Restored text: "Hello World"`

5. The user presses **Undo** again, restoring the text to the initial saved state.
   - Output: `Undo performed. Restored text: "Hello"`

6. The user presses **Undo** when no previous state exists.
   - Output: `No states to undo.`

## Classes and Interfaces

1. **Memento**:
   - Holds the state of the text (as a string).
   
2. **Originator (Text Editor)**:
   - Responsible for creating and restoring memento objects (saved states).
   
3. **Caretaker**:
   - Responsible for storing mementos and handling undo requests.

## Task
You are required to implement the **Text Editor** with undo functionality using the **Memento Design Pattern**. Ensure that the state-saving and undo actions are managed by the caretaker class, while the text editor itself should handle typing and restoring states.
