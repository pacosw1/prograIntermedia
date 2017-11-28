abstract class Mamifero {
  protected String feeding;
  protected String hairType;
  protected double weight;
  protected String origin;
  protected String habits;
  protected double length;

	public Mamifero(double weight, double length) {
		this.feeding = feeding;
		this.hairType = hairType;
		this.weight = weight;
		this.origin = origin;
		this.habits = habits;
		this.length = length;
	}
  public void setAttr() {
    feeding = "none";
    hairType = "none";
    origin = "none";
    habits = "none";
  }

  public abstract double imc();

	public String getFeeding() {
		return feeding;
	}

	public String getHairType() {
		return hairType;
	}

	public double getWeight() {
		return weight;
	}

	public String getOrigin() {
		return origin;
	}

	public String getHabits() {
		return habits;
	}

	public double getLength() {
		return length;
	}


	public void setFeeding(String feeding) {
		this.feeding = feeding;
	}

	public void setHairType(String hairType) {
		this.hairType = hairType;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void setHabits(String habits) {
		this.habits = habits;
	}

	public void setLength(double length) {
		this.length = length;
	}



	public String toString() {
    setAttr();
		return "Mamifero [feeding=" + feeding + ", hairType=" + hairType + ", weight=" + weight + ", origin=" + origin + ", habits=" + habits + ", length=" + length + "]";
	}
}
