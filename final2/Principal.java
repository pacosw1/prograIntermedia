import java.io.*;
import java.util.*;
class Principal {
  public static void main(String[] args) {
    String txt = "C:\\Users\\paco\\Documents\\GitHub\\prograIntermedia\\final2\\amigos.txt";
    ArrayList<Object> figs = new ArrayList<Object>();
    SaveText text = new SaveText(txt);
    text.saveData();
    ArrayList<String> values = text.readText();

    for (int i = 0; i < values.size();i++) {
        String[] curr = values.get(i).split(",");
        String name = curr[0].toLowerCase();double base = Double.valueOf(curr[1]);double alt = Double.valueOf(curr[2]);
        if (name.equals("cuadrado"))
            figs.add(new Cuadrado(base,alt));
        else if (name.equals("triangulo"))
          figs.add(new Triangulo(base,alt));
        else if (name.equals("rectangulo"))
          figs.add(new Rectangulo(base,alt));
        else
          System.out.println("Invalid entry");
    }

    Save reportes = new Save("C:\\Users\\paco\\Documents\\GitHub\\prograIntermedia\\final2\\reporte.dat");
    reportes.saveData(figs);
    ArrayList<Object> data = reportes.readData();
    for (int i =0; i < data.size();i++) {
      System.out.println(data.get(i));
    }

    //System.out.println(figs);
    /*


    String studentsPath = "C:\\Users\\paco\\Documents\\GitHub\\prograIntermedia\\final\\students.dat";
    ArrayList<Object> students = new ArrayList<Object>();
    Save saveStudents = new Save(studentsPath);
    Student a = new Student("Paco", 82.32);
    Student b = new Student("Mario", 23.23);
    students.add(a);
    students.add(b);
    saveStudents.saveData(students);
    System.out.println(saveStudents.readData());
    */
  }
}
