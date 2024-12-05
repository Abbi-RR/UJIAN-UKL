import java.util.Scanner;

public class MudahNO1 {
    public static void main(String[] args) {
        Scanner AbiGTG = new Scanner(System.in);

        System.out.print("Masukkan Berat Paket (Kg): ");
        double Berat = AbiGTG.nextDouble();

        System.out.print("Masukkan Jarak Tempuh (Km): ");
        double Jarak = AbiGTG.nextDouble();

        System.out.print("Masukkan Panjang Paket (cm): ");
        double Panjang = AbiGTG.nextDouble();

        System.out.print("Masukkan Lebar Paket (cm): ");
        double Lebar = AbiGTG.nextDouble();

        System.out.print("Masukkan Tinggi Paket (cm): ");
        double Tinggi = AbiGTG.nextDouble();

        double VOLUME = Panjang * Lebar * Tinggi;

        double BiayaPerKg;
        if (Jarak <= 10) {
            BiayaPerKg = 4250;
            System.out.println("\n===========================================================");
            System.out.println("Biaya Per Kg untuk Jarak <= 10 Km adalah Rp 4.250");
        } else {
            BiayaPerKg = 6000;
            System.out.println("\n===========================================================");
            System.out.println("Biaya Per Kg untuk Jarak > 10 Km adalah Rp 6.000");
        }

        double BiayaDasar = Berat * BiayaPerKg;

        double BiayaTambahan = 0;
        if (VOLUME > 200) {
            BiayaTambahan = 100000;
            System.out.println("Volume barang adalah: " + VOLUME + " cm³");
            System.out.println("Volume barang di atas 200 cm³ dikenakan biaya tambahan Rp 100.000");
        } else if (VOLUME == 150) {
            BiayaTambahan = 50000;
            System.out.println("Volume barang adalah: " + VOLUME + " cm³");
            System.out.println("Volume barang sama dengan 150 cm³ dikenakan biaya tambahan Rp 50.000");
        } else if (VOLUME < 100) {
            System.out.println("Volume barang adalah: " + VOLUME + " cm³");
            System.out.println("Tidak dikenakan biaya tambahan");
        } else {
            System.out.println("Volume barang adalah: " + VOLUME + " cm³");
            System.out.println("Tidak ada biaya tambahan");
        }

        double TotalBiaya = BiayaDasar + BiayaTambahan;
        System.out.println("\n===========================================================");
        System.out.println("Total Biaya Pengiriman: Rp " + TotalBiaya);

        AbiGTG.close();
    }
}
