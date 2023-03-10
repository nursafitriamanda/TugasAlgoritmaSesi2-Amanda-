import java.util.Scanner;

public class MenghitungLembarUangKertas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data nominal
        System.out.print("Masukkan nominal: ");
        int nominal = input.nextInt();

        // Hitung jumlah lembar uang kertas
        int lembar50rb = nominal / 50000;
        nominal %= 50000;

        int lembar20rb = nominal / 20000;
        nominal %= 20000;

        int lembar5rb = nominal / 5000;
        nominal %= 5000;

        int lembar2rb = nominal / 2000;
        nominal %= 2000;

        int lembar1rb = nominal / 1000;
        nominal %= 1000;


        int keping500 = nominal / 500;

        // Output hasil perhitungan
        System.out.println(lembar50rb + " lembar 50ribuan");
        System.out.println(lembar20rb + " lembar 20ribuan");
        System.out.println(lembar5rb  + " lembar 5ribuan");
        System.out.println(lembar2rb  + " lembar 2ribuan");
        System.out.println(lembar1rb  + " lembar 1ribuan");
        System.out.println(keping500 + " keping 500an");
    }
}