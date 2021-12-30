package examples;

import examples.controller.CreditCardAlgo;
import examples.controller.PaymentAlgo;
import examples.controller.ShoppingCart;
import examples.model.Product;

public class StratergyPattren2 {
	
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Product pants = new Product( "234", 25 );
		Product shirt = new Product( "987", 15 );
		
		cart.addProduct(pants);
		cart.addProduct(shirt);
		
		//payment through
		cart.pay(new PaymentAlgo("abc@gmail.com", "1234"));
		
		cart.pay(new CreditCardAlgo("ABC", "123456789"));
		
	}

}
