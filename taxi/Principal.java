import java.io.*;
class Principal {
  public static void main(String[] args) {

    Cliente c = new Cliente(new Name("Paco","Sainz","Williams"), new Address("12","Calle","Col 1"));
    Taxi taxi = new Taxi("1212-12",new Name("Jaunito","Sanchez","Ramirez"), new Address("21","jumpstreet","col"));
    Transporte camion = new Transporte("1221-12",new Name("Mario","Alberto","Juarez"));
    System.out.println("Cliente");
    System.out.println(c);
    System.out.println("Taxi");
    System.out.println(taxi);
    System.out.println("Camion");
    System.out.println(camion);


  }
}
