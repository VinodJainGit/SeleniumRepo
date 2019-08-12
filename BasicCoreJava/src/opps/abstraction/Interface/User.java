package opps.abstraction.Interface;

public class User
{

	public static void main(String[] args) 
	{
		
		RBI bank=null;
		String bankname;
		
		//bankname="SBI";
		//bankname="citi";
		bankname="IDBI";
		
		if(bankname.equals("SBI"))
		{
			bank=new SBI();
		}
		else if(bankname.equals("IDBI"))
		{
			bank=new IDBI();
		}
		else if(bankname.equals("citi"))
		{
			bank=new Citi();
		}
		
		bank.creditCard();
		bank.debitCard();
		bank.savingAccount();
		bank.currentAccount();
		
		/*
		 * bank=new Citi(); bank.creditCard(); bank.debitCard(); bank.savingAccount();
		 * bank.currentAccount();
		 * 
		 * bank=new IDBI(); bank.creditCard(); bank.debitCard(); bank.savingAccount();
		 * bank.currentAccount();
		 */

	}

}
