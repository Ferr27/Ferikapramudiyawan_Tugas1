package uts;

class Ensiklopedia extends Buku {

    public Ensiklopedia(String judul, String penulis, String genre) {
        super(judul, penulis, genre);
    }

    public void informasiBuku() {
        System.out.println("Ensiklopedia: " + getJudul() + " oleh " + getPenulis() + ", Genre: " + getGenre());
    }
}
