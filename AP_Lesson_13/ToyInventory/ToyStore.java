import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore {
	private static ArrayList<Toy> toyList;
	
	public ToyStore() {
		toyList = new ArrayList<>();
	}
	
	public ToyStore(String n) {
		loadToys(n);
	}
	
	public static void loadToys(String ts) {
		toyList = new ArrayList<Toy>();
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for (int i = 0; i < toys.size(); i += 2) {
			String name = toys.get(i);
			String type = toys.get(i + 1);
			Toy uniqueToy = getThatToy(name);
			if (uniqueToy == null) {
				if (type.equals("Car")) {
					toyList.add(new Car(name));
				} else if (type.equals("AF")) {
					toyList.add(new Car(name));
				}
			} else {
				uniqueToy.setCount(uniqueToy.getCount() + 1);
			}
		}
	}
	
	public static Toy getThatToy(String nm) {
		for (Toy t : toyList) {
			if (t.getName().equals(nm)) {
				return t;
			}
		}
		return null;
	}
	
	public static String getMostFrequentToy() {
		String name = "";
		int max = Integer.MIN_VALUE;
		
		for (Toy t : toyList) {
			if (max < t.getCount()) {
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
	}
	
	public static String getMostFrequentType() {
		int cars = 0;
		int figures = 0;
		
		for (Toy t : toyList) {
			if (t.getType().equals("Car")) {
				cars++;
			} else if (t.getType().equals("Action Figure")) {
				figures++;
			}
		}
		if (cars > figures) {
			return "Cars";
		} else if (figures > cars) {
			return "Action Figures";
		} else {
			return "Equal amounts of action figures and cars!!!";
		}
	}
		
	public String toString() {
		return toyList.toString();
	}
}
