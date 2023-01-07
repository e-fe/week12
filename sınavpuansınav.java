package week12;

import java.util.Scanner;
import java.util.Random;

public class sınavpuansınav {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DERS SAYISI");
        int ds = input.nextInt();
        System.out.println("OGRENCİ SAYISI");
        int os = input.nextInt();
        int[] ogrencino = new int[os];
        int[][] notlar = new int[ds][os];
        double[] ort = new double[ds];
        int[][] rapor = new int[ds][4];    // en kucuk not en buyuk not alan ogrencıler

        Random r = new Random();
        for (int i = 0; i < os; i++) {
            ogrencino[i] = (int) (10000 + (20000 - 10000) * r.nextDouble());

        }

        for (int i = 0; i < ds; i++) {
            for (int j = 0; j < os; j++) {
                notlar[i][j] = r.nextInt(100);
                System.out.println(i + " ders icin ogrencı notu : " + j + ".öğrenci notu : " + notlar[i][j]);

            }

        }

        for (int i = 0; i < ds; i++) {
            int toplam = 0;
            for (int j = 0; j < os; j++) {
                toplam += notlar[i][j];

            }
            ort[i] = (double) toplam / os;
            System.out.println(i + ". ders için : " + ort[i]);

        }

        for (int i = 0; i < ds; i++) {
            int max = notlar[i][0], min = notlar[i][0];
            int maxid = 0, minid = 0;
            for (int j = 0; j < os; j++) {
                if (notlar[i][j] > max) {
                    max = notlar[i][j];
                    maxid = ogrencino[j];
                }
                if (notlar[i][j] < min) {
                    min = notlar[i][j];
                    minid = ogrencino[j];
                }
            }
            rapor[i][0] = max;
            rapor[i][1] = maxid;
            rapor[i][2] = min;
            rapor[i][3] = minid;
            System.out.println("en yüksek alan ogrencının notu : " + max + "\n" + " en yüksek alan ogrencının id si : " + maxid + "\n" + " en dusuk alan ogrencının notu : " + min + "\n" + " en dusuk alan ogrencının id si : " + minid);

        }
    }

}
