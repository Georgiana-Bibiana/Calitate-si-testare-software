package Clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements ZooInterface{
	private Zookepper zookepper;
	private List<Animal> animalList;
	
	public Zoo() {
		animalList=new ArrayList<>();
		zookepper=new Zookepper("Ion");
	}

	public Zoo(Zookepper zookepper, List<Animal> animalList) {
		
		this.zookepper = zookepper;
		this.animalList = animalList;
	}
	
	public void addAnimal(Animal animal) {
		animalList.add(animal);
	}
	
	public void feedAllAnimals() {
		for(Animal animal : animalList) {
			zookepper.Feed(animal);
		}
	}
	
	
	
}
