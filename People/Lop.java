package People;

import java.util.ArrayList;

public class Lop {
	
	private ArrayList<Person> people;

	public Lop() {
		this.people = new ArrayList<>();
	}

	public ArrayList<Person> getPeople() {
		return people;
	}

	public void setPeople(ArrayList<Person> people) {
		this.people = people;
	}
	
	public void add(Person person) {
		if(person != null)
			this.people.add(person);
	}
	
	public void remove(Person person) {
		Person personToDelete = null;
		for(Person arg : this.people) {
			if(arg == person) {
				personToDelete = arg;
			}
		}
		this.people.remove(personToDelete);
	}
	
	public Person find(String name) {
		for(Person arg : this.people) {			
			if(arg.getName() == name) {
				return arg;
			}
		}
		return null;
	}
	
	public void print() {
		int i = 1;
		System.out.println("\nList of People");
		for(Person arg : this.people) {
			System.out.println(i + ".- " + arg.getName());
			i++;
		}
	}

}
