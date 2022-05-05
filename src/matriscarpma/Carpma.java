package matriscarpma;

public class Carpma extends Islem {
    
    @Override
    void matrisCarp(int matris1[][], int matris2[][]) {
        int sonucMatrisi[][] = new int[getSatirSayisi()][getSutunSayisi()];
        System.out.println("Çarpım Matrisi: ");

        for (int i = 0; i < getSatirSayisi(); i++) {
            for (int j = 0; j < getSutunSayisi(); j++) {
                sonucMatrisi[i][j] = 0;
                for (int k = 0; k < getOrtak(); k++) {
                    sonucMatrisi[i][j] += matris1[i][k] * matris2[k][j];
                } 
                System.out.print("\t" + sonucMatrisi[i][j]);   
            } 
            System.out.println();   
        }
    }  
}