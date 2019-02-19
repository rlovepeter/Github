import kr.or.bit.Phone;

public class Ex05_Static_Phonemake {

	public static void main(String[] args) {
		Phone p = new Phone();
		
		p.number = 1;
		p.name = "아이폰";
		
		p.h = 30;
		p.w = 50;
		
		p.phoneInfo();
		
		Phone p2 = new Phone();
		
		p2.number = 2;
		p.name = "갤럭시";
		
		p.phoneInfo();

	}

}
