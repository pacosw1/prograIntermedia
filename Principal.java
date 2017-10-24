class Principal {
  public static void main(String[] args) {
  System.out.println("Gold\n");
  Cliente gold = new Cliente();
  Platino platino = new Platino();
  gold.transaction(100.23);
  gold.transaction(100.23);
  gold.transaction(23000.32);
  System.out.println(gold);
  System.out.println("\nPlatino\n");
  
  platino.transaction(500.23);
  platino.transaction(500.23);
  platino.transaction(500.23);
  platino.transaction(500.23);
  platino.transaction(500.23);
  platino.transaction(20000.23);
  
  System.out.println(platino);
    }
}
