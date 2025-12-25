import java.util.Scanner;

public class tugas {
    
public static int hitungIteratif(int n, Scanner scanner) {
        int total = 0;
        
       
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = scanner.nextInt();
            total += angka; 
        }
        
        return total;
    }

   public static int hitungRekursif(int n, Scanner scanner) {
        // Base Case: Jika n = 0, berhenti dan kembalikan 0
        if (n == 0) {
            return 0;
        }

      
        System.out.print("Masukkan angka ke-" + n + ": ");
        int angka = scanner.nextInt();
        return angka + hitungRekursif(n - 1, scanner);
    }

   
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = scanner.nextInt();

     
        System.out.println("\nPilih Metode:");
        System.out.println("1. Iteratif (Looping)");
        System.out.println("2. Rekursif");
        System.out.print("Pilihanmu (1/2): ");
        int pilihan = scanner.nextInt();

        int totalNilai = 0;

      
        if (pilihan == 1) {
            System.out.println("\n--- Mode Iteratif ---");
            totalNilai = hitungIteratif(n, scanner);
        } else if (pilihan == 2) {
            System.out.println("\n--- Mode Rekursif ---");
            totalNilai = hitungRekursif(n, scanner);
        } else {
            System.out.println("Pilihan salah, menjalankan Iteratif default.");
            totalNilai = hitungIteratif(n, scanner);
        }

    System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + totalNilai);

     }
}
    

