import kr.or.bit.Emp;

//Array ���� ���� �߿��� �κ��� : ��ü�迭
//[�ǹ����� ���� ���� ���̴ϱ�]
public class Ex05_Object_Array {

	public static void main(String[] args) {
		//���Ի�� 3��
		//Array ����� �ʾҾ��
		Emp[] emplist = new Emp[3]; //�游��� �濡 ���� �־��ְ�
		emplist[0] = new Emp(); //0��°�� �ּҰ�
		emplist[0].setEmpno(1000);
		emplist[0].setEname("������");

		emplist[1] = new Emp(2000,"�ƹ���"); //1��° �ּҰ� 
		
		emplist[2] = new Emp(3000,"������");
		
		for(int i =0 ; i < emplist.length ; i++) {
			emplist[i].empInfo();
			//System.out.println();
		}
		
		//3�� Emp Ÿ���� �迭�� ����� ������ �濡 ��ü�� �ּҰ� �Ҵ� 
		//Emp[] arr = new Emp[]{10,20,30}
		Emp[] emplist2 = new Emp[] {new Emp(1,"�̾�"), new Emp(2,"�ھ�"), new Emp(3,"�达")};
		
		for(int i = 0; i < emplist.length ; i++) {
			emplist[i].empInfo();
		}
		//int[] arr = {10,20,30};
		Emp[] emplist3 = {new Emp(111,"A"), new Emp(222,"B")};
		for(int i = 0 ; i < emplist3.length ; i++) {
			emplist3[i].empInfo();
		}
	}

}
