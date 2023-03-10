import java.util.Scanner;

public class GajiBulanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data gaji, jam lembur, dan upah lembur
        System.out.print("Masukkan gaji: ");
        double gaji = input.nextDouble();

        System.out.print("Masukkan jam lembur: ");
        int jamLembur = input.nextInt();

        System.out.print("Masukkan upah lembur: ");
        double upahLembur = input.nextDouble();
 
        // Hitung gaji dan lembur
        double gajiBulanan = gaji + (jamLembur * upahLembur);

        // Output hasil perhitungan
        System.out.println("Gaji bulanan anda adalah: " + gajiBulanan);
    }
}