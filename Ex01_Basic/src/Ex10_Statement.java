
public class Ex10_Statement {

	public static void main(String[] args) {
		/*
		 ���
		 ���ǹ�(�б⹮) : if(����,else,else if) , switch() case break... 
		 �ݺ��� : for(�ݺ�Ƚ��) , while(����) , do~while() ��������
		 break(��Ż��) ,continue(�Ʒ� ���� skip)
        */
		int count=0; //local variable (�ʱ�ȭ)
		if(count < 1) {
			System.out.println("True �Դϴ�");
		}
		
		if(count<1)System.out.println("True {����}");
		
		char data='A';  //���ǰ����� : [����] , [char] , [String] ����
		switch(data) {
			case 'A' : System.out.println("���ں�");
				break;
			default : System.out.println("default");
		}
		
		//�ݺ���
		int sum = 0;
		for(int i = 0 ; i <= 10 ; i++) {
			//System.out.println("i : " + i);
			//sum = sum + i;
			
			sum+=i;
		}
		System.out.println("1���� 10���� �� : " + sum);
		
		//for���� ����ؼ� 1~10������ Ȧ���� ���� ���� ������
		//for�� �ܿ� �ٸ� ������� ������� ������ (if (x))
		int sum2 =0;
		for(int i = 1 ; i <= 10 ;i+=2) {//i=i+2
			//System.out.println(i);
			sum2+=i;
		}
		System.out.println("1~10���� Ȧ���� ��: " + sum2);
		
		//1~100���� ¦���� �� (if������ؼ�)
		int sum3 = 0;
		for(int i = 0 ; i <= 100 ; i++) {
			if(i % 2 ==0) { //¦��
				sum3+=i;
			}
		}
		System.out.println("1~100���� ¦���� ��: " + sum3);
		
		//�Ի���� ��ǥ���� ����(������) : ����
		//for�� (��ø) >> �����
		for(int i = 2 ; i <=9 ;i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				 //System.out.println(i + "/" + j);
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		System.out.println("***********************************");
		//KEY POINT (break(Ż��) , continue(��ŵ))
		for(int i = 2 ; i <=9 ;i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				//if(i == j)continue; //�Ʒ� ������ skip (�׳� �Ѿ��) 
				if(i == j) break;
				System.out.printf("[%s]\t","*");
				//System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		
		for(int i =2 ; i <= 9 ; i++) {
			for(int j = 1 ; j < i ; j++) { //���� j < i
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 100 ; i >= 0 ; i--) { //���۰��� ū������ ....
			System.out.println("i : " + i);
		}
		
		//��̷� ... (�Ǻ���ġ) ... ����ó�� 
		System.out.println("�Ǻ���ġ");
		int a = 0, b = 1 , c =0;
		for(int i = 0 ; i < 10 ; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(" " + c);
		}
		System.out.println( ((int)(Math.random()*10)%3)+1);
	}
}






