package Lec25;

public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 121;
		System.out.println(CountPrime(n));
	}

	public static int CountPrime(int n) {
		int[] prime = new int[n];
		prime[0] = 1;// 0 is not prime
		prime[1] = 1;// 1 is not prime
		for (int i = 2; i * i <= prime.length; i++) {
			if (prime[i] == 0) {// i is a prime
				for (int j = 2; i * j < prime.length; j++) {
					prime[i * j] = 1;
				}
			}
		}
		int c = 0;
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == 0) {
				c++;
			}
		}
		return c;

	}

}
