class Dog extends Mamifero{


	public Dog(double weight, double length) {
		super(weight,length);
	}
	public double imc(){
		return weight / length;
	}

  public void setAttr() {
    feeding = "Dog Food";
    hairType = "fluffy";
    origin = "wolf";
    habits = "scratches butt";
  }





  	@Override
  	public String toString() {
      setAttr();
  		return "feeding=" + feeding + ", hairType=" + hairType + ", weight=" + weight + ", origin=" + origin + ", habits=" + habits + ", length=" + length + ", imc=" + imc() + "]";
  	}

	}
