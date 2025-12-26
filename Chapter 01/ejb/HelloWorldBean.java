import javax.ejb.Stateless;

@Stateless
public class HelloWorldBean implements HelloWorldRemote {
    @Override
    public String sayHello() {
        return "Hello, World!";
    }
}
