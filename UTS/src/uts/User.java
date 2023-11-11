package uts;

class User extends Pengguna {

    public User(String nama) {
        super(nama);
    }

    public void lihatBuku(Buku buku) {
        System.out.println("User " + getNama() + " melihat buku: " + buku.getJudul());
    }
}
