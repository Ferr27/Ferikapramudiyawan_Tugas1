/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author Malik
 */
public class NilaiMahasiswa {
    String NIM = "2210631170122";
    String Nama = "Ferika Pramudiyawa";
    short NilaiAbsen = 50;
    short NilaiTugas = 75;
    short NilaiUTS = 80;
    short NilaiUAS = 90;

    void CetakNilai() {
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + Nama);
        System.out.println("Nilai Absen[10%] : " + NilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + NilaiTugas);
        System.out.println("Nilai UTS [30%] : " + NilaiUTS);
        System.out.println("Nilai UAS [40%] : " + NilaiUAS);
        double nilaiAkhir = (NilaiAbsen * 0.10) + (NilaiTugas * 0.20) + (NilaiUTS * 0.30) + (NilaiUAS * 0.40);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
}
}
