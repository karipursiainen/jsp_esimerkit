package harjoitukset; 
/* 
Exercise: Use jsp_esimerkit as a base project for the exercises
Do the following class:

class Course
* add public properties name, (int) days

Create new courses: 

ArrayList<Course> courses = new ArrayList<Course>();
Course c1 = new Course("Servlet", 1); 
Course c2 = new Course("Java ServerPages", 1); 
Course c3 = new Course("Java ServerFaces", 2); 
courses.add(c1); // add all courses to the list

-------------------------------------------------
Servlet exercise
1 a) Show courses in HTML pages using Java Servlet
1 b) Add a new course in the form (and show it)

@WebServlet("/courses")  
public class CourseServlet extends HttpServlet {  
 // implementation
 } 
*/

public class Course {
	private int days;
	private String name;

	public Course() {}
	public Course(String name, int days) {
	  this.name = name;
	  this.days = days;
	}
	public void setName(String name) {this.name = name;}
	public void setDays(int days) {this.days = days;}
	public String getName() {return this.name;}
	public int getDays() {return this.days ;}
	public String toString() {
	  return name + "," + days;
	}
}











