package dersIkiOdev;



public class Product {
	
	
	
	public Product (String id, String name, String description,double price, int stockAmount, String image, double discount, String code) {
		System.out.println("Yapıcı blok çalışmadı.");
		
		/*this.code=code;
		this.description=description;
		this.discount=discount;
		this.id=id;
		this.image=image;
		this.name=name;
		this.price=price;
		this.stockAmount = stockAmount;*/
		
	}
	
	public Product() {
		
	}
		
		
	private String id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String image;
	private double discount;
	private String code;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getCode() {
		return code;
	}
	public void setCode() {
		this.code = name.substring(0,1) + id;
	}
	
	
	
	
	

}
