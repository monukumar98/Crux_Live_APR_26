package Lec27;


public class StudentClinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.name="Kaju";
		s.age=20;
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name="Raju";
		s1.age=21;
		s.SayHey("Rohit");
		s1.Intro_yourSelf();
		s1.SayHey("Kunal");
		Student.Mentor_Name();
//		ArrayList<Integer> ll1 = new ArrayList<>(); 
//		ArrayList<Integer> ll2 = new ArrayList<>(); 
//		ll1.add(10);
//		ll2.add(20);
		
	}
	static {
		Student s2 = new Student();
		System.out.println("Hello hmm log static block main  me hu ");
	}

}
