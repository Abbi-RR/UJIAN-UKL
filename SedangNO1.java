import java.util.Scanner;

public class SedangNO1 {
    public static void main(String[] args) {
        Scanner ABBI = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = ABBI.nextInt();

        if (bilangan < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            int faktorial = 1;
            for (int i = 1; i <= bilangan; i++) {
                faktorial *= i;
            }

            System.out.println("Faktorial dari " + bilangan + " adalah " + faktorial);
        }

        ABBI.close();
    }
}
