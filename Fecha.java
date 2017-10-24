class Fecha
{
   private int dia;
   private int mes;
   private int year;

   public Fecha(int dia, int mes, int year)
   {
      setDia(dia);
      setMes(mes);
      setYear(year);
   }




	public int day() {
		return dia;
	}

	public int month() {
		return mes;
	}

	public int year() {
		return year;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setYear(int year) {
		this.year = year;
	}



	@Override
	public String toString() {
		return dia +"/" + mes + "/" + year;
	}
}
