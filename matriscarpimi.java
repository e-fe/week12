package week12;

import java.util.Scanner;

public class matriscarpimi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("A NIN SATIR SAYISI");
        int row = input.nextInt();
        System.out.println("A NIN SÜTUN SAYISI");
        int col = input.nextInt();
        int[][] A = new int[row][col];
        System.out.println("B NİN SATIR SAYISI");
        int row2 = input.nextInt();
        System.out.println("B NİN SÜTUN SAYISI");
        int col2 = input.nextInt();
        int[][] B = new int[row][col];
        System.out.println("A MATRİSİ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("A NIN " + i + " . SATIRI " + j + " . SÜTUNU : ");
                A[i][j] = input.nextInt();
                
            }

        }
        System.out.println("B MATRİSİ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print("B NIN " + i + " . SATIRI " + j + " . SÜTUNU : ");
                B[i][j] = input.nextInt();
                
            }

        }
        System.out.println("AXB MATRİSİ");
        int C [][] = new int [row][col2];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k <col2; k++) {
                    C[i][j] += A[k][j] * B[k][j];
                    
                }
                
                
            }
            
        }
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.println(C[i][j]+" ");
                
            }
            
        }
            
        }
        
    }




