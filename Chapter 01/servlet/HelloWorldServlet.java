import javax.naming.*;
import javax.servlet.*;

public class HelloWorldServlet 
  extends HttpServlet {

  private HelloWorldRemote helloWorldBean;

  @Override
  public void init() throws ServletException {
    super.init();
    try {
      String name = "HelloWorldRemote";
      // Set up the JNDI context
      Context context = new InitialContext();
      // Lookup the EJB
      helloWorldBean = 
        (HelloWorldRemote) context.lookup(name);
    } catch (NamingException e) {
      throw new ServletException(e);
    }
  }

  @Override
  protected void doGet(HttpServletRequest req, 
    HttpServletResponse res)
  throws ServletException,
  IOException {
    // Invoke the EJB method
    String message = helloWorldBean.sayHello();
    // Write the response
    res.setContentType("text/plain");
    res.getWriter().write(message);
  }
}
