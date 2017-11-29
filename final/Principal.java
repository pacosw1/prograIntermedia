import java.io.*;
import java.util.*;
class Principal {
  public static void main(String[] args) {
    String studentsPath = "C:\\Users\\paco\\Documents\\GitHub\\prograIntermedia\\final\\students.dat";
    ArrayList<Object> students = new ArrayList<Object>();
    Save saveStudents = new Save(studentsPath);
    Student a = new Student("Paco", 82.32);
    Student b = new Student("Mario", 23.23);
    students.add(a);
    students.add(b);
    saveStudents.saveData(students);
    System.out.println(saveStudents.readData());

  }
}
