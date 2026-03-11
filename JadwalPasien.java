public class JadwalPasien {

    String idPasien;
    String namaPasien;
    String namaDokter;
    String tanggalPeriksa;
    String jamPeriksa;

    public JadwalPasien(String idPasien, String namaPasien, String namaDokter, String tanggalPeriksa, String jamPeriksa) {
        this.idPasien = idPasien;
        this.namaPasien = namaPasien;
        this.namaDokter = namaDokter;
        this.tanggalPeriksa = tanggalPeriksa;
        this.jamPeriksa = jamPeriksa;
    }

    public void tampilData() {
        System.out.println("ID Pasien        : " + idPasien);
        System.out.println("Nama Pasien      : " + namaPasien);
        System.out.println("Nama Dokter      : " + namaDokter);
        System.out.println("Tanggal Periksa  : " + tanggalPeriksa);
        System.out.println("Jam Periksa      : " + jamPeriksa);
    }
}/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Toshiba
 */
public class JadwalPasien {
    
}
