package Assignment.Entity2Assignment1;

public class MainProgram {
		public static void main(String[] args) {
	        // Creating 4 product objects
	        Product p1 = new Product(201, "Laptop", 55000.0);
	        Product p2 = new Product(202, "Smartphone", 25000.0);
	        Product p3 = new Product(203, "Headphones", 1500.0);
	        Product p4 = new Product(204, "Keyboard", 700.0);

	        System.out.println("Product Details:");
	        p1.displayDetails();
	        p2.displayDetails();
	        p3.displayDetails();
	        p4.displayDetails();
	    }
	}


