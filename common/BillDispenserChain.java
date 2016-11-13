package common;

public interface BillDispenserChain {
	void setNext(BillDispenserChain nextChain);

	void dispense(Money money);
}
