package kr.or.bit;

import javax.swing.text.StyledEditorKit.BoldAction;

/*
�䱸��������
Tv�� ä�������� ������ �ִ�(���� ��� 1~250ä��)
Tv�� �귣�� �̸��� ������ �ִ�(���� ��� �Ｚ ,����)
Tv�� ä�� ��ȯ ����� ������ �ִ�(ä���� �����Ҽ� �ִ� �Ѵܰ辿)
��� 2�� (++  , --)
Tv�� ���������� ������ �ִ� 
Tv�� ������ On �Ҽ� �� �ְ� Off �Ҽ��� �ִ� 
*/
public class Tv {
   public int ch; //public int ch=1;
   public String brandname;
   
   //public int power;
   public boolean power;  //true (on) , false(off)
   
   
   public void ch_up() {
	   //member field ���� ��
	   ch++;
   }
   public void ch_down() {
	   ch--;  
   }
   
   public void power_on() {
	   power = true; //
   }
   
   public void power_off() {
	   power = false;
   }
   
}
