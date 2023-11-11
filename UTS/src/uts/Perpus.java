package uts;

public class Perpus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buku novel = new Novel("Harry Potter", "J.K. Rowling", "Fantasy");
        Buku ensiklopedia = new Ensiklopedia("World History", "Various Authors", "Reference");

        User user = new User("Ferika");
        Admin admin = new Admin("Dimas");

        user.lihatBuku(novel);
        user.lihatBuku(ensiklopedia);

        admin.lihatBuku(novel);
        admin.tambahBuku(new Novel("Lord of the Rings", "J.R.R. Tolkien", "Fantasy"));
        admin.hapusBuku(ensiklopedia);
    }
}
