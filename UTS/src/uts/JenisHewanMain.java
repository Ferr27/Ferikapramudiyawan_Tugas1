package uts;

import java.util.Scanner;

public class JenisHewanMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis hewan (Kucing/Anjing) : ");
        String jenisHewan = scanner.nextLine();

        Hewan hewan;

        if (jenisHewan.equals("Kucing")) {
            hewan = new Kucing();
        } else if (jenisHewan.equals("Anjing")) {
            hewan = new Anjing();
        } else {
            System.out.println("Jenis hewan tidak dikenal");
            return;
        }

        System.out.print("Suara hewan : ");
        hewan.bersuara();

        if (hewan instanceof Kucing || hewan instanceof Anjing) {
            System.out.println("Hewan ini adalah mamalia");
        } else {
            System.out.println("Hewan ini bukan mamalia");
        }
    }
}
