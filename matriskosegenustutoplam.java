package week12;
import java.util.Scanner;
public class matriskosegenustutoplam {
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
         System.out.println("A NIN SATIR SAYISI");
         int row = input.nextInt();
         System.out.println("A NIN SÜTUN SAYISI");
         int col = input.nextInt();
         int top = 0 ;
         int [][] A = new int [row][col];
         for (int i = 0; i < row; i++) {
             for (int j = 0; j < col; j++) {
                 System.out.print("A NIN " + i + " . SATIRI " + j + " . SÜTUNU : ");
                A[i][j] = input.nextInt();
                 
             }
             
         }
         for (int i = 0; i < row; i++) {
             for (int j = 0; j < col; j++) {
                 if (i<j) {
                     top += A[i][j];
                     
                 }
                 
             }
             
         }
             System.out.println(top);
         
     

    }

}
