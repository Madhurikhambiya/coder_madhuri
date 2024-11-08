package Abstract;

public class PaypalGateWay extends PaymentGateWay{

	@Override
	public void processpayment() {
		// TODO Auto-generated method stub
		System.out.println("payment process by paypal");
		
	}
	public static void main(String[] args) {
		CreditCardGateWay c = new CreditCardGateWay();
		c.processpayment();
		PaypalGateWay p = new PaypalGateWay();
		p.processpayment();
	}

}
