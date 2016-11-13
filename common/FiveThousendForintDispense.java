package common;

public class FiveThousendForintDispense implements BillDispenserChain {

	BillDispenserChain next;
	int fiveThousendForints = 5000;

	@Override
	public void setNext(BillDispenserChain nextChain) {
		// TODO Auto-generated method stub
		next = nextChain;
	}

	@Override
	public void dispense(Money money) {
		// TODO Auto-generated method stub
		int bankNotePieces = money.getAmount() / fiveThousendForints;
		int remainder = money.getAmount() % fiveThousendForints;
		System.out.println("5 000 Ft banknotes handed out: " + bankNotePieces);
		Money remainMoney = new Money(remainder);
		if (next != null) {
			next.dispense(remainMoney);
		}
	}
}
