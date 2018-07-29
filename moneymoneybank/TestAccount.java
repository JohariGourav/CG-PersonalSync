package moneymoneybank;

//Class to test Account functionalities
public class TestAccount {

	public static void main(String[] args) {
		//creating 1st object with initial balance
		Account arvind = new Account("Arvind",10000);
		System.out.println(arvind);
		
		//getting next account number after 1st object
		int next = Account.getNextAccountNumber();
		System.out.println(next);
		
		//creating 2nd object with zero balance
		Account karan = new Account("Karan");
		System.out.println(karan);
		
		//getting next account number after 2nd object
		next = Account.getNextAccountNumber();
		System.out.println(next);
		
		//transferring balance test 1 
		String result = arvind.transaction(karan, 200);
		System.out.println(result);
		
		//Transferring balance test 2
		result = arvind.transaction(karan, arvind.getBalance());
		System.out.println(result);
		
		//Checking updated balance
		System.out.println(arvind);
		System.out.println(karan);
	}

}