
class Rectangulo extends Figuras{

	public Rectangulo(double base, double altura) {
		super(base,altura);
		this.area = area();
		this.perimetro = perimetro();
		this.nombre = this.getClass().getSimpleName();

	}

  public double area() {
    return base*altura;
  }
  public double perimetro() {
    return (base*2) + (altura*2);
  }


	@Override
	public String toString() {
		return  nombre+"		area:	"+area+"		per:	"+perimetro+"\n";
	}
}
