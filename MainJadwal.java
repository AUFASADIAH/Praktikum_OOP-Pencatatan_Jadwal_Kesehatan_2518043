import java.util.Scanner;

public class MainJadwal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String idPasien, namaPasien, namaDokter, tanggalPeriksa, jamPeriksa;

        System.out.println("SISTEM PENCATATAN JADWAL PEMERIKSAAN PASIEN");

        
        idPasien = "1001";

        namaPasien = "Aufa";

        
        namaDokter = "putri";

        tanggalPeriksa = "3 Desember";

        jamPeriksa = "18.00";

        JadwalPasien pasien1 = new JadwalPasien(idPasien, namaPasien, namaDokter, tanggalPeriksa, jamPeriksa);

        System.out.println("\nDATA JADWAL PASIEN");
        pasien1.tampilData();
    }
}/*