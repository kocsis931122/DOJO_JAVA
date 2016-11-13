package customstack;

public class CustomStack<T> {
	private int actualIndex;
	private int size;
	Object[] container;

	public int getSize() {
		return size;
	}

	public CustomStack(int size) {
		actualIndex = -1;
		this.size = size;
		container = new Object[size];
	}

	public void push(T newItem) throws StackOverflowError {
		if (actualIndex < size - 1) {
			actualIndex++;
			container[actualIndex] = (Object) newItem;
		} else {
			throw new StackOverflowError();
		}

	}

	public T pop() {
		if (actualIndex != -1) {
			T item = (T) container[actualIndex];
			container[actualIndex] = null;
			actualIndex--;
			return item;
		}
		return null;
	}

	public boolean isFull() {
		return actualIndex == size - 1;
	}

	public boolean isEmpty() {
		return actualIndex == -1;
	}

	public static void main(String[] args) {
		CustomStack<Integer> stack = new CustomStack<>(5);
		for (int i = 0; i < 6; i++) {
			if (!stack.isFull()) {
				System.out.println(i);
				stack.push(i);
			}
		}
		System.out.println();
		for (int i = 0; i < stack.getSize(); i++) {
			System.out.println(stack.pop());
		}
	}
}
