package kr.or.bit;
/*
å�� å�̸��� ������ ������ �ִ� 
å�� ���ǵǸ� �ݵ�� å�� å�� �̸��� ������ ������ �־�� �Ѵ�.
å�� �̸��� ���� ������ Ư�� ����� ���ؼ��� �� �� �ְ� ���ǵ� ���Ŀ��� ���� �Ұ� 
å�̸��� ���������� ���� ������ ���� �� �ִ� 
 */


public class Book {
	
	private String name;
	private int price;
	
	 
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	//public Book(){} �ݵ��... å�� �����ɶ� ... �̸�,, ������ ������ 
					  // ���������� �ᵵ ���� ������ �䱸����... ����
	public Book(String n, int p) {
		
		name = n;
		price = p;
	}
	
	public void bookInfo() {
		System.out.println("å�̸� : " + name + " , å���� : " + price );
	}
	
	
	
	
	
	
}
