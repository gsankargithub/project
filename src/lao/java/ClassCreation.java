package lao.java;

public class ClassCreation {

	Long accountno = 357894561754L;
	String holdername = "Sankar G";
	Integer amount = 21000;
	
public void getBalance() {
	System.out.println("Balance is "+amount);
	
}
	
	public static void main(String[] args) {
		
		ClassCreation account = new ClassCreation();
		account.getBalance();
		System.out.println(account.holdername);

	}

}
