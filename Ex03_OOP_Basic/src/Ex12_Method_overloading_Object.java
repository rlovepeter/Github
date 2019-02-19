class Man { //클래스=타입
	String name;
	int age;
}

class Test {
	
	Man add(Man m) {
		m.name = "누구";
		m.age = 10;
		return m;
	}
}
public class Ex12_Method_overloading_Object {

	public static void main(String[] args) {
		Test t = new Test();
		Man man = new Man();
		Man man2 = t.add(man);
		System.out.println(man2.name + "/" + man2.age);
		//man 참조변수와 man2 참조변수는 같은 주소값이다
		System.out.println(man == man2);
		
		
		
	}
	
	Man add(Man x, Man y) {
		y.name = x.name;
		y.age = x.age;
		return y;
		
	}

}
