import java.io.*;
class Cuadrado extends Figuras{


	public Cuadrado(double base,double altura) {
		super(base,altura);
		this.area = area();
		this.perimetro = perimetro();
		this.nombre = getClass().getSimpleName();
	}

	public double area() {
		return base*altura;
	}
	public double perimetro() {
		return base*4;
	}


	public void sets() {
		area = area();
		perimetro = perimetro();
	}
	@Override
	public String toString() {
		return nombre + "		area:	"+area+"	per:	"+perimetro+"\n";
	}

}
