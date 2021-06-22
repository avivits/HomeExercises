package class7;

public class ChatRoom {
    public static void showMessage(ChatUser user, String message){
        System.out.println(" [" + user.getName() + "] : " + message);
    }
}