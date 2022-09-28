package dersIkiOdev;

public class Product_Sout {

	public static void main(String[] args) {
		
		
		
		new Product ("123", "MacBook", "MacBoookPro", 5449.99, 10, "askcnkjdncksn", 9.99, "M12345"); 
		
		
			
		
		
		 
		  Product product1 = new Product();
		  product1.setName("MacBook");
		  product1.setDescription("MacBook Pro"); 
		  product1.setDiscount(9.9);
		  product1.setId("123456789"); 
		  product1.setPrice(5449.99);
		  product1.setStockAmount(10);
		  product1.setImage("https://images.app.goo.gl/Z3LDoVrMuvoNWV9q7");
		  product1.setCode(); 
		  
		  ProductManager productManager = new ProductManager ();
		  productManager.Add(product1);
		  

	}

}
