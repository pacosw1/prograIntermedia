import java.io.*;
import java.util.*;
class SaveText {

  private String path;
  public SaveText(String path) {
    this.path = path;
  }


  public ArrayList<String> readText() {
    boolean cont = true;
  ArrayList<String> list = new ArrayList<String>();
    String nombre;
     String telefono;
     File f=null;
     FileInputStream f2=null;
     InputStreamReader f3=null;
     BufferedReader f4=null;
     try{
        //En la UDEM
        //f=new File("C:\\Users\\ideti\\Desktop\\Clase 14-11\\amigos.txt");
        //En mi PC
        f=new File(path);
        f2=new FileInputStream(f);
        f3=new InputStreamReader(f2);
        f4=new BufferedReader(f3);
        String line = f4.readLine();
        while(cont) {
          if (line != null) {
            list.add(line);
            line = f4.readLine();
          }
          else
            cont = false;
            //break;
        }
       f4.close();

     } catch(IOException e){System.out.println("erroro");}

     return list;
  }

  public void saveData() {
    String t = "";
    File f=null;
    FileOutputStream f2=null;
    PrintStream f3=null;
    try{
       //En la UDEM
       //f=new File("C:\\Users\\ideti\\Desktop\\Clase 14-11\\amigos.txt");
       //En mi PC
       f=new File(path);
       f2=new FileOutputStream(f,true);
       f3=new PrintStream(f2);
       String figura = Lectura.readString("Figura");
       String base = Lectura.readString("Base");
       String alt =  Lectura.readString("Altura");
       t = figura+","+base+","+alt;
       f3.println(t);
       f3.close();
    }
    catch(IOException e){System.out.println("No se registro la informacion");}

 }

  }
