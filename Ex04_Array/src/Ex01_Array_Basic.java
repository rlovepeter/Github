import java.util.Arrays;

//�迭(Array)�� ��ü�� 
public class Ex01_Array_Basic {
	public static void main(String[] args) {
		int[] score = new int[3];
		System.out.println("score ���� (����) : " + score); //�迭���۰��� �ּ� 
		System.out.println(score[0]);
		score[1] = 333;
		System.out.println(score[1]);
		System.out.println(score[2]);
		//Array ������ ���� ������ �ִ� ( �� ���� ũ���(int) 4byte)
		//������ �濡 ���� ������ : ÷�� , index �� ���� : �迭�� ���۰� : 0
		//score[0] , score[1] , score[2]
		//�迭�� ����(length) 3��
		//�迭�� ������ ÷�� ���� : length -1
		//�迭�� Ÿ���� default�� �� ������
		
		//score[3] = 500;
		//����(Exception �߻�) >> ���� >> ���α׷��� ���� ���� 
		//java.lang.ArrayIndexOutOfBoundsException: 3
		//���� ���ô�...
		
		//Array �� ���� ���� ���� ����� �����ϱ�� ? for��
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.printf("score[%d]=%d\t",i,score[i]);
		}
		
		System.out.println();
		for(int i = 0 ; i < score.length ; i++) {
			System.out.printf("score[%d]=%d\t",i,score[i]);
			
		}
		
		System.out.println();
		//Array ���� �����ִ� ���� Ŭ���� (helper Ŭ����)
		String result = Arrays.toString(score);
		System.out.println(result);
		
		score[0] = 666;
		result = Arrays.toString(score);
		System.out.println(result);
		
		Arrays.sort(score); //���� ������ ����(���� �ȵǿ� ��а� ...)
		result = Arrays.toString(score);
		System.out.println(result);
		
		
		//POINT (�ϱ�)
		
		//�迭�� ����� 3���� ���
		int[] arr = new int[5]; //�⺻ : ���� ũ�� 
		int[] arr2 = new int[]{100,200,300}; //����(�ʱⰪ) ���� �迭����
		int[] arr3 = {11,12,13,14,15}; //���� ���� (�����Ϸ��� ���������� new)
		
		//javascript : var cars = ["Saab","Volvo","BMW"]
		for(int i = 0 ; i < arr3.length ; i++) {
			System.out.println(arr3[i]);
		}
		
		
		//Car c;
		//c = new Car(); ����� �Ҵ��� �и� 
		
		int[] arr4; //�迭 ���� (�⺻������ null)
		//arr4 = {1,2,3}; ����� �Ҵ��� �и� (���Ұ�)
		arr4 = new int[] {21,22,23,24,25}; //new�� �־�� �Ѵ�
		
		int[] arr5 = arr4; //�ּҰ� �Ҵ� 
		System.out.println(arr4 == arr5); //���� �ּ� 
		
		//�迭�� 8���� �⺻ Ÿ�� + String + ��������� Ŭ���� ...
		char[] ch = new char[10]; //default ���� '\u0000'
		for(int i = 0 ; i < ch.length ; i++) {
			System.out.println(">" + ch[i] + "<");
		}
	}

}
