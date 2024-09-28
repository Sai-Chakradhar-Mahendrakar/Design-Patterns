package Mediator.ConcreteMethod;

import java.util.HashMap;
import java.util.Map;

import Mediator.Chatroom;
import Participant.Participant;

public class ConcreteChatroom implements Chatroom{
    private Map<String, Participant> participants = new HashMap<>();
    

    @Override
    public void registerParticipant(Participant participant) {
        participants.put(participant.getName(), participant);
        System.out.println(participant.getName() + " has joined the chatroom.");
    }

    @Override
    public void sendMessage(String message, Participant from, Participant to) {
        if (participants.containsKey(to.getName())) {
            to.receiveMessage(message, from);
        } else {
            System.out.println("Participant " + to.getName() + " is not registered in the chatroom.");
        }
    }

    @Override
    public void broadCastMessage(String message, Participant from) {
        for (Participant participant : participants.values()) {
            if (!participant.equals(from)) {
                participant.receiveMessage(message, from);
            }
        }
    }
    
}
