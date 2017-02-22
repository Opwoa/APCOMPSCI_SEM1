import java.util.Random;

public abstract class GameSystem {
	private String platform;
	private int serialNo;
	
	public GameSystem() {
		Random rand = new Random();
		this.platform = "";
		this.serialNo = rand.nextInt(10000000);
	}
	
	public GameSystem(String p) {
		Random rand = new Random();
		this.platform = p;
		this.serialNo = rand.nextInt(10000000);
	}
	
	public String getPlatform() {
		return platform;
	}
	
	public int getSerialNo() {
		return serialNo;
	}
}
