import java.util.Scanner;

/*
������ ��Ģ ����� (+ , - , * , /)
�Է°� 3�� (�Է°��� nextLine() �޾Ƽ� �ʿ��ϴٸ� ���� ��ȯ)
���� : Integer.parseInt() ,  equals() Ȱ��
ȭ��
>�Է°�:100
>�Է°�(��ȣ): +
>�Է°�:600
>������ :700

-------------
>�Է°�:100
>�Է°�(��ȣ): -
>�Է°�:100
>������ :0
  
��ȣ�޴� ��)
String opr = sc.nextLine();
 
hint) if(){} else if(){} 
hint) if(opr == "+"){ ���ϱ� �����Ұž� } (���� XXXXXXXX)
Today Point
���ڿ��� ���� �񱳴� == �ƴϰ� (equals() �Լ��� ����Ѵ�
hint) if(opr.equals("+")){ ���ϱ� ���� }
*/
public class Ex09_Operation_Quiz {

	public static void main(String[] args) {
		/*
		String str = "+";
		if(str.equals("+")) {
			System.out.println("+");
		}
		
		int i = 100;
		if(i == 100) {
			System.out.println(i);
		}
		*/
		String opr="";//���ڿ� �ʱ�ȭ
	    int input_1=0;
 	    int input_2=0;
  	    int result=0;

	      Scanner sc = new Scanner(System.in);
         
		  System.out.print("�����Է�: ");
		  input_1 = Integer.parseInt(sc.nextLine()); //sc.nextInt()
		 
		  System.out.print("�����ȣ(+,-,*,/): ");
		  opr = sc.nextLine();

		  System.out.print("�����Է�: ");
		  input_2 = Integer.parseInt(sc.nextLine());

		  if(opr.equals("+")) {
			  result = input_1 + input_2;
		  }else if(opr.equals("-")) {
			  result = input_1 - input_2;
		  }else if(opr.equals("*")) {
			  result = input_1 * input_2;
		  }else if(opr.equals("/")) {
			  result = input_1 / input_2;
		  }else {
			  System.out.println("�������� �ʴ� ������ �Դϴ�");
			  //key point (���⼭�� main �Լ�)
			  //return Ű���� :  [�Լ�����]�� ������  > main �Լ� Ż�� > ����
			  return;
		  }
		  System.out.printf("[%d %s %d = %d]",input_1,opr,input_2,result);
	}

}
