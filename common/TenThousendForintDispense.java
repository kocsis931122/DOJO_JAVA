package common;

public class TenThousendForintDispense implements BillDispenserChain {
	BillDispenserChain next;
	int tenThousendForints = 10000;

	@Override
	public void setNext(BillDispenserChain nextChain) {
		// TODO Auto-generated method stub
		next = nextChain;
	}

	@Override
	public void dispense(Money money) {
		// TODO Auto-generated method stub
		int bankNotePieces = money.getAmount() / tenThousendForints;
		int remainder = money.getAmount() % tenThousendForints;
		System.out.println("10 000 Ft banknotes handed out: " + bankNotePieces);
		Money remainMoney = new Money(remainder);
		if (next != null) {
			next.dispense(remainMoney);
		}
	}

}
