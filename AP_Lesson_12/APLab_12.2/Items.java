
public class Items {
	private String manufacturer;
	private String name;
	private int UPC;
	private String category;
	private double price;
	
	public Items(String mnfctr, String nme) {
		manufacturer = mnfctr;
		name = nme;
		UPC = (int)(Math.random() * 1000000) + 1;
		category = "";
		price = 0.00;
	}
	
	public Items(String mnfctr, String nme, String ctgry, double prc) {
		manufacturer = mnfctr;
		name = nme;
		UPC = (int)(Math.random() * 1000000) + 1;
		category = ctgry;
		price = prc;
	}
	
	public String toString(){
		   return "Customer Info..."
		   		+ "\nManufacturer: " + manufacturer
		   		+ "\nItem Name:    " + name
		   		+ "\nUPC#:          " + UPC
		   		+ "\nCategory:     " + category
		   		+ "\nPrice:        $" + price;
		}
}
