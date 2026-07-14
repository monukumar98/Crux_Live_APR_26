package Lec27;

public class Student {

	String name;
	int age;

	public void Intro_yourSelf() {
		System.out.println("My name is " + name + " and age is " + age);
	}

	public void SayHey(String name) {

		System.out.println(this.name + " Say Hey " + name);
	}

	public static void Mentor_Name() {
		System.out.println("hmm sb ke pyaare Monu Bhaiya");
	}

	static {
		System.out.println("Hello hmm log static block1");
	}
	static {
		System.out.println("Hello hmm log static block2");
	}

}
