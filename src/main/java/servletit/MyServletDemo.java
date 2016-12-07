package servletit;

import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.*;
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

  
@WebServlet("/servletTesti")  
public class MyServletDemo extends HttpServlet {  

final static List<Worker> disneyWorkers = Arrays.asList(
        new Worker("Duck, Donald", "1934-05-21"),
        new Worker("Mouse, Mickey", "1928-11-18"),
        new Worker("Goofy", "1932-06-01"),
        new Worker("Black, Pete", "1925-06-01"),
        new Worker("McDuck, Scrooge", "1947-12-01"),
        new Worker("Duck, Louie", "1937-06-01"),
        new Worker("Duck, Huey", "1937-06-01"),
        new Worker("Duck, Dewey", "1937-06-01"),
        new Worker("Duck, Daisy", "1940-06-01"),
        new Worker("Duck, Grandma", "1943-06-01"),
        new Worker("Gander, Gladstone", "1948-01-01"),
        new Worker("Goose, Gus", "1939-05-03"),
        new Worker("Pluto", "1930-06-01"),
        new Worker("Mouse, Minnie", "1928-11-18"),
        new Worker("Horsecollar, Horace", "1929-06-01"),
        new Worker("Gearloose, Gyro", "1952-05-01"),
        new Worker("Helper, Little", "1956-06-01"),
        new Worker("Beeva, Eega", "1947-05-01"),
        new Worker("O'Hara, Chief", "1935-06-01"),
        new Worker("Blot, Phantom", "1939-05-20")
        );
  


    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                            throws ServletException, IOException {  
  
        Collections.sort(disneyWorkers, new Comparator<Worker>() {
            @Override
            public int compare(Worker worker1, Worker worker2) {
                return worker1.getBirthdate().compareTo(worker2.getBirthdate());
            }
        });


        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
       
          
        out.print("<html><body>");  
        out.print("<h3>Servlet 3 API</h3>"); 
        out.print("<h3>Sorted by birth date</h3>");  
        out.print("<table border=1>");  
        for (Worker w: disneyWorkers)
            out.println("<tr><td>" + w.getName() + "</td><td>" + w.getAge() + "</td></tr>");
        out.print("</table>");  


        Collections.sort(disneyWorkers, new Comparator<Worker>() {
            @Override
            public int compare(Worker worker1, Worker worker2) {
                return worker2.getName().compareTo(worker1.getName());
            }
        });

        out.print("<h3>Sorted by name (reverse order)</h3>");  
        out.print("<ol>");  
        for (Worker w: disneyWorkers)
            out.println("<li>" + w );
        out.print("</ol");  
        out.print("</body></html>");  
    }  
}  

