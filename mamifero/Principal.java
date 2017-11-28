import java.lang.reflect.Field;
class Principal {

public static void main(String[] args) {
        double w;
        double l;
        w = Lectura.readDouble("Ingresar peso en kg");
        l = Lectura.readDouble("Ingresar largo en cm");
        Dolphin d = new Dolphin(w,l);
        Field[] f = Dolphin.class.getDeclaredFields();
        String[] s = new String[10];
        for (int i = 0; i < f.length;i++) {
        
        System.out.print(f[i].getName());

}
        }
        }
       