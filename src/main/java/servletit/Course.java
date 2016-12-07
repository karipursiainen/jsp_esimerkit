package servletit;

/**
 * 07.11.2016
 */

public class Course {
	
	private String name;
	private int days;
	
	public Course() {
		super();
	}

	public Course(String name, int days) {
		super();
		this.name = name;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", days=" + days + "]";
	}
	
	

}
