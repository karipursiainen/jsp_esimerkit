package servletit;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;

@WebServlet(value="/courses2", loadOnStartup=1)
public class CourseServletti extends HttpServlet {
    
    @Override
    public void doGet(    HttpServletRequest request,
            HttpServletResponse response )
            throws ServletException, IOException {
        PrintWriter output;
      //  request.
        response.setContentType( "text/html" );
        output = response.getWriter();
        // luodaan HTML-sivu:
        StringBuffer buf = new StringBuffer();
        buf.append( "<HTML><HEAD><TITLE>\n" );
        buf.append( "Ensimmainen servletti - GET-metodi\n" );
        buf.append( "</TITLE></HEAD><BODY>\n" );
        buf.append( "<H1>Tämän teki minun oma servletti!</H1>Ao. generoitu Javalla<br><br>" );
        
		ArrayList<Course> courses = new ArrayList<Course>();
		Course c1 = new Course("Servlet",1);
		Course c2 = new Course("Java ServerPages",1);
		Course c3 = new Course("Java ServerPages",2);
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		courses.add(new Course("Java Persistence",2));

		HttpSession session =request.getSession();
		session.setAttribute("courses", courses);
        
		for (int i=0; i<courses.size(); i++) { 
            buf.append(courses.get(i));
            buf.append("<br/>");
        }
       
		
		buf.append( "<form method=post >" );
        buf.append( "Name <input type=text name=name />" );
        buf.append( "Days <input type=text name=days />"  );
        buf.append( "<input type=submit />"  );
        buf.append( "</form>" );
        
        buf.append( "</BODY></HTML>" );
        // lähetetään sivu:
        output.println( buf.toString() );
        output.close();
    }
    
    @SuppressWarnings("rawtypes")
	@Override
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter output;
        response.setContentType( "text/html" );
        output = response.getWriter();
        
        String name = request.getParameter("name");
        Integer days = Integer.parseInt(request.getParameter("days"));
        HttpSession session = request.getSession();
        ArrayList<Course> courses = (ArrayList<Course>)session.getAttribute("courses");
        
        StringBuffer buf = new StringBuffer();
        String sukunimi = request.getParameter("sukunimi");
        //request.getPa
        if (sukunimi != null && sukunimi.length() > 0)
            buf.append("<h4>Sukunimi-parametrin arvo: " + sukunimi.trim() +"</h4>");

        buf.append("<h2>Parametrit</h2>");
        // Voidaan lukea kaikki HTTP-pyyntä parametrit:
        java.util.Enumeration nimet = request.getParameterNames();
        while (nimet.hasMoreElements()) {
            String nimi = (String)nimet.nextElement();
            buf.append(nimi + " ==> " + (String)request.getParameter(nimi)  + "<br/>");
        }

        buf.append("<h2>HTTP-otsikot</h2>");
        // Voidaan lukea kaikki HTTP-pyynnän otsikot.
        java.util.Enumeration<String> otsikot = request.getHeaderNames();
        while (otsikot.hasMoreElements()) {
            String otsikko_nimi = (String) otsikot.nextElement();
            buf.append(otsikko_nimi + " ==> " + (String)request.getHeader(otsikko_nimi)  + "<br/>");            
        }
        // Voidaan lukea HTTP-otsikot esimerkkeinä.
        
        buf.append( "</body></html>" );
        output.println( buf.toString() );
        output.close();
    }
}
/*Kutsu: <form action="../servlet/EkaServletti" method="post">
  <!-- Lähetetään parametrejä Servletilla -->
   Etunimi: <input type="text" name="etunimi" />
   Sukunimi: <input type="text" name="sukunimi" />
   <input type="submit" />
</form>*/

















