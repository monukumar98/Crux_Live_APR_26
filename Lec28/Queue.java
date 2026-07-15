package Lec28;

public class Queue {

	private int[] arr;
	private int front = 0;
	private int size = 0;// size rear jaisa and number of element bhi batayega

	public Queue() {
		// TODO Auto-generated constructor stub
		this(5);
	}

	public Queue(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];

	}

	// O(1)
	public boolean isEmpty() {
		return size == 0;
	}

	// O(1)
	public int size() {
		return size;
	}

	// O(1)
	public boolean isFull() {
		return size == arr.length;
	}

	// O(1)
	public void Enqueue(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Bklol Vidyarthi Queue full hogya hai");
		}
		int idx = (front + size) % arr.length;
		arr[idx] = item;
		size++;
	}

	// O(1)
	public int Dequeue() throws Exception {
		if (isFull()) {
			throw new Exception("Bklol Vidyarthi Queue Empty hogya hai");
		}
		int item = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return item;

	}

	// O(1)
	public int getFront() throws Exception {
		if (isFull()) {
			throw new Exception("Bklol Vidyarthi Queue Empty hogya hai");
		}

		int item = arr[front];

		return item;

	}

	// O(1)
	public void Dispaly() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i)%arr.length;
			System.out.print(arr[idx]+" ");
		}
	}

}














