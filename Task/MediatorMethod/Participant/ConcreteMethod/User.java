package Participant.ConcreteMethod;

import Mediator.Chatroom;
import Participant.Participant;

public class User extends Participant {

    public User(String name, Chatroom chatroom){
        super(name, chatroom);
        chatroom.registerParticipant(this);
    }

    @Override
    public void sendMessage(String message, Participant to) {
        System.out.println(this.name + " is sending a direct message to " + to.getName() + ": " + message);
        chatroom.sendMessage(message, this, to);
    }

    @Override
    public void sendMessageToAll(String message) {
        System.out.println(this.name + " is broadcasting a message: " + message);
        chatroom.broadCastMessage(message, this);
    }

    @Override
    public void receiveMessage(String message, Participant from) {
        System.out.println(this.name + " received a message from " + from.getName() + ": " + message);
    }
    
}
