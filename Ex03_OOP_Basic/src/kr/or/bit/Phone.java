package kr.or.bit;

public class Phone {
	
	public int number;
	public String name;
	
	public static int h;
	public static int w;
	
	public void phoneInfo() {
		System.out.printf("번호 : [%d] , 종류 : [%s] , 높이 : [%d] , 너비 : [%d]\n",number,name,h,w);
	}

}
