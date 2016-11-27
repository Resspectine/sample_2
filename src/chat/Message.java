package chat;

public class Message {
    private String message;

    public Message() {
        this.message = "";
    }

    public Message(String message) {
        this.message = message;
        //message = message.concat("\n");
    }
}
