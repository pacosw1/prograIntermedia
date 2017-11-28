class Dolphin extends Mamifero {
private transient String namess;

public Dolphin(double weight, double length) {
								super(weight, length);
}

public void setAttr() {
								feeding = "Fish";
								hairType = "none";
								origin = "sea";
								habits = "being intelligent";
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
