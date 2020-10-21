// Waleed Akhtar

import java.util.Arrays;

public class Actor {
	private String name;
	private String address;
	private int age;
	private Film[] myFilms;
	public Actor(String na, String add, int ag) {
		this.name = na;
		this.age = ag;
		this.address = add;
		myFilms = null;
	}

	// Copy class
	public Actor(Actor copyActor) {
		this.name = copyActor.getName();
		this.age = copyActor.getAge();
		this.address = copyActor.getAddress();
		Film[] oldFilms = new Film[3];
		for (int i = 0; i < copyActor.getMyFilms().length; i++){
			oldFilms[i] = copyActor.getMyFilms()[i];
		}
		this.myFilms = oldFilms;
	}

	// Setter and getter for Name
	public void setName(String na) {
		this.name = na;
	}

	public String getName() {
		return name;
	}

	// Setter and getter for Address
	public void setAddress(String add) {
		this.address = add;
	}

	public String getAddress() {
		return address;
	}

	// Setter and getter for Age
	public void setAge(int ag) {
		this.age = ag;
	}

	public int getAge() {
		return age;
	}

	// Setter and getter for MyFilms
	public void setMyFilms(Film[] filmsList) {
		this.myFilms = filmsList;
	}

	public Film[] getMyFilms() {
		return myFilms;
	}

	@Override
	public String toString() {
		return "Actor " +
				"Name = " + name + '\'' +
				" Address =" + address + '\'' +
				" Age = " + age +
				" Films = " + Arrays.toString(myFilms);
	}
	
	public void print(){
		System.out.println("Actor " +
				"Name = " + name + '\'' +
				" Address =" + address + '\'' +
				" Age =" + age +
				" Films =" + Arrays.toString(myFilms));
	}
}

