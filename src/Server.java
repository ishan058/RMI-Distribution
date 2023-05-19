import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) throws IOException {
       Registry registry = LocateRegistry.createRegistry(5099);
        registry.rebind("hello", new HelloServant());
    }
}
