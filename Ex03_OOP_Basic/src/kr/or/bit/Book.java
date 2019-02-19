package kr.or.bit;
/*
책은 책이름과 가격을 가지고 있다 
책이 출판되면 반드시 책은 책의 이름과 가격을 가지고 있어야 한다.
책의 이름과 가격 정보는 특정 기능을 통해서만 볼 수 있고 출판된 이후에는 수정 불가 
책이름과 가격정보는 각각 정보를 읽을 수 있다 
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

	//public Book(){} 반드시... 책이 생성될때 ... 이름,, 가격을 가져야 
					  // 문법적으로 써도 문제 없지만 요구사항... 위배
	public Book(String n, int p) {
		
		name = n;
		price = p;
	}
	
	public void bookInfo() {
		System.out.println("책이름 : " + name + " , 책가격 : " + price );
	}
	
	
	
	
	
	
}
