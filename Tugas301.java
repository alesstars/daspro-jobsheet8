import java.util.Scanner;

public class Tugas301 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jmlToko = sc.nextInt();

        if (jmlToko < 1) {
            System.out.print("Jumlah toko minimal harus 1!");
        } else {
            int barangSeluruhToko = 0, maxBarang = -1, tokoTerbanyak= 0;
            String rekapToko = "";

            for (int i = 1; i <= jmlToko; i++) {
                int jmlPelanggan = -1;

                while (jmlPelanggan < 0) {
                    System.out.print("Masukkan jumlah pelanggan di toko ke-" + i + ": ");
                    jmlPelanggan = sc.nextInt();

                    if (jmlPelanggan < 0) {
                        System.out.println("Jumlah pelanggan tidak valid. Ulangi input!");
                    }

                }

                int barangPerToko = 0;

                for (int j = 1; j <= jmlPelanggan; j++) {
                    int jmlBarang = -1;

                    while (jmlBarang < 0) {
                        System.out.print("Jumlah barang yang dibeli pelanggan ke-" + j + " di toko ke-" + i + ": ");
                        jmlBarang = sc.nextInt();

                        if (jmlBarang < 0) {
                            System.out.println("Jumlah barang tidak valid. Ulangi input!");
                        }

                    }

                    barangPerToko += jmlBarang;

                }

                barangSeluruhToko += barangPerToko;

                if (barangPerToko > maxBarang) {
                    maxBarang = barangPerToko;
                    tokoTerbanyak = i;
                }

                rekapToko += "Toko " + i + " - pelanggan: " + jmlPelanggan + ", total barang: " + barangPerToko + "\n";

            }

            System.out.println();
            System.out.print(rekapToko);
            System.out.println("Total barang seluruh toko: " + barangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        }

        sc.close();

    }
}