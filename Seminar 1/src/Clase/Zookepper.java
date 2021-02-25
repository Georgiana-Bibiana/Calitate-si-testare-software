package Clase;

public class Zookepper {
	private String name;

	public Zookepper(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void Feed(Animal animal) {
		System.out.println(name+ " hraneste animalul "+ animal.getName());
	}
}
