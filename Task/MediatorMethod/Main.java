import Mediator.Chatroom;
import Mediator.ConcreteMethod.ConcreteChatroom;
import Participant.Participant;
import Participant.ConcreteMethod.User;

public class Main {
    public static void main(String[] args) {
        // Mediator
        Chatroom chatroom = new ConcreteChatroom();

        // Participants
        Participant user1 = new User("Alice", chatroom);
        Participant user2 = new User("Bob", chatroom);
        Participant user3 = new User("Charlie", chatroom);


        // Direct message from Alice to Bob
        user1.sendMessage("Hello, Bob!", user2);

        // Broadcast message from Bob
        user2.sendMessageToAll("Hi everyone!");

        // Direct message from Charlie to Alice
        user3.sendMessage("Hey Alice!", user1);
    }
}
