package dersIkiOdev;

public class ProductManager {
	public void Add(Product product) {
		//JDBC
	System.out.println("Ürün Resmi Eklendi: " + product.getImage());
	System.out.println("Ürün İsmi Eklendi: " + product.getName());
	System.out.println("Ürün Kodu eklendi: " + product.getCode());
	
	}
	

}
