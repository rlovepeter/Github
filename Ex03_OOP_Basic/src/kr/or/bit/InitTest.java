package kr.or.bit;

public class InitTest {
	public static int cv = 1; // static ���� , class ���� 
	public int iv = 1; // ����� �ʱ�ȭ 
	
	static { cv = 2; } //static �ʱ�ȭ ��, class �ʱ�ȭ ��
	{ iv = 2; } //�ν��Ͻ� �ʱ�ȭ �� 
	
	public InitTest() { //������ �Լ� (�ʱ�ȭ : instance variable �ʱ�ȭ)
		iv = 3;
	}
}
