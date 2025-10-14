import java.util.Scanner;

public class VendingScreen {

    public static void vendingMenu() {
        Scanner scan = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Mesin Penjual Otomatis ===");
            System.out.println("1. Lihat Produk");
            System.out.println("2. Beli Produk");
            System.out.println("3. Login Admin");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scan.nextInt();
            scan.nextLine();

            switch (menu) {
                case 1:
                    Produk.displayProduk();
                    break;
                case 2:
                    Produk.displayProduk();
                    System.out.print("Masukkan nama produk yang ingin dibeli: ");
                    String pilih = scan.nextLine();
                    Produk.beliProduk(pilih);
                    break;
                case 3:
                    Admin.loginAdmin();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan mesin kami!");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

