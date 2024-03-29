
import java.io.*;
import java.util.*;

class SaveToFile implements Serializable {

public SaveToFile() {
}

public ArrayList<Cliente> readCliente(String path) {
        FileInputStream fis = null;
        ArrayList<Cliente> objectsList = new ArrayList<Cliente>(); //Ingredient specified as type
        boolean cont = true;
        try{
                fis = new FileInputStream(path);
                ObjectInputStream input = new ObjectInputStream(fis);
                while(cont) {
                        Cliente obj = (Cliente)input.readObject(); //reads objects from file and adds them to an arraylist which is then returned
                        if(obj != null)
                                objectsList.add(obj);
                        else
                                cont = false;
                }
        }catch(Exception e) {
                //System.out.println(e.printStackTrace());
        }
        return objectsList;
}

public void saveCliente(ArrayList<Cliente> ingredients, String path) {     //saves ingredient object to .dat file.

        ArrayList<Cliente> current = readCliente(path); //uses the read method tu get all saved objects from the file.
        for (int j = 0; j< ingredients.size(); j++) //adds the ingredient array to arraylist.
        {
                current.add(ingredients.get(j));
        }
        FileOutputStream f1 = null;
        ObjectOutputStream f2=null;
        try {
                f1 = new FileOutputStream(path);
                f2 = new ObjectOutputStream(f1);
                for (int j = 0; j< current.size(); j++) //writes all old and new Objects to file from the arrayList;
                {
                        f2.writeObject(current.get(j));
                }

        }
        catch(IOException e) {System.out.println("No se almaceno");}
        finally {
                try {
                        f2.close();
                        f1.close();
                }
                catch(IOException e) {System.out.println("Error al cerrar el archivo");}
        }
}

}
