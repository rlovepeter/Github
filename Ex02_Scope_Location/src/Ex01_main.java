/*
Ŭ���� == ���赵 == Ÿ�� �̴�
Ŭ������ �⺻ ������� : �ʵ�(������,���°�,������) + �Լ�(���)
������(������) : public , private , default(���� �ʴ°�) , protected(���)
 
1. public class Test{}  

2. class Test{} >> default �����ڰ� �����Ǿ���
(default ������ : ���� ���� �ȿ� �������� , �ٸ� ������ ������ ��� �Ұ�

3. default class �� ���� ��� : ���� ���������� �ٸ� Ŭ������ ���� ����,
                                    ������������
 

4. �ϳ��� �ڹ� ������ (a.java) �������� Ŭ������ ���� �� �ִ�
   >>Ex01_main.java
   >>class Test{  }  �ڵ� ���� .... �����δ� ....������ �ȵǿ� ...
   >>�� public Ű����� Ŭ�����ϳ���
 



default : ���� ���� ������ ����

*/



import kr.or.bit.Apt;
import kr.or.bit.Emp;
import kr.or.bit.Human;


class Test{  //default class
	int i;   //default int i
	
	void print() {  //default void print()
		System.out.println("default");
	}
}

public class Ex01_main {

	public static void main(String[] args) {
		Person p = new Person();
		p.name ="����";
		
		//kr.or.bit ���� �ȿ� �ִ� Car Ŭ���� ���
		//kr.or.bit.Apt apt = new kr.or.bit.Apt();
		Apt apt = new Apt();
	    apt.aptname = "����";
	    apt.write_window(0);
	    System.out.println(apt.read_window());
	    
	    
	    
	    Test t = new Test();
	    t.i = 100;
	    
	    Emp e = new Emp();
	    e.setEmpno(-8888);
	    System.out.println(e.getEmpno());
	    
	    e.mgr = -8888;
	    System.out.println(e.mgr);
	    
	    Human h = new Human();
	   
	}

}
