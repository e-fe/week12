package week12;

import java.util.Scanner;

public class enbuyugubulma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("NXN MATRİSİ İÇİN N DEGERİ");
        int N = input.nextInt();
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("A NIN " + i + " . SATIRI " + j + " . SÜTUNU : ");
                A[i][j] = input.nextInt();

            }

        }
        int maxrow = 0, maxcol = 0, minrow = 0, mincol = 0;
        int maxelement = A[0][0], minelement = A[0][0];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] > maxelement) {
                    maxelement = A[i][j];
                    maxrow = i;
                    maxcol = j;
                }
                if (A[i][j] < minelement) {
                    minelement = A[i][j];
                    minrow = i;
                    mincol = j;
                }
            }
        }
            System.out.println("max element : "+ maxelement+"ve indisi : "+maxrow+","+maxcol);
            System.out.println("min element : "+ minelement+"ve indisi : "+minrow+","+mincol);
    }

}
