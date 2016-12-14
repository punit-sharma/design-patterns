package abstractFactory;

public class Main {

	public static void main(String args[]){
		
		AbstractFactory abstractFactory=new AbstractFactory();
		
		paymentFactory paymentfactory1=abstractFactory.getPaymentFactory("online");
		Payment p1=paymentfactory1.getPayment("paytm");
		System.out.println("P1 Payment Mode: " + p1.makePayment());
		Payment p2=paymentfactory1.getPayment("netbanking");
		System.out.println("P2 Payment Mode: " + p2.makePayment());
		
		paymentFactory paymentfactory2=abstractFactory.getPaymentFactory("offline");
		Payment p3=paymentfactory1.getPayment("cheque");
		System.out.println("P3 Payment Mode: " + p3.makePayment());
		Payment p4=paymentfactory1.getPayment("draft");
		System.out.println("P4 Payment Mode: " + p4.makePayment());
		
	}
	
	
	
}
