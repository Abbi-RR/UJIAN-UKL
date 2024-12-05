import java.util.Scanner;

public class SulitNO1 {
    public static void main(String[] args) {
        int SISWA, JUMLAHSISWA, NILAISISWA = 0, temp = 0;
        double TotalNilai, RataRata;
        Scanner GUEGANTENG = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Siswa: ");
        JUMLAHSISWA = GUEGANTENG.nextInt();

        SISWA = 1;
        while (SISWA <= JUMLAHSISWA) {
            System.out.println("Masukkan Nilai Siswa");
            NILAISISWA = GUEGANTENG.nextInt();
            temp += NILAISISWA;
            SISWA++;
        }
        TotalNilai = temp;
        RataRata = (double) temp / JUMLAHSISWA;
        System.out.println("===========================");
        System.out.println("TOTAL NILAI : " + TotalNilai);
        System.out.println("Rata Rata Nilai : " + RataRata);

        GUEGANTENG.close();
    }
}
