class Rectangulo extends Figuras {

private double base;
private double altura;

	public Rectangulo(double base, double altura) {
		this.base = base;
    this.altura = altura;
	}

  public double area() {
    return base*altura;
  }
  public double perimetro() {
    return (base*2) + (altura*2);
  }


	@Override
	public String toString() {
		return "area"+area+"per"+perimetro;
	}
}
