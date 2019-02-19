package kr.or.bit;
 
import java.util.Random;
import java.util.Scanner;
 
public class Lotto {
    private Scanner scanner;
    private Random r; 
    private int[] numbers;
             
    public Lotto() {
        scanner = new Scanner(System.in); 
        r = new Random();
        numbers = new int[6];
    }
   
   private String showMenu(Scanner scanner) {
       System.out.println("*********************");
       System.out.println("1. 당첨 예상 번호 추출:");
       System.out.println("2. 종료.^^!");
       System.out.println("*********************");
       System.out.print("당신이 원하는 번호를 선택:");
       String selectionnum = scanner.nextLine();
       return selectionnum;
   } 
    
   public void selectLottoNumber() {
      
A: while(true) {
           String selectionnum = showMenu(scanner);
           switch (selectionnum) {
                   case "1": 
                         
                               selectBasicLottoNumber(r,numbers); 
                           
                            showLottoNumbers(numbers); 
                       break;
                   case "2": System.out.println("Good Lucky");
                       break A; 
                   default :
                       System.out.println("Not Operation");
                       break;
               }    
       }
       
   }
   
   private void  selectBasicLottoNumber(Random r , int[] numbers) {
      
       for (int i = 0; i < 6; i++) {
           numbers[i] = r.nextInt(45)+1; 
          for (int j = 0; j < i; j++) {
              if (numbers[i] == numbers[j]) {
                  i--; 
                  break;
              }
           }
        }
   }
   
   private void showLottoNumbers(int[] numbers) {
       for (int i = 0; i < numbers.length; i++) {
           for (int j = i + 1; j < numbers.length; j++) {
               if (numbers[i] > numbers[j]) {
                   int temp = numbers[i];
                   numbers[i] = numbers[j];
                   numbers[j] = temp;
               }
           }
       }
       for(int i = 0 ; i < numbers.length ; i++) {
           System.out.printf("[%2d]",numbers[i]);
       }
       System.out.println();
   }
   

   
}