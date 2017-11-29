import java.io.*;
import java.util.*;
abstract class Figuras implements Serializable{

protected String nombre;
protected double area;
protected double perimetro;
protected transient double altura;
protected transient double base;

public abstract double area();
public abstract double perimetro();

public Figuras(double base, double altura) {
		this.altura = altura;
		this.base = base;
		this.area = area;
		this.perimetro = perimetro;
	}



}
