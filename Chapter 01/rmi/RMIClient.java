import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {

  public static void main(String[] args) {
    try {
      // Locate the RMI registry
      Registry registry = 
        LocateRegistry.getRegistry("localhost", 1099);
      //Look up the remote object  
      Hello hello = (Hello) registry.lookup("Hello");
      // Invoke the remote method
      String response = hello.sayHello();
      System.out.println("Response: " + response);
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
