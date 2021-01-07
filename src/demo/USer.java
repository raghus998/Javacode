package demo;

public class USer 
{
	public static void main(String[] args) {
		Bank FU = new Bank(1000);
		int Bal = FU.getBal();
		System.out.println("Frist USer Bal is :"+Bal);
		Bank SU = new Bank(20000);
		int Bal1 = SU.getBal();
		System.out.println("Secong USer Bal is :"+Bal1);
		
	}

}
