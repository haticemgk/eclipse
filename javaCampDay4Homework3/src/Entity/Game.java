package Entity;

public class Game {
	
	private int id;
	private String gameName;
	private double unitPrice;
	private double discountedPrice;
	
	
	public Game(int id, String gameName, double unitPrice, double discountedPrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
		this.discountedPrice = discountedPrice;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return gameName;
	}


	public void setName(String name) {
		this.gameName = name;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public double getDiscountedPrice() {
		return discountedPrice;
	}


	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	
	

}
