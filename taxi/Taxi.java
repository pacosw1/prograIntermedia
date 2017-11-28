class Taxi extends Transporte {
  private Address station;

	public Taxi(String plateNum, Name driver, Address station) {
		super(plateNum, driver);
	}


 public void costo() {
   costo = 200.00;
 }
	public Address getStation() {
		return station;
	}

	public void setStation(Address station) {
		this.station = station;
	}


	@Override
	public String toString() {
    costo();
		return super.toString();
	}
}
