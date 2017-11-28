import java.util.*;
import java.io.*;

class Cliente implements Serializable {
private Name name;
private int type;
private CurrentDate date;
private ArrayList<Double> monto;
private String clienteNum;


public String toString() {
        monto = sortArray();
        return "Cliente [name=" + name + ", type=" + type + ", date=" + date + ", monto=" + monto + "]";
}

public Cliente(Name name, int type, CurrentDate date, ArrayList<Double> monto,String clienteNum) {
        this.name = name;
        this.type = type;
        this.date = date;
        this.clienteNum = clienteNum;
        this.monto = monto;
}

public ArrayList<Double> sortArray()
{
        int len = monto.size();
        ArrayList<Double> arr = new ArrayList<Double>();
        double curr = 0.0;
        int highIndex = 0;
        double high = monto.get(0);
        for (int i = 0; i <  len; i++)
        {
                high = 0;
                for (int j = 0; j < monto.size(); j++) {
                        curr = monto.get(j);
                        if (curr >= high) {
                                high = curr;
                                highIndex = j;
                        }
                }
                monto.remove(highIndex);
                arr.add(high);
        }
        return arr;
}




}
