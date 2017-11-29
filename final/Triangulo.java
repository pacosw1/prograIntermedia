class Triangulo extends Figuras {



	public Triangulo(double base, double altura) {
		super(base,altura);
	}

  public double area() {
    return (base*altura)/2;
  }
  public double perimetro() {
    return base*3;
  }

	@Override
	public String toString() {
    area = area();perimetro = perimetro();
		return "Triangulo" + "area"+area+"per"+perimetro;
	}
}
