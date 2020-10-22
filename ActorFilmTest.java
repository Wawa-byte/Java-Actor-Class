// Waleed Akhtar

import java.util.ArrayList;

public class ActorFilmTest {

	public static void main(String[] args) {

		// Actor #1: Jack Nicholson
		Actor actor1 = new Actor("Jack Nicholson", "Miami", 74);
		Film[] film1 = new Film[3];
		film1[0] = new Film("Wolf");
		film1[1] = new Film("As good as it Gets");
		film1[2] = new Film("One flew Over the Cuckoo's Nest");
		actor1.setMyFilms(film1);
		for (int i = 0; i < 3; i++) {
			System.out.println(film1[i]);
		}

		// Actor #2: Violante Placido
		Actor actor2 = new Actor("Violante Placido", "Bologna", 38);
		Film[] film2 = new Film[3];
		film2[0] = new Film("The American");
		film2[1] = new Film("Ghost Rider Spirit of Vengeance");
		film2[2] = new Film("Barah Aanan");
		actor2.setMyFilms(film2);
		for (int i = 0; i < 3; i++) {
			System.out.println(film2[i]);
		}

		System.out.println('\n');

		// Creating an Array list
		ArrayList<Actor> actorArray = new ArrayList<>();
		actorArray.add(actor1);
		actorArray.add(actor2);

		// Print
		for(int i = 0; i < actorArray.size(); i++){ // For loop goes over the amount of actors added to the array list
			System.out.println("Actor Number #" + (i+1));
			System.out.println("Name: " + actorArray.get(i).getName());
			System.out.println("Address: " + actorArray.get(i).getAddress());
			System.out.println("Age: " + actorArray.get(i).getAge());
			for(int j = 0; j < 3; j++){
				System.out.println(actorArray.get(i).getMyFilms()[j]);
			}
		}

			System.out.println('\n');

			// Copy print
			Actor actor3 = new Actor(actor2);
			actor3.getMyFilms()[0] = new Film("Bambi");
			actor3.print();
			actor2.print();


	}
}
