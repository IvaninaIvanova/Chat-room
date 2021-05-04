package mediator;

public class MediatorMain {

	public static void main(String[] args) {
		
		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Iva");
		User user2 = new ChatUser(chat, "Moni");
		User user3 = new ChatUser(chat, "Gosho");
		
		user2.send("cat");
		user1.send("addBot");
		user2.send("cat");
		user3.send("cat");
	}

}
