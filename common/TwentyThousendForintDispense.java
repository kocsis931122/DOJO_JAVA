package common;

public class TwentyThousendForintDispense implements BillDispenserChain {
	BillDispenserChain next;
	int twentyThousendForints = 20000;

	@Override
	public void setNext(BillDispenserChain nextChain) {
		// TODO Auto-generated method stub
		next = nextChain;
	}

	@Override
	public void dispense(Money money) {
		// TODO Auto-generated method stub
		int bankNotePieces = money.getAmount() / twentyThousendForints;
		int remainder = money.getAmount() % twentyThousendForints;
		System.out.println("20 000 Ft banknotes handed out: " + bankNotePieces);
		Money remainMoney = new Money(remainder);
		if (next != null) {
			next.dispense(remainMoney);
		}
	}

}
