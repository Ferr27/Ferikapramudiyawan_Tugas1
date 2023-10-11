/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

/**
 *
 * @author Malik
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        DataMahasiswa dataMhs = new DataMahasiswa();
        NilaiMahasiswa nilaiMhs = new NilaiMahasiswa();

        // Memanggil method 
        dataMhs.membaca();
        dataMhs.nyontek();
        dataMhs.modifikasi();
        nilaiMhs.CetakNilai();
    }   
}
