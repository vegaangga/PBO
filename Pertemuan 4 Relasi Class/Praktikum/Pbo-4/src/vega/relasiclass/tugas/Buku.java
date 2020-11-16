
package vega.relasiclass.tugas;

public class Buku {
    public String nobuk;
    public String judul;
    public String author;

    public Buku(String nobuk, String judul, String author) {
        this.nobuk = nobuk;
        this.judul = judul;
        this.author = author;
    }

    public String getNobuk() {
        return nobuk;
    }

    public void setNobuk(String nobuk) {
        this.nobuk = nobuk;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
     
    public String info (){
        String info = "";
        info += "No Buku: " + nobuk + "\n";
        info += "Judul: " + judul + "\n";
        info += "Author: " + author + "\n";
        return info;
    }
}
