package class7;

public class DITest {
    public static void main(String[] args) {
        Service service = new ServiceB();
        Client client = new ClientA(service);
        client.doSomething();
    }
}