package class7;

public class ChatUser {
    private String name;

    public String getName() {
        return name;
    }

    public ChatUser(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
