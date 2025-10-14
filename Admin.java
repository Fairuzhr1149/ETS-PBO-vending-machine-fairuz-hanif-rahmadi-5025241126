import java.util.Scanner;

public class Admin {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static void loginAdmin() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan username admin: ");
        String user = input.nextLine();
        System.out.print("Masukkan password: ");
        String pass = input.nextLine();

        if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
            System.out.println("✅ Login berhasil. Selamat datang, admin.");
            adminMenu();
        } else {
            System.out.println("❌ Login gagal. Username atau password salah.");
        }
    }

    public static void adminMenu() {
        Scanner input = new Scanner(System.in);
        boolean stay = true;

        while (stay) {
            System.out.println("\n=== Menu Admin ===");
            System.out.println("1. Lihat semua produk");
            System.out.println("2. Refill stok produk");
            System.out.println("3. Lihat laporan transaksi");
            System.out.println("4. Logout");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    Produk.displayProduk();
                    break;
                case 2:
                    Produk.displayProduk();
                    System.out.print("Masukkan nama produk yang akan di-refill: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan jumlah tambahan stok: ");
                    int jumlah = input.nextInt();
                    Produk.refillProduk(nama, jumlah);
                    break;
                case 3:
                    Produk.tampilkanTransaksi();
                    break;
                case 4:
                    System.out.println("Logout berhasil.");
                    stay = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

