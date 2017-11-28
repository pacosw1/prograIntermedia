class Senior extends Programmer {

	public Senior(Name name, int hours, String language) {
		super(name, hours, language);
	}

  public double langValue() {
    if (language.equals("c"))
      return 320.00;
    else if (language.equals("java"))
      return 290.00;
    else
      return 0.00;
  }

  public double wage() {
    return hours * langValue();
  }

	@Override
	public String toString() {
		return name + "\nSenior in " + language + "\nWage: " + wage();
	}
}
