import java.util.Scanner;

public class CarDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your car's paint color:");
		String paint = keyboard.nextLine();
		System.out.println("Enter your car's interior:");
		String interior = keyboard.nextLine();
		System.out.println("Enter your car's engine type:");
		String engine = keyboard.nextLine();
		System.out.println("Enter your car's tires:");
		String tires = keyboard.nextLine();
		
		Car myCar = new Car(paint, interior, engine, tires);
		
		System.out.println("Your vehicle is ready......");
		System.out.println("Paint:     " + myCar.getPaint());
		System.out.println("Interior:  " + myCar.getInterior());
		System.out.println("Engine:    " + myCar.getEngine());
		System.out.println("Tires:     " + myCar.getTires());
	}

}
