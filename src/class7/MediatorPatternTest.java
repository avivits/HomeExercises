package class7;

public class MediatorPatternTest {
    public static void main(String[] args) {
        ChatUser robert = new ChatUser("Robert");
        ChatUser john = new ChatUser("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
