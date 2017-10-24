class Cliente {
  //private String rfc;
  //private Name name;
  //private String phone;
  //private Address address;
  //private String city;
  protected double highest = 0;
  protected Fecha fechaF = null;
  protected Fecha fechaL;
  protected int purchases = 0;

  public Cliente(/*Name name, String rfc, String phone, Address address, String city,*/ ) {
    /*
    setRfc(rfc);
    setName(name);
    setPhone(phone);
    setAddress(address);
    setCity(city);
    */
  }
  public  int accountAge() {
    int y1 = fechaF.year();
    int y2 = fechaL.year();
    return y2 -y1;
  }
  public double discount(double amount, int purchases) {
    if (amount >= 20000 && purchases > 5)
      return 0.08;
    else if (amount >= 20000)
      return 0.13;
    else
      return 0.05;

  }
  public void checkMax(double amount) {
    if (amount > highest)
      setHighest(amount);
  }

  public Fecha today() {
    CurrentDate d = new CurrentDate();
    return new Fecha(d.day(),d.month(),d.year());
  }
  public void firstPurchase() {
    if (fechaF == null) {
      setFechaF(today());
    }
  }
  public double transaction(double amount) {
    firstPurchase();
    setFechaL(today());
    checkMax(amount);
    accountAge(); double discount = discount(amount,purchases);
    System.out.println("Before Discount: "+amount);
    System.out.println("Discount: " + discount * 100 + "%");
    double total = amount - (amount *discount);
    System.out.println("Total: " + total + "\n");
    return total;
}
/*
	public String getRfc() {
		return rfc;
	}

	public Name getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public Address getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}
  */

	public double getHighest() {
		return highest;
	}

	public Fecha getFechaF() {
		return fechaF;
	}

	public Fecha getFechaL() {
		return fechaL;
	}
  /*
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}
  */

	public void setHighest(double highest) {
		this.highest = highest;
	}

	public void setFechaF(Fecha fechaF) {
		this.fechaF = fechaF;
	}

	public void setFechaL(Fecha fechaL) {
		this.fechaL = fechaL;
	}

	@Override
	public String toString() {
		return "Account age: " + accountAge() + " year/s\nhighest: " + highest + "\nfirstPurchase:" + fechaF + "\nLast: " + fechaF;
	}
}
