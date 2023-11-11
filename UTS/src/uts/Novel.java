package uts;

class Novel extends Buku {

    public Novel(String judul, String penulis, String genre) {
        super(judul, penulis, genre);
    }

    public void informasiBuku() {
        System.out.println("Novel: " + getJudul() + " oleh " + getPenulis() + ", Genre: " + getGenre());
    }
}
