package week12;

import java.util.Scanner;

public class hwmartisdesondanoncekisatirsutuntoplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("NXN İÇİN DEGER : ? ");
        int N = input.nextInt();
        int[][] A = new int[N][N];
        int top = 0 ;
        for (int i = 0; i < N; i++) {
            int x = i + 1;
            for (int j = 0; j < N; j++) {
                int y = j + 1;
                System.out.println("A NIN " + x + " . SATIRI" + y + " . SÜTUNU : ");
                A[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i==N-2 || j==N-2) {
                    top += A[i][j];
                    System.out.println(top);
                    
                    
                    
                }
            }
        }
    }
    
}
