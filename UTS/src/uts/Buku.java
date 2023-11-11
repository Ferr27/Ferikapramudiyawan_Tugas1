package uts;

abstract class Buku {

    private String judul;
    private String genre;
    private String penulis;

    public Buku(String judul, String penulis, String genre) {
        this.judul = judul;
        this.penulis = penulis;
        this.genre = genre;
    }

    public abstract void informasiBuku();

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }
}
