# Problem Statement: Music Player using State Design Pattern

## Objective
Design and implement a **Music Player** that can transition between three states: **Playing**, **Paused**, and **Stopped**. Use the **State Design Pattern** to handle the different behaviors and transitions between these states.

## Functional Requirements

1. **States of the Music Player**:
   - **Playing State**:
     - The user can pause the music, transitioning the player to the Paused state.
     - The user can stop the music, transitioning the player to the Stopped state.
   - **Paused State**:
     - The user can resume (play) the music, transitioning the player to the Playing state.
     - The user can stop the music, transitioning the player to the Stopped state.
   - **Stopped State**:
     - The user can start playing the music, transitioning the player to the Playing state.
     - The user cannot pause or stop the music when it is already stopped.

2. **State Transitions**:
   - Each state should handle the user's input and perform state transitions appropriately.
   - For example, pressing **Play** when in the Paused state should resume the music and transition to the Playing state.

3. **User Interface**:
   - Simulate user interactions (Play, Pause, Stop) through method calls.
   - Display the current state of the music player after each action.

## Non-Functional Requirements

- **Maintainability**: The system should be easy to extend with additional states in the future (e.g., Fast Forward, Rewind).
- **Encapsulation**: The internal state management should be hidden from the client. The user should interact with the music player through simple commands (play(), pause(), stop()).
- **Loose Coupling**: State-specific behavior should be encapsulated in separate state classes, with minimal coupling between the states and the context.

## Example Scenario

1. The user presses **Play** while the player is in the **Stopped** state.
   - Output: "Music is now Playing."
   - The state transitions to **Playing**.

2. The user presses **Pause** while the player is in the **Playing** state.
   - Output: "Music is now Paused."
   - The state transitions to **Paused**.

3. The user presses **Stop** while the player is in the **Paused** state.
   - Output: "Music is now Stopped."
   - The state transitions to **Stopped**.

4. The user presses **Pause** while the player is in the **Stopped** state.
   - Output: "Cannot Pause. Music is already Stopped."

## Classes and Interfaces

1. **State Interface**:
   - Defines common behaviors for all states (`play()`, `pause()`, `stop()`).

2. **Concrete States**:
   - `PlayingState`: Handles the behavior when music is playing.
   - `PausedState`: Handles the behavior when music is paused.
   - `StoppedState`: Handles the behavior when music is stopped.

3. **Context (Music Player)**:
   - Maintains the current state and delegates the user requests to the current state object.

## Task
You are required to implement this **Music Player** using the **State Design Pattern**. You will define the different states (Playing, Paused, Stopped) as concrete classes, and the `MusicPlayer` as the context class that delegates actions to the current state.

