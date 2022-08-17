package collections;
import java.util.ArrayList;

public class CollectionsTest {
	public static void main(String [] args) {
		ArrayList<Animal>dogs0= new ArrayList<Dog>();
		ArrayList<Dog>dogs1 = new ArrayList<Animal>();
		ArrayList<Object>dogs2 = new ArrayList<Dog>();
		
		ArrayList<? extends Animal>dogs0s= new ArrayList<Dog>();
		dogs0s.add(new Animal());
		dogs0s.add(new Dog());
	}	
}
