import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    // This method will be called remotely
    String sayHello() throws RemoteException;
}
