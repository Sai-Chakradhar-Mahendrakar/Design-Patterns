package Participant;

import Mediator.Chatroom;

public abstract class Participant {
    protected String name;
    protected Chatroom chatroom;

    public Participant(String name, Chatroom chatroom){
        this.name = name;
        this.chatroom = chatroom;
    }

    public String getName(){
        return name;
    }

    public abstract void sendMessage(String message, Participant to);

    public abstract void sendMessageToAll(String message);

    public abstract void receiveMessage(String message, Participant from);
}
