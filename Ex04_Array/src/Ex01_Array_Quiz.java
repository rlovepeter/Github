
public class Ex01_Array_Quiz {

	public static void main(String[] args) {
		// ���а� �л����� �⸻��� �������� 
		int[] score = new int[] {79,88,97,54,56,95};
		int max = score[0]; //79
		int min = score[0]; //79
		/*
		����� ����ؼ� max ������ �ִ밪(�ְ�����) min �������� �ּҰ�(��������) ����
		���� �ϼ���
		���) max > 97 , min > 54
		 */
		
		for(int i = 0 ; i < score.length ; i++) {
			
			//if(score[i]>max) max = score[i];
			
			//if(score[i]<min) min = score[i];
			
			max = (score[i] > max) ? score[i] : max;
			min = (score[i] < min) ? score[i] : min;
			
		}
		
		int[] number = new int[10];
		
		//10�� ���� ���� 1~10���� �ʱ�ȭ �ϰ� �;��
		//num[0]
		
		for(int i = 0 ; i < number.length ; i++) {
			number[i] = i+1;
			
			System.out.println(number[i]);
		}


		//��� �л��� �⸻��� ���� �����Դϴ� (5����)
		int sum = 0;
		float average = 0f;
		int[] jumsu = {100,55,90,60,78};
		
		/*
		1. �� �����
		2. ������ ��
		3. ������ ���
		��) 2,3 ������ �ϳ��� for���� ����ϼ���
		 */
		
		for(int i=0 ; i < jumsu.length ; i++) {
			
			sum += jumsu[i]; 
					
		}
		
		average = (float)sum / jumsu.length;
	
	System.out.printf("�Ѱ���� : [%d], ���� : [%d], ��� : [%f]", jumsu.length, sum, average);
}
}