class Circulo extends Figuras {


private double radio;

	public Circulo(double radio) {
		super(nombre,area,perimetro);
	}


	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
  

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
}
