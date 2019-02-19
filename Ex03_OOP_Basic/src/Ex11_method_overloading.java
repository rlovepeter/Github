/*
��ü ���� ��� Ư¡
��� , ĸ��ȭ , ������ ...

ĸ��ȭ (����ȭ) -> private 

[method overloading]
[�ϳ��� �̸�]���� [�������� ���]�� �ϴ� �Լ�
��� : System.out.println()  ��ǥ���� ��
Ư¡ : �����ε� ������� ������ ���� �ʴ´�
      Why) ���ϰ� �����(���) >> ������
      ����� � ���� ��� : �Լ��� Ȱ���� ���� ���

���� : �Լ��� �̸��� ���� parameter �� [����]�� [Ÿ��]�� �޸��ϴ� ���
1. �Լ��� �̸��� ���ƾ� �Ѵ�
2. [parameter] ���� �Ǵ� [Type]�� �޶�� �Ѵ�
3. return Type overloading �Ǵܱ����� �ƴϴ�
4. parameter ������ �ٸ��� ���� ......

*/

class Human{
	String name;
	int age;
}

class OverTest{
	
	void add(Human h) { //class == Type
		h.name = "ȫ�浿";
		h.age  =100;
		System.out.println(h);
	}
	
	
	int add(int i) {
		return 100 + i;
	}
	
	String add(String s) {
		return "hello" + s;
	}
	
	//void add(int k) {} �ȵǿ� (parameter type �浹)
	int add(int i , int j) {
		return i + j;
	}
	
	void add(int i , String s) {
		System.out.println("�����ε�");
	}
	
	void add(String s , int i) { //������ �ٸ��� ���� �մϴ�
		System.out.println("���� ���� : overloading");
	}
	
	//�迭(Array) �蟜����
	//�����߱� ....
	//int[] source = {10,20,30,40,50};
	int[] add (int[] param) { //parameter �� int �迭�� �ּҰ��� �ްڴ�
		int[] target = new int[param.length];
		for(int i = 0 ; i < param.length ; i++) {
			target[i] = param[i]+1;
		}
		return target; //int Ÿ���� �迭�� �ּҰ��� return
	}
	
	int[] add(int[] so, int[] so2 ) {
		
		
		return null;
		
	}
	
	
	
}


public class Ex11_method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println(100);
		System.out.println("HELLO");
		
		OverTest ot = new OverTest();
		System.out.println(ot.add(100));
		//ot.add(3.1f);  //add(float f) ����(x)
		
		ot.add(100,"H");
		
		Human human = new Human();
		ot.add(human);
		System.out.println(human.name);
		System.out.println(human.age);
		
		ot.add(new Human());
		*/
		OverTest ot = new OverTest();
		//int Ÿ���� �迭�� �ּҸ� �־�� ....
		int[] source = {10,20,30,40,50};
		System.out.println(source);
	    int[] target = ot.add(source); //I@15db9742 �ּҰ�
	    for(int i = 0 ; i < target.length ; i++) {
	    	System.out.println(target[i]);
	    }
	}

}








