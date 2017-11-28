class Junior extends Programmer {


	public Junior(Name name, int hours, String language) {
		super(name, hours, language);
	}

  public double langValue() {
    if (language.equals("c"))
      return 280.00;
    else if (language.equals("java"))
      return 200.00;
    else
      return 0.00;
  }
  public double wage() {
    return hours * langValue();
  }

  	@Override
  	public String toString() {
  		return name + "\nJunior in " + language + "\nWage: " + wage();
  	}
}
