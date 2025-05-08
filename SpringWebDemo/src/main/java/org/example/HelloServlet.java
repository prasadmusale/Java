package org.example;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//HttpServlet class will have methods to handle requests and to send response .
public class HelloServlet extends HttpServlet {
    //service is method which will handle the request , req is object which will have request data and res is object which will have response data .
    public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
          System.out.println("In Service");
          //getWriter method prints hello world on webpage of hello
          //res.getWriter().println("Hello World");
          res.setContentType("text/html");
          PrintWriter out = res.getWriter();
          out.println("<h2><b>Hello World</b></h2>");


    }
}
