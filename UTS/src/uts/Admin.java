package uts;

class Admin extends Pengguna {

    public Admin(String nama) {
        super(nama);
    }

    public void tambahBuku(Buku buku) {
        System.out.println("Admin " + getNama() + " menambahkan buku: " + buku.getJudul());
    }

    public void lihatBuku(Buku buku) {
        System.out.println("Admin " + getNama() + " melihat buku: " + buku.getJudul());
    }

    public void hapusBuku(Buku buku) {
        System.out.println("Admin " + getNama() + " menghapus buku: " + buku.getJudul());
    }
}
