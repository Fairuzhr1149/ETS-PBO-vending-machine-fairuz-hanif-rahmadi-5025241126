public class Main {
    public static void main(String[] args) {
        
        Produk.addProduk(new Produk("Chitato", 10000, 5));
        Produk.addProduk(new Produk("Coca-Cola", 8000, 3));
        Produk.addProduk(new Produk("Oreo", 6000, 4));
        Produk.addProduk(new Produk("Aqua", 5000, 5));

        
        VendingScreen.vendingMenu();
    }
}

