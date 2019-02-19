package kr.or.bit;
/*
������ : ȫ�浿
��¥ : 2019-02-08
���� : Emp.java(�������)

class ���赵�̴�
���赵�� �⺻���� ������Ҵ� (����,�������� + ��������)
                              �Ӽ�(����)field + ���(�Լ�)method 
 
*/
public class Emp {
	public int empno; //���(���� > ���� > member field(instance variable)
	public String ename; //�̸�
	public String job; //����
	
	private int sal; //�޿� (ĸ��ȭ, ����ȭ : �����Ҵ�)
	//sal ���� write(set) , read)(get)
	
	public int getSal() { //read 
		return sal;
	}
	
	public void setSal(int sal) { //write (�����Ҵ�)
		if(sal < 0) {
			this.sal = 0;
		}else {
			this.sal =sal;
		}
	}
	
	private int mgr; //������ ���

	public int getMgr() { //read  (getter)
		return mgr;
	}

	public void setMgr(int mgr) { //write �ڵ� ���� ..(setter)
		this.mgr = mgr;
	}
	
	//���(�Լ�)
	public String getEmpInfo() {
		return empno + "/" + ename + "/" + job + "/" + sal;
	}
}







