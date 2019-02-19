/*
���Ǽ��� .... ���赵�� ������ ... (������)

�������� ���赵 �ۼ��� .....(������)

������
��Ӱ��� (is ~ a : ���) �� ~�̴� (�θ����� �ڷ�)
>>���� �����̴� (0)
>>�簢���� �����̴� (0)

���԰��� (has ~ a : ����) �� ~�� ������ �ִ�
>>���� ������ ������ �ִ�(x)
>>�簢���� ������ ������ �ִ�(x)
----------------------------------
��Ŭ����

����Ŭ����

>>��� (�� extends ����)

���� ���̴� (x)
���� ����(x,y)
���� ���� ������ �ִ� (has ~ a) ���԰���
>> class �� { �� ������;}


����  , ��
������ ���̴�  (is ~ a)(x)
������ ���� ������ �ִ�(has ~ a) (o)
class ����{}
class ��{}

class ����  { �� gun;   }
--------------------------------------------
���� ��� 
�� , �簢�� , �ﰢ���� ����� ���踦 �ۼ��ϰ� �;��


�� : ������ ������ , �׸���, ����
�ﰢ�� : ������ �� , �׸���, ����
�簢�� : �װ��� �� , �׸���, ����
�� : (x,y)

����
���� �����̴�
�ﰢ���� �����̴�
�簢���� �����̴�

���� : (�Ϲ�ȭ , �߻�ȭ) �и� : ���� , �׸��� 
�� (��üȭ, Ư��ȭ) -> �� , ������

�� ����(x,y)
���� ���̴� ...(x)
�ﰢ���� ���̴�..(x)

���� ���� ������ �ִ�
�ﰢ����  ���� ������ �ִ�
�簢���� ���� ������ �ִ�
(has ~ a )


�Ϲ�ȭ,�߻�ȭ(����и�) : shape (����, �׸���) 
                      : point(x , y)
class Shape{}
class Point{}                      

��üȭ , Ư��ȭ( circle , triangle)

*/
//�߻�ȭ , �Ϲ�ȭ
class Shape{
	String color="gold";
	void draw() {
		System.out.println("������ �׸���");
	}
}

class Point{
	int x;
	int y;
	
	Point(){
		//this.x = 1;
		//this.y = 2;
		this(1,2); //�����ڸ� ȣ���ϴ� this
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

//���� ���弼��(���� : ������ �������� ������ �ִ� ���� ������ ������ �ְ� ...)
//���� �����̴� (is  ~ a) extends
//���� ���� ������ �ִ�(has ~ a) ��������

//���� Ư����,��ü�� : ������

class Circle extends Shape{
	Point center; //member field(��ǰ) has ~a
	int r; //member field (Ư����, ��üȭ)
	
	public Circle() {
		this.center = new Point(5, 8);
		this.r = 10;
	}
	public Circle(Point center , int r) {
		this.center = center;
		this.r = r;
	}
}
//���� 1)
//�ﰢ�� Ŭ���� ���弼��
//���� : �ﰢ���� 3���� ���� ���� �׸��� �׸��ٶ�� ����� ������ �ִ�
//Shape, point Ȱ���ؼ� �۾� �ϼ���
//3���� (x,y) , (x,y) , (x,y) �ǹ�
//default �ﰢ���� �׸��� �ְ� 3���� ��ǥ���� �޾Ƽ� �׸��� �׸� �� �� �ִ�
//Triangle

class Triangle extends Shape {
	Point x; //����Ÿ�� (�ʱ�ȭ : �ּҰ�...)
	Point y;
	Point z;
	
	public Triangle() {
		//x = new Point(10, 20);
		//y = new Point(30, 40);
		//z = new Point(50, 60);
		this(new Point(10, 20),new Point(30, 40) ,new Point(50, 60));
	}
	
	public Triangle(Point x, Point y , Point z) {
		this.x = x; //�� ���� �ּҰ� (Point)
		this.y = y;
		this.z = z;
	}
	
	public void trianglePoint() {
		System.out.printf("x :(%d,%d)",x.x , x.y);
		System.out.printf("y :(%d,%d)",y.x , y.y);
		System.out.printf("z :(%d,%d)",z.x , z.y);
	}
}





class Triangle2 extends Shape {
	Point[] pointarray; //����Ÿ�� (�ʱ�ȭ : �ּҰ�...)
		
	public Triangle2() {
		//Point[] parray = new Point[]{new Point(1,2),,,}
		//pointarray =  new Point[3] {};
		this(new Point[] {new Point(1,2), new Point(3,4), new Point(5,6)});
	}
	public Triangle2(Point[] pointarray) {
		this.pointarray = pointarray;
	}
	public void trianglePoint() {
		for(Point point : pointarray) {
			System.out.println("��ǥ : " + point.x + ", " + point.y);
		}
	}
}






public class Ex02_Inherit_Composite {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		System.out.println(c.color);
		System.out.println(c.r);
		System.out.println(c.center.x);
		System.out.println(c.center.y);
		
		Point point = new Point(10, 15);
		Circle c2 = new Circle(point, 20);
		System.out.println(c2.color);
		System.out.println(c2.r);
		System.out.println(c2.center.x);
		System.out.println(c2.center.y);
		c2.draw();
		
		
		Triangle tri = new Triangle();
		tri.trianglePoint();
		tri.draw();
		
		Triangle tri2 = new Triangle(new Point(1,2),new Point(3,4), new Point(5,6));
		tri2.trianglePoint();
		tri2.draw();
		
		
		Triangle2 tri3 = new Triangle2();
		tri3.trianglePoint();
		
		//Point[] point2 = new Point[3];
		Point[] point2 = {new Point(1,2), new Point(3,4) , new Point(5,6) };
		Triangle2 tri4 = new Triangle2(point2);
		tri4.trianglePoint();
	}

}


