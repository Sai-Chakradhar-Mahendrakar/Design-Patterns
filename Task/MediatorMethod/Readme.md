# Mediator Design Pattern - Problem Statement

## Overview

You are tasked with designing a **chatroom system** using the **Mediator Design Pattern**. The goal is to create a communication hub where multiple users (referred to as participants) can send messages to each other. Instead of participants communicating directly with each other, they will interact with a **Mediator (Chatroom)** that controls and facilitates the message exchange.

## Functional Requirements:

### 1. Participants:
   - The participants in the system will be users who want to send and receive messages.
   - Each participant should have a **name** and should be able to send a message to the chatroom.
   - The message may be broadcast to all participants or sent directly to a specific participant.

### 2. Mediator (Chatroom):
   - The mediator will handle the communication between participants.
   - It should allow participants to register with the chatroom.
   - When a message is sent, the mediator should either broadcast it to all participants or send it to a specific recipient.

### 3. Messaging:
   - **Broadcast messaging**: A message can be sent to all participants.
   - **Direct messaging**: A message can be sent to a specific participant.
   - The mediator should ensure that messages are routed correctly.

## Non-Functional Requirements:
1. **Scalability**: The system should be able to handle a growing number of participants easily without requiring significant changes.
2. **Decoupling**: Participants should not need to know about each other. They should only interact with the mediator.
3. **Logging**: The system should log the communication process to keep track of which messages were sent and to whom.

## Example Scenario:

1. **Broadcast Message**: 
   - User A sends a broadcast message to the chatroom.
   - All other users (B, C, D) receive the message.

2. **Direct Message**: 
   - User B sends a message directly to User C through the mediator.
   - Only User C receives the message, and it is not seen by other users.

## Class Definitions:

### 1. Participant Class:
   - Attributes: `name`, `mediator`
   - Methods:
     - `sendMessage(message: String, to: Participant)`: Sends a direct message.
     - `sendMessageToAll(message: String)`: Sends a broadcast message.
     - `receiveMessage(message: String, from: Participant)`: Receives a message from another participant.

### 2. Chatroom (Mediator) Interface:
   - Methods:
     - `registerParticipant(participant: Participant)`: Registers a participant.
     - `sendMessage(message: String, from: Participant, to: Participant)`: Sends a direct message.
     - `broadcastMessage(message: String, from: Participant)`: Sends a message to all participants.

### 3. Concrete Mediator (ConcreteChatroom):
   - Implements the mediator interface.
   - Manages the list of participants and routes messages appropriately.

## Expected Output:
1. **Broadcast**: When a user sends a broadcast message, all participants will receive the message, and the sender will be notified.
2. **Direct Messaging**: When a user sends a direct message to another user, only the intended recipient will receive it, and both the sender and the recipient will be notified of the action.
