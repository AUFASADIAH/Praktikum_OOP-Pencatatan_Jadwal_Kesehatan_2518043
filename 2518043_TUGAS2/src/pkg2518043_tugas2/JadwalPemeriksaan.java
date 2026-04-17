/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2518043_tugas2;

/**
 *
 * @author Toshiba
 */
public class JadwalPemeriksaan {
    String idPasien, namaPasien, tanggal, jam, dokter;

    // Konstruktor
    public JadwalPemeriksaan(String idPasien, String namaPasien, String tanggal, String jam, String dokter) {
        this.idPasien = idPasien;
        this.namaPasien = namaPasien;
        this.tanggal = tanggal;
        this.jam = jam;
        this.dokter = dokter;
    }

    public String tampilkan() {
        return "ID: " + idPasien +
               "\nNama: " + namaPasien +
               "\nTanggal: " + tanggal +
               "\nJam: " + jam +
               "\nDokter: " + dokter +
               "\n----------------------\n";
    }
}
