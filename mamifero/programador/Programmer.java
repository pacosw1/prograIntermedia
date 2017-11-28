abstract class Programmer {
  protected Name name;
  protected int hours;
  protected String language;

	public Programmer(Name name, int hours, String language) {
		this.hours = hours;
		this.language = language;
    this.name = name;
	}
  public abstract double langValue();
  public abstract double wage();
  
}
