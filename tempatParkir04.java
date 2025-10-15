import java.util.Scanner;
public class tempatParkir04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int jenis, durasi;
        int total = 0;

        while (true) {
            System.out.println("--- JENIS KENDARAAN ---");
            System.out.print("Jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            }
            if (jenis != 1 && jenis != 2) {
                System.out.println("INPUT TIDAK VALID! silahkan masukan input yang benar");
                continue;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                total += 12500;
            }else if (jenis == 1) {
                total += durasi * 3000;
                //MOBIL
            }else if (jenis == 2) {
                total += durasi * 2000;
                //MOTOR
            }
            System.out.println("Total sementara: Rp " + total + "\n");
        }
        System.out.println("-------------------------------------");
        System.out.println("TOTAL PEMBAYARAN PARKIR TODAY : Rp " + total);
        System.out.println("THANK YOU!!");
        sc.close();
    }
}