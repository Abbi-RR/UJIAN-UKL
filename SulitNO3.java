import java.util.Scanner;

public class SulitNO3 { 
    public static void main(String[] args) {
        Scanner Duar = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: "); 
        int abi = Duar.nextInt();
        int[] array = new int[abi]; 
        System.out.println("Masukkan elemen array:");
        for (int wowo = 0; wowo < abi; wowo++) {
            array[wowo] = Duar.nextInt();
        }
        for (int wowo = 0; wowo < abi; wowo++) { 
            int c = 1; 
            if (array[wowo] != -1) { 
                for (int j = wowo + 1; j < abi; j++) {
                    if (array[wowo] == array[j]) {
                        c++;
                        array[j] = -1; 
                    }
                }
                System.out.println(array[wowo] + " muncul " + c + " kali");
            }
        }
        Duar.close();
    }
}