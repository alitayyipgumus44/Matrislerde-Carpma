package matriscarpma;

public abstract class Islem {
    
    private int satirSayisi, sutunSayisi, ortak;

    abstract void matrisCarp(int matris1[][], int matris2[][]);    
    
    public int getOrtak() {
        return ortak;
    }

    public void setOrtak(int ortak) {
        this.ortak = ortak;
    }

    public int getSatirSayisi() {
        return satirSayisi;
    }

    public void setSatirSayisi(int satirSayisi) {
        this.satirSayisi = satirSayisi;
    }

    public int getSutunSayisi() {
        return sutunSayisi;
    }

    public void setSutunSayisi(int sutunSayisi) {
        this.sutunSayisi = sutunSayisi;
    }

}
