package JavaTraining;

public class TestBank {

	
	 public static void main(String[] args)
	 {
	HSBCBank bank = new HSBCBank();
	bank.credit();
	bank.debit();
	//bank.min_bal;
	bank.educationLoan();
	bank.transferMoney();
	System.out.println("*****************");
	bank.credit();
	bank.debit1();
	System.out.println("*****************");
	USBankInterface bank1 = new HSBCBank();
	bank1.credit(); //only overidding method will be allowed
	bank1.debit();
	bank1.transferMoney();
	
	 }
}
