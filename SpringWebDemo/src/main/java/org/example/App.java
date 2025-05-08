package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException
    {

        System.out.println( "Hello World!" );
        //To run a tomcat server we have to make object of tomcat class
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        //Context is interface
        //ContextPath is address where web app will be accesses , docBase is the address of web applications static files
        //As we are running web application on local host both arguments will be empty and null

        Context context = tomcat.addContext("", null );
        //Context context = tomcat.addContext("" , null);
        //addServlet is static method of tomcat class and it has three arguments 1.context , 2.servlet name
        //which can be anything , 3.object of HelloService which is our Servlet class .
        Tomcat.addServlet(context , "Servlet1" , new HelloServlet());
        //addServletMappingDecoded is method of context interface for mapping of servlet whose first argument
        // is url and second is name of added servlet .
        context.addServletMappingDecoded("/hello","Servlet1");

        //start method is used to start tomcat server
        tomcat.start();
        //getServer method will give us hold of server and await method will keep server running
        tomcat.getServer().await();
    }
}
