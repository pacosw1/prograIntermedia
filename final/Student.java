import java.io.*;
class Student implements Serializable{
  private String name;
  private double gpa;

  public Student(String name, double gpa) {
  		this.name = name;
  		this.gpa = gpa;
  }

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}
}
