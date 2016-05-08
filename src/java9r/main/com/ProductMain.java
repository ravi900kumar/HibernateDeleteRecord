package java9r.main.com;


import java9r.dao.com.*;
import java9r.entites.com.*;

public class ProductMain {
	public static void main(String[] args) {
		ProductDAO product = new ProductDAO();
		 // delete
		Product p=product.FindParticularProduct(2);
		product.delete(p);
		System.out.println("Successfully Deleted Product 2");
	
	}
}