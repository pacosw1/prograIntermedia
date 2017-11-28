interface validaValores {
  boolean validRange(int calif);
  boolean validLetters(char l);
}
class Principal {
  public static void main(String[] args) {
    Alumno a = new Alumno();
    boolean grade = false;
    boolean letterGrade = false;
    int calif;
    char letter;
    do {
      calif = Lectura.getInt("Ingresar calificacion");
      letter = Lectura.readChar("Ingresar calif en Letra (A,B,C,D,E,F)");
      grade = a.validRange(calif);
      letterGrade = a.validLetters(letter);
    } while (grade == false || letterGrade == false);
    a.setCalif(calif);
    a.setLetterCalif(letter);
    System.out.println(a);
  }
}
class Alumno implements validaValores {
  private String listNumber;
  private int calif;
  private char letterCalif;

  public Alumno() {
    this.listNumber = listNumber;

  }

  public boolean validRange(int calif) {
    if (calif >= 1 && calif <=100)
      return true;
    else
      return false;
  }
  public boolean validLetters(char l) {
     char letter = Character.toLowerCase(l);
     if (letter == 'a' || letter == 'b' || letter == 'c' ||letter == 'd' || letter == 'e' || letter == 'f')
      return true;
     else
      return false;
  }

  public String getListNumber() {
    return listNumber;
  }

  public int getCalif() {
    return calif;
  }

  public char getLetterCalif() {
    return letterCalif;
  }

  public void setListNumber(String listNumber) {
    this.listNumber = listNumber;
  }

  public void setCalif(int calif) {
    this.calif = calif;
  }

  public void setLetterCalif(char letterCalif) {
    this.letterCalif = letterCalif;
  }
	@Override
	public String toString() {
		return "Principal [listNumber=" + listNumber + ", calif=" + calif + ", letterCalif=" + letterCalif + "]";
	}
}
