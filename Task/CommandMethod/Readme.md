# Command Design Pattern - Text Editor with Undo/Redo

## Problem Statement

You are tasked with designing a **text editor system** that supports basic text manipulation operations such as **writing** and **deleting** text. The system should provide functionality to **undo** and **redo** commands. The **Command Design Pattern** must be used to encapsulate each action (like writing and deleting text) as an object, allowing for flexibility, reusability, and easy extension of functionality.

The system should maintain a **history** of commands to support **undo** and **redo** operations, allowing the user to revert or repeat previously executed commands.

## Requirements

1. **Command Interface**:
   - Define a `Command` interface that declares two methods:
     - `execute()`: Executes the command.
     - `undo()`: Undoes the command.

2. **Concrete Command Classes**:
   - Implement at least two concrete command classes:
     - `WriteTextCommand`: Adds text to the editor.
     - `DeleteTextCommand`: Deletes text from the editor.
   - Each command should know how to execute and undo itself.

3. **Receiver (Text Editor)**:
   - Implement a **TextEditor** class that represents the editor where the text is manipulated. It should provide the following functionality:
     - `write(text)`: Adds the specified text to the editor.
     - `delete(length)`: Deletes the last `length` characters from the text in the editor.
     - `getText()`: Retrieves the current text in the editor.

4. **Invoker (Command Manager)**:
   - Implement a **CommandManager** class to manage the execution and history of commands. It should maintain two stacks:
     - **Undo Stack**: Stores the history of executed commands.
     - **Redo Stack**: Stores the commands that have been undone and can be redone.
   - Provide methods to:
     - Execute a command and add it to the undo stack.
     - Undo the last executed command (move it to the redo stack).
     - Redo the last undone command (move it back to the undo stack).

5. **Test Cases**:
   - Implement test cases where:
     - Text is written to the editor, and then a portion is deleted.
     - The delete operation is undone, and then redone.
     - Multiple operations are performed and reversed using the undo/redo functionality.

## Optional Features (Bonus)

1. **Additional Commands**:
   - Add more commands such as `ReplaceTextCommand`, `CutTextCommand`, or `PasteTextCommand`.

2. **Macro Commands**:
   - Implement **macro commands** that execute a sequence of commands in a batch (for example, formatting text with multiple steps like bold, italicize, etc.).

3. **Command Logging**:
   - Add a logging mechanism to track each command execution, undo, or redo for debugging or auditing purposes.

## Deliverables

1. **Command Interface**: A `Command` interface with the `execute()` and `undo()` methods.
2. **Concrete Commands**: At least two concrete classes (`WriteTextCommand`, `DeleteTextCommand`) implementing the `Command` interface.
3. **TextEditor (Receiver)**: A simple text editor class to manipulate the text.
4. **Command Manager (Invoker)**: A class to manage the execution of commands and maintain undo/redo stacks.
5. **Test Cases**: Example scenarios demonstrating text manipulation and undo/redo functionality.
