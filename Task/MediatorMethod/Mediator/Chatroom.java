package Mediator;

import Participant.Participant;

public interface Chatroom {
    void registerParticipant(Participant participant);
    void sendMessage(String message, Participant from, Participant to);
    void broadCastMessage(String message, Participant from);
}
