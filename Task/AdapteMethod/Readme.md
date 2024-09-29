# Problem Statement: Media Player System with Adapter Design Pattern

## Objective
Design and implement a **Media Player System** that can play both legacy and modern audio formats using the **Adapter Design Pattern**. The goal is to integrate an old media player system, which only supports playing `.wav` files, into a new system that can play modern formats like `.mp3` and `.mp4`.

## Functional Requirements

1. **Legacy Media Player**:
   - The system should include a legacy media player (**OldMediaPlayer**) that only supports playing `.wav` files.
   
2. **New Media Player**:
   - The new media player (**AdvancedMediaPlayer**) should be capable of playing modern audio formats such as `.mp3` and `.mp4`.
   - The new media player should also be able to play `.wav` files using the legacy media player, without modifying the old code.

3. **Adapter**:
   - Implement an **Adapter** that enables the new media player to use the legacy media player for playing `.wav` files.
   - The adapter should convert the modern interface calls into the appropriate legacy method calls for `.wav` files.

## Non-Functional Requirements:
- **Reusability**: The system should reuse the existing **OldMediaPlayer** class without any changes to its internal code.
- **Transparency**: The client using the new media player should not need to know whether a file is being played by the new system or the old system via the adapter.
- **Extensibility**: The system should be designed in a way that allows additional formats to be added in the future without modifying the existing codebase.

## Example Scenario

1. The media player should be able to:
   - Play `.mp3` files (e.g., `"song.mp3"`)
   - Play `.mp4` files (e.g., `"video.mp4"`)
   - Play `.wav` files (e.g., `"old_song.wav"`) using the legacy media player via the adapter.

2. When the client requests to play a `.wav` file, the adapter should handle the request and delegate it to the legacy media player without the client being aware of this process.

3. If the client requests an unsupported file format (e.g., `.flac`), the system should return an error message indicating that the format is not supported.

## Classes and Interfaces

1. **MediaPlayer (Target Interface)**:
   - The new interface that defines the method `play(String audioType, String filename)` for playing audio files.
   
2. **OldMediaPlayer (Adaptee)**:
   - The existing class that only supports playing `.wav` files with a method `playWavFile(String filename)`.

3. **MediaAdapter (Adapter)**:
   - The adapter that implements the `MediaPlayer` interface and uses `OldMediaPlayer` to play `.wav` files.
   
4. **AdvancedMediaPlayer (Client Implementation)**:
   - A new media player that implements the `MediaPlayer` interface and can play `.mp3` and `.mp4` files natively.
   - For `.wav` files, it should use the adapter to play them using the `OldMediaPlayer`.

5. **Client**:
   - The client interacts with the `MediaPlayer` interface to play different types of audio files.

## Task

You are required to implement the **Adapter Design Pattern** to create a media player system that can:
1. Play modern audio formats (`.mp3`, `.mp4`) directly.
2. Play legacy audio formats (`.wav`) using the adapter.
3. Restrict unsupported formats and return appropriate error messages.
