class Cliente {
  private Name name;
  private Address address;

	public Cliente(Name name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}



	public Name getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Cliente [name=" + name + ", address=" + address + "]";
	}
}
