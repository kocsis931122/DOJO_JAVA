package common;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwentyThousendForintDispense dispenser20 = new TwentyThousendForintDispense();
		TenThousendForintDispense dispenser10 = new TenThousendForintDispense();
		FiveThousendForintDispense dispenser5 = new FiveThousendForintDispense();
		dispenser20.setNext(dispenser10);
		dispenser10.setNext(dispenser5);
		Money money = new Money(95000);
		dispenser20.dispense(money);

	}

}
