import java.io.*;
import java.util.*;
class Save implements Serializable{
  private String path;
  public Save(String path) {
    this.path = path;
  }

    public ArrayList<Object> readData() {
      FileInputStream fis = null;
      ArrayList<Object> objectsList = new ArrayList<Object>(); //Ingredient specified as type
      boolean cont = true;
      try{
              fis = new FileInputStream(path);
              ObjectInputStream input = new ObjectInputStream(fis);
              while(cont) {
                       //reads objects from file and adds them to an arraylist which is then returned
                      Object obj = input.readObject();
                      if(obj != null)
                              objectsList.add(obj);
                      else
                              cont = false;
              }
      }catch(Exception e) {
              System.out.println(e);
      }
      return objectsList;

    }
    public void saveData(ArrayList<Object> data) {     //saves ingredient object to .dat file.

            ArrayList<Object> current = readData(); //uses the read method tu get all saved objects from the file.
            for (int j = 0; j< data.size(); j++) //adds the ingredient array to arraylist.
            {
                    current.add(data.get(j));
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



	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
