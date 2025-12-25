import java.util.Scanner;

public class percobaan3 {
    static double hitunglaba(double saldo, int tahun){
        if (tahun==0){
            return saldo;}
        else{ return (1.11*hitunglaba(saldo, tahun-1));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan saldo awal : ");
        double saldo = input.nextDouble();
        System.out.println("Masukkan lama tahun : ");
        int tahun = input.nextInt();
        System.out.println ("Saldo setelah " + tahun + " tahun adalah : " + hitunglaba(saldo, tahun));
    }
}
