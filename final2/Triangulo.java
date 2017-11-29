import java.io.*;
class Triangulo extends Figuras{



	public Triangulo(double base, double altura) {
		super(base,altura);
    this.area = area();
		this.perimetro = perimetro();
		this.nombre = this.getClass().getSimpleName();
	}

  public double area() {
    return (base*altura)/2;
  }
  public double perimetro() {
    return base*3;
  }

	@Override
	public String toString() {
		return nombre + "   area  "+area+"    per "+perimetro +"\n";
	}
}
