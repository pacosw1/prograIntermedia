import java.io.*;
import java.text.*;

class Lectura implements Serializable
{
public static boolean empty(String valor)
{
        if (valor == "")
                return true;
        else
                return false;
}
public static float positivo(float valor)
{
        if (valor <= 0)
                return positivo(Lectura.getFloat("Ingresar valor mayor a 0"));
        else
                return valor;
}
public static int positivo(int valor)
{
        if (valor <= 0)
                return positivo(Lectura.getInt("Ingresar valor mayor a 0"));
        else
                return valor;
}

public static char readSexo()
{
        String valor = Lectura.readString("Sexo h o m");
        valor = valor.toLowerCase();
        if (valor.equals("h") || valor.equals("m"))
                return valor.charAt(0);
        else
                return readSexo();
}

public static float getFloat(String mensaje)
{
        String v = Lectura.readString(mensaje);
        int m = 0;
        for (int i = 0; i < v.length(); i++)
        {
                if (!Character.isDigit(v.charAt(i)))
                        if ((v.charAt(i)) == '.')
                        {}
                        else
                                m++;
        }

        if (v.equals("") || m > 0)
                return getFloat(mensaje);
        else
                return Float.parseFloat(v);

}
public static int getInt(String mensaje)
{
        String v = Lectura.readString(mensaje);
        int m = 0;
        for (int i = 0; i < v.length(); i++)
        {
                if (!Character.isDigit(v.charAt(i)))
                        m++;
        }
        if (v.equals("") || m > 0 || v.length() > 10)
                return getInt(mensaje);
        else
                return Integer.parseInt(v);

}


public static int readInt(String mensaje)
{
        int check = 0;
        int g2 = 0;
        System.out.println(mensaje);
        DataInputStream w = new DataInputStream (System.in);
        String g = "";
        do
        {
                try
                {
                        g = w.readLine();
                        g2 = Integer.parseInt(g);
                        check = 0;
                }
                catch(IOException e) {check = 1;}
                catch(NumberFormatException e) {check = 1; System.out.println("Numero Invalido\n"+mensaje);}

        } while (check == 1);
        return g2;
}
public static float readFloat(String mensaje)
{
        System.out.println(mensaje);
        DataInputStream w = new DataInputStream (System.in);
        String g;
        try
        {
                g = w.readLine();
        }
        catch(IOException e) {g = "0";}

        float g2 = Float.parseFloat(g);
        return g2;

}


public static String readString(String mensaje)
{
        System.out.println(mensaje);
        DataInputStream w = new DataInputStream (System.in);
        String g;
        try
        {
                g = w.readLine();
        }
        catch(IOException e) {g = "1.";}
        return g;
}

public static char readChar(String mensaje)
{
        System.out.println(mensaje);
        DataInputStream w = new DataInputStream (System.in);
        String g;
        try
        {
                g = w.readLine();
        }
        catch(IOException e) {g = " ";}
        char g3 = g.charAt(0);
        return g3;
}

public static byte readByte(String mensaje)
{
        System.out.println(mensaje);
        DataInputStream w = new DataInputStream (System.in);
        String g;
        try
        {
                g = w.readLine();
        }
        catch(IOException e) {g = "0";}

        byte g2 = Byte.parseByte(g);
        return g2;
}

public static double readDouble(String mensaje)
{
        System.out.println(mensaje);
        DataInputStream w = new DataInputStream (System.in);
        String g;
        try
        {
                g = w.readLine();
        }
        catch(IOException e) {g = "0";}

        double g2 = Double.parseDouble(g);
        return g2;
}

public static long readLong(String mensaje)
{
        System.out.println(mensaje);
        DataInputStream w = new DataInputStream (System.in);
        String g;
        try
        {
                g = w.readLine();
        }
        catch(IOException e) {g = "0";}

        long g2 = Long.parseLong(g);
        return g2;
}

}
