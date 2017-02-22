public class TicketDriver {
	public static void main(String[] args) {
		WalkUp myWalkUp = new WalkUp();
		Advance myAdvance = new Advance(12);
		StudentAdvance myStudentAdvance = new StudentAdvance(8);
		
		System.out.println(myWalkUp);
		System.out.println(myAdvance);
		System.out.println(myStudentAdvance);
	}	
}
