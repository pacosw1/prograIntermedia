class Cat extends Mamifero{


	public Cat(double weight, double length) {
		super(weight,length);
	}

  public void setAttr() {
    feeding = "Tuna";
    hairType = "furrr";
    origin = "no one knows";
    habits = "being rude";
  }
	public double imc(){
		return weight / length;
	}



  	@Override
  	public String toString() {
      setAttr();
  		return "feeding=" + feeding + ", hairType=" + hairType + ", weight=" + weight + ", origin=" + origin + ", habits=" + habits + ", length=" + length + ", imc=" + imc() + "]";
  	}
}
