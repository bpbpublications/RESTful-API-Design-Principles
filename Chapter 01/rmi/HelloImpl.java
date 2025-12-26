import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class HelloImpl extends UnicastRemoteObject 
    implements Hello {

    protected HelloImpl() throws RemoteException {
        super();
    }

    // Implement the sayHello method
    @Override
    public String sayHello() throws RemoteException {
        return "Hello, World!";
    }
}
