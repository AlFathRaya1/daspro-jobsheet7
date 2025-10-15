import java.util.Scanner;
public class pengelolaBioskop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket, totalTiket = 0;
        double totalPenjualan = 0;
        final int hargaTiket = 50000;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang ingin dibeli (ketik '0' untuk berhenti): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid, coba lagi");
                continue;
            }
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            }else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalHarga = jumlahTiket * hargaTiket * (1 - diskon);
            System.out.println("total harga yang dibayarkan pelanggan :Rp " + totalHarga     );

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;
        }
        System.out.println("---------- REKAP PENJUALAN TODAY ----------");
        System.out.println("total tiket kejual : " + totalTiket);
        System.out.println("total penjualan " + totalPenjualan);

        sc.close();



    }
}