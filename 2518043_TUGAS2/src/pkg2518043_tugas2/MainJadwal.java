/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2518043_tugas2;
import java.util.Scanner;
/**
 *
 * @author Toshiba
 */
public class MainJadwal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Pencatatan Jadwal Pemeriksaan ===");

        System.out.print("Masukkan ID Pasien   : ");
        String id = input.nextLine();

        System.out.print("Masukkan Nama Pasien : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tanggal     : ");
        String tanggal = input.nextLine();

        System.out.print("Masukkan Jam         : ");
        String jam = input.nextLine();

        System.out.print("Masukkan Dokter      : ");
        String dokter = input.nextLine();

        // Membuat objek menggunakan konstruktor
        JadwalPemeriksaan jp = new JadwalPemeriksaan(id, nama, tanggal, jam, dokter);

        // Menampilkan data
        System.out.println("\nData Jadwal Pemeriksaan:");
        System.out.println(jp.tampilkan());
    }
}