import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the account holder name");
		String name1=input.nextLine();
		System.out.println("enter the account no");
		int account_No=input.nextInt();
		Account z = new Account();
		System .out.println("the balance in the account is" );
		double balance=input.nextDouble();
		System.out.println("enter the deposit amount");
	double deposit=input.nextDouble();
	System.out.println("the total balance in my account is" + z.total(deposit, balance));

	}

}
