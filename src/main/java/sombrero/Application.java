package sombrero;

/*import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@SpringBootApplication
public class Application {

    public static void main(String[] args) { // throws LifecycleException {
        SpringApplication.run(Application.class, args);
        /*Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        Context context = tomcat.addContext("/", "/");

        HttpServlet servlet = new HttpServlet() {
            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                // super.doGet(req, resp);
                PrintWriter writer = resp.getWriter();
                writer.println("<html><head></head><body>Hey, Tomcat!</body></html>");
            }
        };
        String servletName = "helloServlet";
        tomcat.addServlet("/", servletName, servlet);

        context.addServletMappingDecoded("/hello", servletName);
        // /hello 요청이 들어오면 helloServlet을 사용.

        tomcat.start();
        tomcat.getServer().await();*/
    }

}
