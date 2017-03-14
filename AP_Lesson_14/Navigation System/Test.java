public class Test {
    public static void main(String[]args) {
		GMC bleh = new GMC(2.0, 3.0);
		System.out.println(getLocation(bleh.getLoc()));
    }
	
	public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}