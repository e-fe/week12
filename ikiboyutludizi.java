package week12;

import java.util.Scanner;

public class ikiboyutludizi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("SATIR SAYISI");
        int row = input.nextInt();
        System.out.println("SÜTUN SAYISI");
        int col = input.nextInt();
        int[][] A = new int[row][col];
        int[][] B = new int[row][col];
        //int [] su  = new int [row];
        //int [] sa  = new int [col];    
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("A NIN "+i+" . SATIRI "+j+" . SÜTUNU : ");
                A [i][j] = input.nextInt();
                System.out.print("B NİN "+i+" . SATIRI "+j+" . SÜTUNU : ");
                B[i][j] = input.nextInt();
            }

        }
        int [][] C = new int [row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                C [i][j] = A [i][j] + B [i][j];
                
            }
            
            
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("DİZİ 3 ÜN "+i+". satırı "+j+". sütunu toplamı : "+ C[i][j]);
                
            }
            
        }
        
        

    }

}
