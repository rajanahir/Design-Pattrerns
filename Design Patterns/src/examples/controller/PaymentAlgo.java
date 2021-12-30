package examples.controller;

public class PaymentAlgo implements Payment{
	private String email;
	private String password;
	
	
	
	public PaymentAlgo(String email, String password) {
		this.email = email;
		this.password = password;
	}

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " Paid with Paypal!");
		
	}

}
