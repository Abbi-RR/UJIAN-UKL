import java.util.Scanner;
import java.util.Random;

public class SedangNO3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean bermain = true;

        while (bermain) {
            
            int bilangan1 = random.nextInt(10) + 1; 
            int bilangan2 = random.nextInt(10) + 1;
            int operator = random.nextInt(3); // 0 untuk *, 1 untuk /, 2 untuk %

            String simbol = "";
            int jawabanBenar = 0;

            if (operator == 0) {
                simbol = "*";
                jawabanBenar = bilangan1 * bilangan2;
            } else if (operator == 1) {
                simbol = "/";
                jawabanBenar = bilangan1 / bilangan2;
            } else {
                simbol = "%";
                jawabanBenar = bilangan1 % bilangan2;
            }

            System.out.print(bilangan1 + " " + simbol + " " + bilangan2 + " = ");
            int jawabanUser = scanner.nextInt();

           
            if (jawabanUser == jawabanBenar) {
                System.out.println("Benar!");
            } else {
                System.out.println("Salah! Jawaban yang benar adalah: " + jawabanBenar);
            }
            
            System.out.print("Ingin berhenti? (ya/tidak): ");
            String keputusan = scanner.next();
            if (keputusan.equalsIgnoreCase("ya")) {
                bermain = false;
            }
        }

        System.out.println("Terima kasih sudah bermain!");
        scanner.close();
    }
}
