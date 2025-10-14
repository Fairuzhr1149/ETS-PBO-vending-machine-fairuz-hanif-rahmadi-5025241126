import java.util.Scanner;

public class PaySystem {

    public static boolean prosesPembayaran(int harga) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan uang: Rp ");
        int bayar = input.nextInt();

        if (bayar < harga) {
            System.out.println("❌ Uang tidak cukup. Diperlukan Rp" + harga);
            return false;
        } else if (bayar == harga) {
            System.out.println("✅ Pembayaran berhasil tanpa kembalian.");
            return true;
        } else {
            int kembali = bayar - harga;
            System.out.println("✅ Pembayaran berhasil! Kembalian: Rp" + kembali);
            return true;
        }
    }
}

