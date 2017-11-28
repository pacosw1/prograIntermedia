class Principal {
  public static void main(String[] args) {
    int h = Lectura.readInt("Ingresar horas totales");
    String lang = Lectura.readString("Ingresar lenguaje de Desarollo");
    Junior j = new Junior(new Name("Mario","Moon","Moon"),h,lang);
    h = Lectura.readInt("Ingresar horas totales");
    lang = Lectura.readString("Ingresar lenguaje de Desarollo");
    Senior s = new Senior(new Name("Paco","Sainz","Williams"),h,lang);
    Programmer[] employees = {j,s};
    for (int i = 0; i < employees.length;i++) {
      System.out.println(employees[i] + "\n");
    }

  }
}
