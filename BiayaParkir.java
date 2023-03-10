import java.util.Scanner;

public class BiayaParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data jam masuk, jam keluar, dan biaya per jam
        System.out.print("Masukkan jam masuk: ");
        int jamMasuk = input.nextInt();

        System.out.print("Masukkan jam keluar: ");
        int jamKeluar = input.nextInt();

        System.out.print("Masukkan biaya per jam: ");
        int biayaPerJam = input.nextInt();

        // Hitung biaya parkir
        int durasi = jamKeluar - jamMasuk;
        int biayaParkir = durasi * biayaPerJam;

        // Output hasil perhitungan
        System.out.println("Biaya parkir anda adalah: " + biayaParkir);
    }
}