import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {

  public static void main(String[] args) {
    try {
      // Create an instance of the remote object
      HelloImpl hello = new HelloImpl();
      // Bind the object to the RMI registry            
      Registry registry = 
        LocateRegistry.createRegistry(1099);
      registry.rebind("Hello", hello);
      System.out.println("RMI Server is running...");
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
