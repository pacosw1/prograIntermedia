import java.io.*;
class LeerAmigo{
   public static void main(String arg[]){
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
         f=new File("C:\\Users\\paco\\Documents\\GitHub\\prograIntermedia\\final2\\amigos.txt");
         f2=new FileInputStream(f);
         f3=new InputStreamReader(f2);
         f4=new BufferedReader(f3);
         String line = f4.readLine();
         while(line!=null){
            System.out.println(line);
            line = f4.readLine();
         }
         f4.close();
      }
      catch(IOException e){System.out.println("erroro");}

   }
}
