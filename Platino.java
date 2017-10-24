class Platino extends Cliente {

  public Platino() {
    super();
  }


  public double transaction(double amount) {
    purchases++;
    System.out.println("Purchases: "+purchases);
    return super.transaction(amount);
  }


	@Override
	public String toString() {
    System.out.println("Purchases: "+purchases);
		return super.toString();
	}
}
