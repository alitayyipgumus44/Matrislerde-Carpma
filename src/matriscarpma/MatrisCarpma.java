package matriscarpma;

import java.util.Scanner;

public class MatrisCarpma {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in, "ISO-8859-9");

        System.out.print("1.Matrisinizin Satır Sayısını Giriniz: ");
        int satir1 = giris.nextInt();
        System.out.println();

        System.out.print("1.Matrisinizin Sütun Sayısını Giriniz: ");
        int sutun1 = giris.nextInt();
        System.out.println();

        System.out.print("2.Matrisinizin Satır Sayısını Giriniz: ");
        int satir2 = giris.nextInt();
        System.out.println();

        System.out.print("2.Matrisinizin Sütun Sayısını Giriniz: ");
        int sutun2 = giris.nextInt();
        System.out.println();

        if (sutun1 == satir2) {
            int[][] matris1 = new int[satir1][sutun1];
            int[][] matris2 = new int[satir2][sutun2];
            int[][] sonucMatrisi = new int[satir1][sutun2];

            for (int i = 0; i < satir1; i++) {
                for (int t = 0; t < sutun1; t++) {
                    System.out.print("1.Matrisinizin " + (i + 1) + ".Satır " + (t + 1) + ".Sütunu Giriniz: ");
                    matris1[i][t] = giris.nextInt();
                }
                System.out.println();
            }
            System.out.println();

            for (int i = 0; i < satir2; i++) {
                for (int t = 0; t < sutun2; t++) {
                    System.out.print("2.Matrisinizin " + (i + 1) + ".Satır " + (t + 1) + ".Sütunu Giriniz: ");
                    matris2[i][t] = giris.nextInt();
                }
                System.out.println();
            }
            System.out.println();

            System.out.println("1.Matris: ");

            int f = 0;
            for (int x = 0; x < satir1; x++) {
                for (int y = 0; y < sutun1; y++) {
                    System.out.print("\t" + matris1[x][y]);
                    f++;
                    if (f == sutun1) {
                        System.out.println("\n");
                        f = 0;
                    }
                }
            }

            System.out.println("2.Matris: ");

            for (int x = 0; x < satir2; x++) {
                for (int y = 0; y < sutun2; y++) {
                    System.out.print("\t" + matris2[x][y]);
                    f++;
                    if (f == sutun2) {
                        System.out.println("\n");
                        f = 0;
                    }
                }
            }

            Carpma c = new Carpma();
            c.setSatirSayisi(satir1);
            c.setSutunSayisi(sutun2);
            c.setOrtak(satir2);
            c.matrisCarp(matris1, matris2);
        } else {
            System.out.println("Satır ve Sütun Sayısı Eşleşmediğinden Çarpma İşlemi Yapamazsınız!");
        }
    }
}