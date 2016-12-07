package servletit;

import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.*;
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.*;  

@WebServlet("/courses")  
public class CourseMalli extends HttpServlet {  

    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                            throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        out.print("<html><body>");  
        
        ArrayList<Course> courses = new ArrayList<Course>();
        Course c1 = new Course("Servlet", 1); 
        Course c2 = new Course("Java ServerPages", 1); 
        Course c3 = new Course("Java ServerFaces", 2); 
        courses.add(c1); // add all courses to the list
        courses.add(c2); 
        courses.add(c3); 
        courses.add(new Course("Java Persistence", 2)); 

        HttpSession session = request.getSession();
        if (session.getAttribute("courses") == null)
          session.setAttribute("courses", courses);
        else
          courses = (ArrayList<Course>)session.getAttribute("courses");        

        // courses is saved into the session variable!
        out.print("<h3>Courses in the list </h3>");
        out.print("<table border=2>");
        for (Course c: courses) {
           out.print("<tr><td>" + c.getName() + "</td><td>"  + c.getDays() +  " </td></tr>"); 
        }
        out.print("</table>"); out.print("<form method=post>");
        out.print("Name <input type=text name=name />");
        out.print("Days <input type=text name=days />");
        out.print("<input type=submit />");         out.print("</form>");
        out.print("</body></html>");  
    }  
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType( "text/html" );
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        Integer days = Integer.parseInt(request.getParameter("days"));
        HttpSession session = request.getSession();
        ArrayList<Course> courses = (ArrayList<Course>)session.getAttribute("courses");        
        if (name != null && days != null && name.length() > 0) {
        // TODO: Add a new course to the ArrayList and show the list to the end user!
            Course newCourse = new Course(name, days); 
            out.println("<p>New course added: " + newCourse + "</p>");
            courses.add(newCourse);
            session.setAttribute("courses", courses);
        }
        out.print("<table border=2>");
        for (Course c: courses) {
           out.print("<tr><td>" + c.getName() + "</td><td>"  + c.getDays() +  " </td></tr>"); 
        }
        out.print("</table>");  

    }

}  
