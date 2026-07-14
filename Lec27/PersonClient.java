package Lec27;

public class PersonClient {

	public static void main(String[] args) {//throws Exception {
		// TODO Auto-generated method stub
		Person p = new Person("ankita", 18);
//		System.out.println(p.name);
//		p.age = 60;
//		System.out.println(p.age);
		p.setName("Koaml");
		System.out.println(p.getName());
		p.setAge(-90);
		System.out.println(p.getAge());
		System.out.println("Hey");

	}

}
