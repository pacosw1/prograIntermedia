class Transporte {
  protected String plateNum;
  protected Name driver;
  protected double costo = 5.00;

	public Transporte(String plateNum, Name driver) {
		super();
		this.plateNum = plateNum;
		this.driver = driver;
	}

	public String getPlateNum() {
		return plateNum;
	}

	public Name getDriver() {
		return driver;
	}

	public void setPlateNum(String plateNum) {
		this.plateNum = plateNum;
	}

	public void setDriver(Name driver) {
		this.driver = driver;
	}


	@Override
	public String toString() {
		return "Transporte [plateNum=" + plateNum + ", driver=" + driver + "Costo" + costo+"]";
	}
}
