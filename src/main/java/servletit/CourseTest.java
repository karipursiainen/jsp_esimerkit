/**
 * 
 */
package servletit;

import java.util.ArrayList;

/**
 * @author oppi
 *
 */
public class CourseTest {

	/**
	 * 07.11.2016
	 */
	public static void main(String[] args) {
		
		ArrayList<Course> courses = new ArrayList<Course>();
		Course c1 = new Course("Servlet",1);
		Course c2 = new Course("Java ServerPages",1);
		Course c3 = new Course("Java ServerPages",2);
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);

	}

}
