import java.util.*;
class Principal {
public static void main(String[] args) {
        CurrentDate d = new CurrentDate();
        SaveToFile s = new SaveToFile();
        ArrayList<Cliente> cs = new ArrayList<Cliente>();
         
        for (int i = 0; i < 2; i++)
        {
                Name name = new Name(Lectura.readString("Primer Nombre"),Lectura.readString("Apellido Paterno"),Lectura.readString("Apellido Materno"));
                ArrayList<Double> monto = new ArrayList<Double>();
                monto.add(Lectura.readDouble("Monto"));
                monto.add(Lectura.readDouble("Monto"));
                monto.add(Lectura.readDouble("Monto"));
                cs.add(new Cliente(name,2,d,monto,Lectura.readString("Numero de cliente")));
        }
        s.saveCliente(cs,"C:\\Users\\paco\\Documents\\GitHub\\prograIntermedia\\ferreteria\\clientes.dat");
         
        ArrayList<Cliente> cc = s.readCliente("C:\\Users\\paco\\Documents\\GitHub\\prograIntermedia\\ferreteria\\clientes.dat");
        for (int i = 0; i< cc.size(); i++) {
                System.out.print(cc.get(i));
        }


}
}
