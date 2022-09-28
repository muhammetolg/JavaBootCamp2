package oop1;

public class Main {

	

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setImageUrl("bilmemne.jpg");
		product1.setDiscount(7);
		product1.setUnitPrice(3);
		product1.setUnitsInStock(5);
			
		
		Product product2 = new Product();
		product2.setName("Belongi Kahve Makinesi");
		product2.setImageUrl ("dilmemne.jpg");
		product2.setDiscount (6);
		product2.setUnitPrice(2);
		product2.setUnitsInStock (4);
			
		
		Product product3 = new Product();
		product3.setName ("Celongi Kahve Makinesi");
		product3.setImageUrl ("cilmemne.jpg");
		product3.setDiscount  (5);
		product3.setUnitPrice  (1);
		product3.setUnitsInStock (3);
		
		Product[] products = new Product[] {product1,product2,product3};
		System.out.println("<ul>");
		for (Product product:products ) {
			
			System.out.println("<li>"+product.getName()+"</li>");
			
		} System.out.println("</ul>");
			
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setPhone("5071111111");
		individualCustomer.setId(12345);
		individualCustomer.setFirstName("Baki");
		individualCustomer.setLastName("BOZKURT");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		
		corporateCustomer.setCustomerNumber("54321");
		corporateCustomer.setPhone("5050000000");
		corporateCustomer.setId(12);
		corporateCustomer.setCompanyName("baboz");
		corporateCustomer.setTaxNumber("3489");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
			for(Customer customer : customers) {
			System.out.println(customer.getCustomerNumber());
		
			}
		
		
		

	}

}
