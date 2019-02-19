/*
��ü������ (OOP) 3�� Ư¡
���
������
ĸ��ȭ(����ȭ) : private

1. ���
java > Child extends Base 
c#   > Child : Base

2. ���Ư¡ 
-���߻���� �Ұ� (���⼺ ....)
-���ϻ���� ��Ģ (������ ����� ����ؼ� ���߻���� ����)
-���߻���� ���� (�����ϰ� Interface)

3. �ǹ�
������ �ǹ� : [���뼺] >> �ݺ����� �ڵ� ... �����ڵ� ... �θ�
���� : �ʱ� ���� ��� ..

���뼺 >> ����� >> ���(�ð�, ����и� , �߻�ȭ)

Memory �ε� .... ��� ... ���� ���� Memory �ö� ������ 


 */

class GrandFahter {
	public int gmoney = 5000;
	private int pmoney = 50000; 
								//���� �԰� �����ž�(��������...) <- ��� X
								//���������� ���� �Ұ�
								//��Ӱ��� ���� �Ұ� 
	public GrandFahter() {
		System.out.println("�Ҿƹ��� ������");
	}
}

class Father extends GrandFahter {
	
	public int fmoney = 1000;
	public Father() {
		System.out.println("�ƹ��� ������");
	}
}

class Child extends Father {
	public int cmoney = 100;
	public Child() {
		System.out.println("�ڽ� ������ ");
	}
}
public class Ex01_Inherit {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.gmoney); //�Ҿƹ��� �� ����
		System.out.println(c.fmoney); //�ƹ��� �� ����
		System.out.println(c.cmoney); //������ ����
		//System.out.println(c.pmoney); //���� �Ұ� 

	}

}
