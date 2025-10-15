import java.util.ArrayList;

public class Produk {

    private String namaProduk;
    private int harga;
    private int stok;

    public Produk(String namaProduk, int harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    private static ArrayList<Produk> productList = new ArrayList<>();
    public static ArrayList<String> transaksiLog = new ArrayList<>();
    public static int price;

    public static void addProduk(Produk p) {
        productList.add(p);
    }

    public static void displayProduk() {
        System.out.println("\n=== Daftar Produk ===");
        int i = 1;
        for (Produk item : productList) {
            System.out.println(i + ". " + item.namaProduk + " | Harga: " + item.harga + " | Stok: " + item.stok);
            i++;
        }
        System.out.println("=====================");
    }

    public static Produk getProdukByName(String nama) {
        for (Produk item : productList) {
            if (item.namaProduk.equalsIgnoreCase(nama)) {
                return item;
            }
        }
        return null;
    }

    public static void beliProduk(String nama) {
        Produk barang = getProdukByName(nama);

        if (barang == null) {
            System.out.println("Produk tidak ditemukan.");
            return;
        }

        if (barang.stok <= 0) {
            System.out.println("Stok " + nama + " telah habis. Mohon pilih produk lain.");
            return;
        }

        System.out.println("Anda memilih: " + barang.namaProduk + " | Harga: " + barang.harga);
        price = barang.harga;
        boolean success = PaySystem.prosesPembayaran(barang.harga);

        if (success) {
            barang.stok--;
            System.out.println("Terima kasih! Produk " + barang.namaProduk + " telah dikeluarkan.");
            transaksiLog.add(barang.namaProduk + " - Rp" + barang.harga);
        } else {
            System.out.println("Pembayaran gagal. Transaksi dibatalkan.");
        }
    }

    public static void tampilkanTransaksi() {
        System.out.println("\n=== Riwayat Transaksi ===");
        if (transaksiLog.isEmpty()) {
            System.out.println("Belum ada transaksi.");
        } else {
            for (String log : transaksiLog) {
                System.out.println(log);
            }
        }
        System.out.println("==========================");
    }

    public static void refillProduk(String nama, int jumlah) {
        Produk barang = getProdukByName(nama);
        if (barang == null) {
            System.out.println("Produk tidak ditemukan.");
            return;
        }
        barang.stok += jumlah;
        System.out.println("Produk " + barang.namaProduk + " berhasil ditambah stoknya menjadi " + barang.stok);
    }
}

