class Man { //Ŭ����=Ÿ��
	String name;
	int age;
}

class Test {
	
	Man add(Man m) {
		m.name = "����";
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
		//man ���������� man2 ���������� ���� �ּҰ��̴�
		System.out.println(man == man2);
		
		
		
	}
	
	Man add(Man x, Man y) {
		y.name = x.name;
		y.age = x.age;
		return y;
		
	}

}
